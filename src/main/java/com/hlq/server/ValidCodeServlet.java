package com.hlq.server;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by heliqing on 2016/11/10.
 */
public class ValidCodeServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response){

        BufferedImage image=new BufferedImage(120,30,BufferedImage.TYPE_INT_RGB);
        Graphics  g=image.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0,0,120,30);
        g.setColor(Color.BLUE);
        g.fillRect(1,1,118,29);


    }
}
