package com.hw;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

/**
 * @ClassName: Main54
 * @Description: Description
 * @Author: LH
 * @CreateDate: 2022/5/31
 * @UpdateUser: UpdateUser
 * @UpdateDate: 2022/5/31
 * @UpdateRemark: UpdateRemark
 */
public class Main54 {
    public static void main(String[] args) throws ScriptException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replace("[", "(");
        str = str.replace("]", ")");
        str = str.replace("{", "(");
        str = str.replace("}", ")");
        ScriptEngine script = new ScriptEngineManager().getEngineByName("nashorn");
        System.out.println(script.eval(str));
    }
}
