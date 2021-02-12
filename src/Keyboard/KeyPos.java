/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Keyboard;

/**
 *
 * @author Imad
 */
public class KeyPos 
{
    public static int[] getKeyPos (int code)
    {
        int T[] = new int [4];
        switch(code) 
        {
            // Chiffres //
            case 48: //    0    //
                T[0] = 817 ;
                T[1] =   9 ;
                T[2] =  73 ;
                T[3] =  73 ;
                break;
            case 49: //    1    //
                T[0] =  89 ;
                T[1] =   9 ;
                T[2] =  73 ;
                T[3] =  73 ;
                break;
            case 50: //    2    //
                T[0] =  170 ;
                T[1] =   9 ;
                T[2] =  73 ;
                T[3] =  73 ;
                break;
            case 51: //    3    //
                T[0] =  251 ;
                T[1] =   9 ;
                T[2] =  73 ;
                T[3] =  73 ;
                break;
            case 52: //    4    //
                T[0] =  332 ;
                T[1] =   9 ;
                T[2] =  73 ;
                T[3] =  73 ;
                break;
            case 53: //    5    //
                T[0] =  412 ;
                T[1] =   9 ;
                T[2] =  73 ;
                T[3] =  73 ;
                break;
            case 54: //    6    //
                T[0] =  493 ;
                T[1] =   9 ;
                T[2] =  73 ;
                T[3] =  73 ;
                break;
            case 55: //    7    //
                T[0] =  573 ;
                T[1] =   9 ;
                T[2] =  73 ;
                T[3] =  73 ;
                break;
            case 56: //    8    //
                T[0] =  654 ;
                T[1] =   9 ;
                T[2] =  73 ;
                T[3] =  73 ;
                break;
            case 57: //    9    //
                T[0] =  735 ;
                T[1] =   9 ;
                T[2] =  73 ;
                T[3] =  73 ;
                break;
                
            // Carecteres Minisucules //
            // First Row //
            case 97: // a //
                T[0] =  127 ;
                T[1] =   92 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 122: // z //
                T[0] =  127+81 ;
                T[1] =   92 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 101: // e //
                T[0] =  127+81*2 ;
                T[1] =   92 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 114: // r //
                T[0] =  127+81*3 ;
                T[1] =   92 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 116: // t //
                T[0] =  127+81*4 ;
                T[1] =   92 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 121: // y //
                T[0] =  127+81*5 ;
                T[1] =   92 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 117: // u //
                T[0] =  127+81*6 ;
                T[1] =   92 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 105: // i //
                T[0] =  127+81*7 ;
                T[1] =   92 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 111: // o //
                T[0] =  127+81*8 ;
                T[1] =   92 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 112: // p //
                T[0] =  127+81*9 ;
                T[1] =   92 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
                
            // Second Row //
            case 113: // q //
                T[0] =  152 ;
                T[1] =   173 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 115: // s //
                T[0] =  152 +81 ;
                T[1] =   173 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 100: // d //
                T[0] =  152+81*2 ;
                T[1] =   173 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 102: // f //
                T[0] =  152+81*3 ;
                T[1] =   173 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 103: // g //
                T[0] =  152+81*4 ;
                T[1] =   173 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 104: // h //
                T[0] =  152+81*5 ;
                T[1] =   173 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 106: // j //
                T[0] =  152+81*6 ;
                T[1] =   173 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 107: // k //
                T[0] =  152+81*7 ;
                T[1] =   173 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 108: // l //
                T[0] =  152+81*8 ;
                T[1] =   173 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 109: // m //
                T[0] =  152+81*9 ;
                T[1] =   173 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            
            // Third Row //
            case 119: // w //
                T[0] =  182 ;
                T[1] =   256 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 120: // x //
                T[0] =  182+81*1 ;
                T[1] =   256 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 99: // c //
                T[0] =  182+81*2 ;
                T[1] =   256 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 118: // v //
                T[0] =  182+81*3 ;
                T[1] =   256 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 98: // b //
                T[0] =  182+81*4 ;
                T[1] =   256 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 110: // n //
                T[0] =  182+81*5 ;
                T[1] =   256 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            
            // Autres //
            case 32: // Space //
                T[0] =  287 ;
                T[1] =  339 ;
                T[2] =  545 ;
                T[3] =   73 ;
                break;
            
            
            default:
                T[0] = 0 ;
                T[1] = 0 ;
                T[2] = 0 ;
                T[3] = 0 ;
                break ;
        }
        
        return T ;
    }
    
