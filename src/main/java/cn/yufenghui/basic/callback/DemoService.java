package cn.yufenghui.basic.callback;

/**
 * @author : yufenghui
 * @date : 2020/1/22 10:04
 * @Description:
 */
public class DemoService {


    public String demo1(String msg) throws DemoException {

        System.out.println("demo1: " + msg);

        return "demo1: " + msg;
    }

    public String demo2(String msg) throws DemoException {

        System.out.println("demo2: " + msg);

        return "demo2: " + msg;
    }


}
