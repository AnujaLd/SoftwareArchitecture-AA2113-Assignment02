package com.sltc.soa.client;

import com.sltc.soa.client.stub.CurrencyConversionWs;
import com.sltc.soa.client.stub.CurrencyConversionWsService;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: Anuja Dewnim<br/>
 * Date: 12/30/2022<br/>
 */
public class CurrencyConversion {
    public static void main(String[] args) {
        CurrencyConversionWsService currencyConversionWsService = new CurrencyConversionWsService();
        CurrencyConversionWs currencyConversionWs = currencyConversionWsService.getCurrencyConversionWsPort();

        System.out.println("**************");
        System.out.println("Welcome to XoB Currency Conversion System");
        System.out.println("AA2113 \b");
        System.out.println("***************");

        System.out.println( "Please Enter the Source Currency" );
        String sourceCurrency = valueStr();

        System.out.println( "Please Enter the Target Currency" );
        String targetCurrency = valueStr();

        System.out.println( "Please Enter the amount to convert" );
        float amountInSourceCurrency = valuefloat();


        float ans = (float) currencyConversionWs.convert( amountInSourceCurrency, sourceCurrency , targetCurrency);
        System.out.println(ans);

    }
    private static String valueStr()
    {
        Scanner scan = new Scanner( System.in );
        String valueinputstr = scan.next();
        return valueinputstr;
    }
    private static float valuefloat()
    {
        Scanner scan = new Scanner( System.in );
        float valueinputfloat = scan.nextFloat();
        return valueinputfloat;
    }

}