    public static int [] getPos (int code)
    {
        int T[]  = new int [5];
        
        if (code > 47 && code < 58 ) 
        {
            T = getPos_Chiffre(code);
            T[4] = 1 ; 
            return T ;
        }
        
        if (code > 64 && code < 91 )
        {
            T = getPos_Caractere(code+32);
            T[4] = 2 ; 
            return T ;
        }
            
        if (code > 96 && code < 123 )
        {
            T = getPos_Caractere(code);
            T[4] = 3 ;
            return T ;
        }
            
        return T ;
    }
    
    private static int [] getPos_Chiffre(int code)
    {
        int T[]  = new int [5];
        
        switch (code)
        {
            // Chiffres //
            case 48: //    0    //
                T[0] = 817 ;
                T[1] =   9 ;
                T[2] =  73 ;
                T[3] =  73 ;
                break;
            case 49: //    1    //
                T[0] =  89 ;
                T[1] =   9 ;
                T[2] =  73 ;
                T[3] =  73 ;
                break;
            case 50: //    2    //
                T[0] =  170 ;
                T[1] =   9 ;
                T[2] =  73 ;
                T[3] =  73 ;
                break;
            case 51: //    3    //
                T[0] =  251 ;
                T[1] =   9 ;
                T[2] =  73 ;
                T[3] =  73 ;
                break;
            case 52: //    4    //
                T[0] =  332 ;
                T[1] =   9 ;
                T[2] =  73 ;
                T[3] =  73 ;
                break;
            case 53: //    5    //
                T[0] =  412 ;
                T[1] =   9 ;
                T[2] =  73 ;
                T[3] =  73 ;
                break;
            case 54: //    6    //
                T[0] =  493 ;
                T[1] =   9 ;
                T[2] =  73 ;
                T[3] =  73 ;
                break;
            case 55: //    7    //
                T[0] =  573 ;
                T[1] =   9 ;
                T[2] =  73 ;
                T[3] =  73 ;
                break;
            case 56: //    8    //
                T[0] =  654 ;
                T[1] =   9 ;
                T[2] =  73 ;
                T[3] =  73 ;
                break;
            case 57: //    9    //
                T[0] =  735 ;
                T[1] =   9 ;
                T[2] =  73 ;
                T[3] =  73 ;
                break;
        }
        
        return T; 
    }
    
    private static int [] getPos_Caractere (int code)
    {
        int T [] = new int [5];
        switch(code)
        {
            // First Row //
            case 97: // a //
                T[0] =  127 ;
                T[1] =   92 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 122: // z //
                T[0] =  127+81 ;
                T[1] =   92 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 101: // e //
                T[0] =  127+81*2 ;
                T[1] =   92 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 114: // r //
                T[0] =  127+81*3 ;
                T[1] =   92 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 116: // t //
                T[0] =  127+81*4 ;
                T[1] =   92 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 121: // y //
                T[0] =  127+81*5 ;
                T[1] =   92 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 117: // u //
                T[0] =  127+81*6 ;
                T[1] =   92 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 105: // i //
                T[0] =  127+81*7 ;
                T[1] =   92 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 111: // o //
                T[0] =  127+81*8 ;
                T[1] =   92 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 112: // p //
                T[0] =  127+81*9 ;
                T[1] =   92 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
                
            // Second Row //
            case 113: // q //
                T[0] =  152 ;
                T[1] =   173 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 115: // s //
                T[0] =  152 +81 ;
                T[1] =   173 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 100: // d //
                T[0] =  152+81*2 ;
                T[1] =   173 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 102: // f //
                T[0] =  152+81*3 ;
                T[1] =   173 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 103: // g //
                T[0] =  152+81*4 ;
                T[1] =   173 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 104: // h //
                T[0] =  152+81*5 ;
                T[1] =   173 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 106: // j //
                T[0] =  152+81*6 ;
                T[1] =   173 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 107: // k //
                T[0] =  152+81*7 ;
                T[1] =   173 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 108: // l //
                T[0] =  152+81*8 ;
                T[1] =   173 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 109: // m //
                T[0] =  152+81*9 ;
                T[1] =   173 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            
            // Third Row //
            case 119: // w //
                T[0] =  182 ;
                T[1] =   256 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 120: // x //
                T[0] =  182+81*1 ;
                T[1] =   256 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 99: // c //
                T[0] =  182+81*2 ;
                T[1] =   256 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 118: // v //
                T[0] =  182+81*3 ;
                T[1] =   256 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 98: // b //
                T[0] =  182+81*4 ;
                T[1] =   256 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            case 110: // n //
                T[0] =  182+81*5 ;
                T[1] =   256 ;
                T[2] =   73 ;
                T[3] =   73 ;
                break;
            
        }
        return T;
    }
    
}
