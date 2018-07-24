package com.example.kesavant.kiosk.Model;

import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Created by kesavanT on 1/24/2018.
 */

public class PrinterConfig {

    PrintWriter printWriter;

    public PrinterConfig(OutputStream outputStream) {
        this.printWriter = new PrintWriter(outputStream);
    }

    public void initPrinter(){
        printWriter.write(PrinterCommands.HW_INIT);
        printWriter.write(PrinterCommands.TXT_ALIGN_CT);
    }

    public void textAlignCenter(){
        printWriter.write(PrinterCommands.TXT_ALIGN_CT);
    }

    public void textAlignLeft(){
        printWriter.write(PrinterCommands.TXT_ALIGN_LT);
    }

    public void textAlignRight(){
        printWriter.write(PrinterCommands.TXT_ALIGN_RT);
    }

    public void textBoldOn(){
        printWriter.write(PrinterCommands.TXT_BOLD_ON);
    }

    public void textBoldOff(){
        printWriter.write(PrinterCommands.TXT_BOLD_OFF);
    }

    //Bevo Fonts
    public void textFontSmall(){
        printWriter.write(PrinterCommands.TXT_FONT_SMALL);
    }

    public void textFontMedium(){
        printWriter.write(PrinterCommands.TXT_FONT_MEDIUM);
    }

    public void textFontLarge(){
        printWriter.write(PrinterCommands.TXT_FONT_LARGE);
    }

    public void textRedOn(){
        printWriter.write(PrinterCommands.RED);
    }

    /*public void textPrint(){
        printWriter.write(PrinterCommands.Print);
    }*/

    public void cutFullPaper(){
        printWriter.write(PrinterCommands.PAPER_FULL_CUT);
    }

    public void cutPartialPapper(){
        printWriter.write(PrinterCommands.PAPER_PART_CUT);
    }

    public void printerReset(){
        printWriter.write(PrinterCommands.HW_RESET);
    }

    public void carriageReturn(){
        printWriter.write(PrinterCommands.CTL_CR);
    }

    public void textUnderLineOn(){
        printWriter.write(PrinterCommands.TXT_UNDERL_ON);
    }

    public void textUnderLineOff(){
        printWriter.write(PrinterCommands.TXT_UNDERL_OFF);
    }

    public void setTextFont2Height(){
        printWriter.write(PrinterCommands.TXT_2HEIGHT);
    }

    public void writerClose(){
        printWriter.close();
    }

    public void printLine(String data){
        printWriter.println(data);
    }

    public void flush(){
        printWriter.flush();
    }

    public void applyStyles(String[] styles){
        printWriter.write(PrinterCommands.HW_INIT);
        for (String style:styles) {
            char[] charArr = style.toCharArray();

        }
    }

    public void feedfullcut(){
        printWriter.write(PrinterCommands.PAPER_FEED_FULL_CUT);
    }

    public void addNewline(){
        //printWriter.write("\n");
        printWriter.write(PrinterCommands.CTL_CR);
        printWriter.write(PrinterCommands.CTL_LF);
    }

    public void print(){
        printWriter.write(PrinterCommands.PRINT);
    }

    public void addText(String value){
        printWriter.print(value);
    }

    public String expand(int length,String value){
        String result ="";
        if (value.length() > length){
            result = value.substring(value.indexOf(value,length));
            return result;
        }
        else {
            if (value.length() <length){
                String emptySpace = "                                        ";
                result = (emptySpace.substring(length-value.length())+value);
                return result;
            }
        }
        return result;
    }

    public String formCardLine(String leftValueString,String rightValueString){
        String  leftspace = ""; String rightspace =""; String result ="";
        int leftlength = 18 - leftValueString.length();
        int rightlength = 20 - rightValueString.length();
        for (int i =1;i <= leftlength;i++){
            leftspace +=" ";
        }
        for (int i =1;i <= rightlength;i++){
            rightspace +=" ";
        }
        result = leftValueString+leftspace+": "+rightValueString+rightspace;
        return  result;
    }

    public String formCardChargeLine(String leftValueString,String rightValueString){
        String  leftspace = ""; String rightspace =""; String result ="";
        int leftlength = 15 - leftValueString.length();
        int rightlength = 15 - rightValueString.length();
        for (int i =1;i <= leftlength;i++){
            leftspace +=" ";
        }
        for (int i =1;i <= rightlength;i++){
            rightspace +=" ";
        }
        result = leftValueString+leftspace+": "+rightValueString+rightspace;
        return  result;
    }

    public String getline(int totallines,String firststring,String laststring){
        String spaceString = "";
        int firstLength = firststring.length();
        int lastLength = laststring.length();
        int totalspace = totallines - (firstLength+lastLength);
        for (int i =1;i <= totalspace;i++){
            spaceString +=" ";
        }
        String result = firststring+spaceString+laststring;
        return result;
    }

    public void addTextTimes(String s, int totalNumberLines) {
        String result ="";
        for (int i = 1;i <= totalNumberLines;i++){
            result += s;
        }
        printWriter.print(result);
    }

    public void startAt(int i) {
        String spaces="";
        for (int v= 1; v<= i; v++){
            spaces +=" ";
        }
        printWriter.print(spaces);
    }

    public String insertSpace(int value){
        String spaces="";
        for (int v= 1; v <= value; v++){
            spaces +=" ";
        }
        return spaces;
    }
}
