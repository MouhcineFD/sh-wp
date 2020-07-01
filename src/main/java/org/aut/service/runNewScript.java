package org.aut.service;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.WinNT;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class runNewScript {
    private Process pr;
    private int pid;
    private Kernel32 kernel;

    public void runNewScript(Date date, String name, String keyword, String source) throws IllegalAccessException, IOException, NoSuchFieldException, InterruptedException {
        final List<String> commands = new ArrayList<String>();
        commands.add("scrapy");
        commands.add("crawl");
        commands.add("amazon");
        commands.add("--set");
        commands.add("JOBDIR=book");

        File dir = new File("C:\\Users\\Souhaila Reggad\\Desktop\\Souhaila\\Souhaila-stage\\projects-Souhaila\\scrapy_amazon\\scrapyproject\\scrapyproject\\spiders");
        ProcessBuilder ps = new ProcessBuilder(commands);
        ps.directory(dir);
        ps.redirectErrorStream(true);
        this.pr = ps.start();
        Field f = pr.getClass().getDeclaredField("handle");
        f.setAccessible(true);
        long handl = f.getLong(pr);
        this.kernel = Kernel32.INSTANCE;

        WinNT.HANDLE hand = new WinNT.HANDLE();
        hand.setPointer(Pointer.createConstant(handl));
        this.pid = this.kernel.GetProcessId(hand);
        f.setAccessible(false);
        System.out.println("line"+  this.pid);

        try (BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()))) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        }
        pr.waitFor();

    }

}
