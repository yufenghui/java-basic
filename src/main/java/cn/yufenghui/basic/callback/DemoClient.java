package cn.yufenghui.basic.callback;

/**
 * @author : yufenghui
 * @date : 2020/1/22 10:08
 *
 * 利用callback来包装Exception，避免客户端代码中无休止的try catch
 *
 */
public class DemoClient {

    private static DemoService demoService = new DemoService();

    public static void main(String[] args) {


        String result1 = execute(new DemoServiceCallback() {
            public String callback(DemoService demoService) throws DemoException {

                return demoService.demo1("hello");
            }
        });

        System.out.println("result1: " + result1);

        String result2 = execute(new DemoServiceCallback() {
            public String callback(DemoService demoService) throws DemoException {

                return demoService.demo2("hello");
            }
        });

        System.out.println("result2: " + result2);
    }


    private static String execute(DemoServiceCallback callback) {

        try {
           return callback.callback(demoService);
        } catch (DemoException e) {
            e.printStackTrace();
        }

        return null;
    }

}
