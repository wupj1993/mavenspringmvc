/*
 * Copyright (c) 2015 / 7 / 22 4 :17 :5
 * BY:wupeiji
 * QQ:757671834
 *
 */

package w.p.j.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * -------------------------------------
 * Created by wupeji on 2015-07-22 16:17
 * ----------------------------------------
 **/
@Controller
@RequestMapping("/upload")
public class UploadController  {
    @RequestMapping("/file")
    public String upload(HttpServletRequest request,HttpServletResponse response) throws IOException {
        System.out.println("-----");
        InputStream inputStream=request.getInputStream();
        File file=new File("c://","1.txt");
        FileOutputStream fos=new FileOutputStream(file);
        byte [] b=new byte[1024];
        int len=0;
        while ((len=inputStream.read(b))!=-1){
            fos.write(b,0,len);
        }
        fos.flush();
        fos.close();
        inputStream.close();
        return null;
    }
}
