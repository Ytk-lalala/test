package com.tiankai.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class OneServletFirst extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        shoppingcarbean sho=new shoppingcarbean();
        int fprice=sho.getFootballprice();
        int bprice=sho.getBasketballprice();
        boolean b=false;
        boolean f=false;
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        out.print("<center><font style='color:red;font-size:26px'>您选购的商品如下：</font></center>");
        out.print("<hr color='red'>");
        request.setCharacterEncoding("utf-8");
        String goods[]=(String[]) request.getParameterValues("item");
        if(goods!=null)
        {
            for(int a=0;a<goods.length;a++)
            {
                if("篮球".equals(goods[a])){
                   b=true;
                    out.print("<br>"+goods[a]+"&nbsp"+"价格为："+bprice);
                }
                else if("足球".equals(goods[a])){
                 f=true;
                    out.print("<br>"+goods[a]+"&nbsp"+"价格为："+fprice);
                }
            }
            if(b&&f){
                out.print("<br>总价为："+(fprice+bprice)+"元");
            }else  if(b){
                out.print("<br>总价为："+bprice+"元");
            }else  if(f){
                out.print("<br>总价为："+fprice+"元");
            }
        }


        }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
