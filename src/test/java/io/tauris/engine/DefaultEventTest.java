package io.tauris.engine;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import io.tauris.engine.DefaultEvent;
import io.tauris.engine.TEvent;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;


/**
 * @author Ray Chaung
 */
public class DefaultEventTest {

    public static String readAll(InputStream in) {
        StringBuilder buf = new StringBuilder();

        Reader reader = new InputStreamReader(in);
        try {
            char[] chars = new char[2048];

            while(true) {
                int len = reader.read(chars, 0, chars.length);
                if (len < 0) {
                    return buf.toString();
                }

                buf.append(chars, 0, len);
            }
        } catch (Exception var4) {
            throw new JSONException("read string from reader error", var4);
        }
    }

    @Test
    public void test() throws Exception {

        TEvent e    = new DefaultEvent("testcase");
        String json = StringUtils.join(readAll(getClass().getClassLoader().getResourceAsStream("jsondata.json")), "\n");
        JSONObject data = JSON.parseObject(json);
        data.forEach(e::set);

        Assert.assertEquals("flat", e.get("static"));
        Assert.assertNull(e.get("request.hello.test.4.5"));

        Assert.assertEquals("GET", e.get("request.method"));
        Assert.assertEquals("world", e.get("request.headers.test.hello"));

        Map m = (Map)e.remove("request.headers.test");
        Assert.assertEquals("world", m.get("hello"));

        Assert.assertNull(e.get("request.hello.test"));
        Assert.assertNull(e.get("request.hello.test.2"));
        Assert.assertNull(e.get("request.hello.test.3.4"));

        Assert.assertEquals(2, e.get("request.intarray[1]"));
        Assert.assertEquals("ddd", e.get("request.strarray[3]"));
        Assert.assertEquals("eee", e.get("request.strarray[-1]"));
        Assert.assertEquals("ccc", e.get("request.strarray[-3]"));
        Object mi = e.get("@timestamp.millis");
//        System.out.println(mi);
//        System.out.println(mi.getClass());

        Assert.assertNull(e.get("notexists"));

    }

}
