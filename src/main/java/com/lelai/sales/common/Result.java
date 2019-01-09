package com.lelai.sales.common;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author hw
 * @version on 2018/11/20
 */
public class Result {

    private Integer code;
    private String msg;
    private Map dataMap = new HashMap();

    public Result() {
        this.code = Global.RESULT_SUCCESS;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public Object getData(String key) {
        if(dataMap.containsKey(key)){
            return dataMap.get(key);
        }
        return null;
    }

    public void add(String key, Object value) {
        StringTokenizer st = new StringTokenizer(key, ".");
        Map map = this.dataMap;

        String tmpKey;
        for(tmpKey = st.nextToken(); st.hasMoreTokens(); tmpKey = st.nextToken()) {
            if (((Map)map).get(tmpKey) == null || !(((Map)map).get(tmpKey) instanceof Map)) {
                ((Map)map).put(tmpKey, new HashMap());
            }

            map = (Map)((Map)map).get(tmpKey);
        }
        ((Map)map).put(tmpKey, value);
    }


    public boolean remove(String key){
        if(dataMap.containsKey(key)){
            dataMap.remove(key);
            return true;
        }
        return false;
    }

    public String toJsonString() {
        Map map = new HashMap();
        map.put("code", code);
        map.put("msg", msg);
        map.putAll(this.dataMap);
        return JSONObject.toJSON(map).toString();
    }

}
