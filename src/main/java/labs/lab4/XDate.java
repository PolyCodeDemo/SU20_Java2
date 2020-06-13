/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs.lab4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author tiennh
 */
public class XDate {
    private static SimpleDateFormat formatter = new SimpleDateFormat();
    
    public static Date parse(String text, String pattern) throws RuntimeException, ParseException
    {
        try {
            formatter.applyPattern(pattern);
            return formatter.parse(text);
        } catch (RuntimeException runtimeError) {
            throw runtimeError;
        } catch (ParseException parseError) {
            throw parseError;
        }
    }
    
    public static Date parse(String text) throws RuntimeException, ParseException
    {
        return XDate.parse(text, "dd-MM-yyyy");
    }
}
