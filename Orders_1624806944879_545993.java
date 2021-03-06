/*
 * Generated by JasperReports - 6/27/21, 10:15 PM
 */
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.fill.*;

import java.util.*;
import java.math.*;
import java.text.*;
import java.io.*;
import java.net.*;



/**
 *
 */
public class Orders_1624806944879_545993 extends JREvaluator
{


    /**
     *
     */
    private JRFillVariable variable_PAGE_NUMBER = null;


    /**
     *
     */
    public void customizedInit(
        Map pm,
        Map fm,
        Map vm
        )
    {
        initParams(pm);
        initFields(fm);
        initVars(vm);
    }


    /**
     *
     */
    private void initParams(Map pm)
    {
    }


    /**
     *
     */
    private void initFields(Map fm)
    {
    }


    /**
     *
     */
    private void initVars(Map vm)
    {
        variable_PAGE_NUMBER = (JRFillVariable)vm.get("PAGE_NUMBER");
    }


    /**
     *
     */
    public Object evaluate(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 13 : 
            {
                value = "Page "+((java.lang.Integer)variable_PAGE_NUMBER.getValue())+" of"; //$JR_EXPR_ID=13$
                break;
            }
            case 14 : 
            {
                value = " " + ((java.lang.Integer)variable_PAGE_NUMBER.getValue()); //$JR_EXPR_ID=14$
                break;
            }
            case 15 : 
            {
                value = new java.util.Date(); //$JR_EXPR_ID=15$
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


    /**
     *
     */
    public Object evaluateOld(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 13 : 
            {
                value = "Page "+((java.lang.Integer)variable_PAGE_NUMBER.getOldValue())+" of"; //$JR_EXPR_ID=13$
                break;
            }
            case 14 : 
            {
                value = " " + ((java.lang.Integer)variable_PAGE_NUMBER.getOldValue()); //$JR_EXPR_ID=14$
                break;
            }
            case 15 : 
            {
                value = new java.util.Date(); //$JR_EXPR_ID=15$
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


    /**
     *
     */
    public Object evaluateEstimated(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 13 : 
            {
                value = "Page "+((java.lang.Integer)variable_PAGE_NUMBER.getEstimatedValue())+" of"; //$JR_EXPR_ID=13$
                break;
            }
            case 14 : 
            {
                value = " " + ((java.lang.Integer)variable_PAGE_NUMBER.getEstimatedValue()); //$JR_EXPR_ID=14$
                break;
            }
            case 15 : 
            {
                value = new java.util.Date(); //$JR_EXPR_ID=15$
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


}
