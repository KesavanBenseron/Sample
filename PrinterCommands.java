package com.example.kesavant.kiosk.Model;

/**
 * Created by kesavanT on 1/23/2018.
 */

public class PrinterCommands {

    public static char[] CTL_LF = {0x0a};
    public static char[] CTL_FF = {0x0c};
    public static char[] CTL_CR = {0x0d};
    public static char[] CTL_HT = {0x09};
    public static char[] CTL_VT = {0x0b};

    //Printer hardware
    public static char[] HW_INIT = {0x1b, 0x40};  // Clear data in buffer and reset modes
    public static char[] HW_SELECT = {0x1b, 0x3d, 0x01}; //Printer select
    public static char[] HW_RESET = {0x1b, 0x3f, 0x0a, 0x00}; //Reset printer hardware

    // Cash Drawer
    public static char[] CD_KICK_2 = { 0x1b, 0x70, 0x00 }; // Sends a pulse to pin 2 []
    public static char[] CD_KICK_5 = { 0x1b, 0x70, 0x01 }; // Sends a pulse to pin 5 []

    // Paper
    public static char[] PAPER_FULL_CUT = { 0x1d, 0x56, 0x00 };// Full cut paper
    public static char[] PAPER_PART_CUT = { 0x1d, 0x56, 0x01 };// Partial cut paper
    public static char[] PAPER_FEED_FULL_CUT = { 0x1d, 0x56, 0x66, 0x00 };// Full cut paper with feed
    public static char[] PAPER_FEED_6 = { 0x1B, 0x64, 0x06};// feed paper three lines


    // Text format
    public static char[] TXT_NORMAL = { 0x1b, 0x21, 0x00 };// Normal text
    public static char[] TXT_EMPHASIS = { 0x1b, 0x21, 0x08 };// Emphasis text
    public static char[] TXT_ELITE = { 0x1b, 0x21, 0x01 };// Elite text
    public static char[] TXT_PICA = { 0x1b, 0x21, 0x00 };// Pica text
    public static char[] TXT_CONDENSED = { 0x1b, 0x21, 0x04 };// Condensed text
    public static char[] TXT_2HEIGHT = { 0x1b, 0x21, 0x10 };// Double height text
    public static char[] TXT_2WIDTH = { 0x1b, 0x21, 0x20 };// Double width text
    public static char[] TXT_UNDERL_OFF = { 0x1b, 0x2d, 0x00 };// Underline font OFF
    public static char[] TXT_UNDERL_ON = { 0x1b, 0x2d, 0x01 };// Underline font 1-dot ON
    public static char[] TXT_UNDERL2_ON = { 0x1b, 0x2d, 0x02 };// Underline font 2-dot ON
    public static char[] TXT_BOLD_OFF = { 0x1b, 0x45, 0x00 };// Bold font OFF
    public static char[] TXT_BOLD_ON = { 0x1b, 0x45, 0x01 };// Bold font ON
    public static char[] TXT_FONT_A = { 0x1b, 0x4d, 0x00 };// Font type A
    public static char[] TXT_FONT_B = { 0x1b, 0x4d, 0x01 };// Font type B
    public static char[] TXT_FONT_C = { 0x1b, 0x4d, 0x50 };// Font type C
    public static char[] TXT_ALIGN_LT = { 0x1b, 0x61, 0x00 };// Left justification
    public static char[] TXT_ALIGN_CT = { 0x1b, 0x61, 0x01 };// Centering
    public static char[] TXT_ALIGN_RT = { 0x1b, 0x61, 0x02 };// Right justification

    //Bevo Fonts
    public static char[] TXT_FONT_MEDIUM  = { 0x1d, 0x21, 0x10 };// BEVO FONT_1 (Medium)
    public static char[] BEVO_FONT_2  = { 0x1d, 0x21, 0x38 };// BEVO FONT_2
    public static char[] BEVO_FONT_3  = { 0x1d, 0x21, 0x1a };// BEVO FONT_4
    public static char[] BEVO_FONT_4  = { 0x1d, 0x21, 0x24 };// BEVO FONT_5
    public static char[] TXT_FONT_SMALL = { 0x1d, 0x21, 0x6a };// BEVO FONT_6 (Small)
    public static char[] BEVO_FONT_6  = { 0x1d, 0x21, 0x56 };// BEVO FONT_7
    public static char[] TXT_FONT_LARGE  = { 0x1b, 0x21, 0x38 };// BEVO BEVO_FONT_LONG_6 (Large)


    static char[] PRINT = {0x01B, 0x64, 0x05}; // trying the printing

    static char[] LINE  = {0x1b, 0x32} ;//ESC 2

    static char[] SPACE  =  {0x20} ;//space

    public static char[] RED  = { 0x1b, 0x72, 0x01}; //red

    static char[] PRINTERSTATUS  = {0x01B, 0x76, 0x00};
    //    	1C		28		4C		02		00		41
    static char[] FEEDTOCUTPOSITION  = {0x1C, 0x28, 0x4C, 0x02, 0x00, 0x42, 0x30};// feed to cuting position
    static char[] FEEDTOPELLINGPOSITION  = {0x1C, 0x28, 0x4C, 0x02, 0x00, 0x41, 0x30}; // feed to peeling position

    static char[] PRINTSTARTINGPOSITION = {0x1C, 0x28, 0x4C, 0x02, 0x00, 0x43, 0x32}; // Feed paper to the print starting position

    static char[] FEEDPAPER  = {0x1b, 0x4a, 0x01}; //Print and feed paper

}
