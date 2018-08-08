class page
{
public String pageName;
int pageNumber;
}
package com.jbt;
class VariablesInjava
{
int instanceField;
static String staticField;
public void method()
{
final String localVariable = "Initial Value";
}
public static void main(String arg[])
{
VariablesInjava obj = new VariablesInjava();
System.out.println(obj.instanceField);
System.out.println(obj.instanceField);
System.out.println(VariablesInjava.staticField);
System.out.println(new VariablesInjava().instanceField);
}
}
