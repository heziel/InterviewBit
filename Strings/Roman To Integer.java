package com.foo;

import java.awt.Label;
import java.awt.List;
import java.awt.PageAttributes.OriginType;
import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.management.BufferPoolMXBean;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import javax.naming.StringRefAddr;
import javax.swing.GrayFilter;
import javax.swing.plaf.ActionMapUIResource;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.swing.text.Utilities;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;

import com.joop.Employee;
import com.joop.LinkedHashMapTest;
import com.joop.LruCache;
import com.joop.ReverseFile;
import com.joop.Teacher;


public class HelloWorld {

	
	public static void main(String[] args)  {		
	

		System.out.println( romanToInt("MDCCCIV"));	
	}
	

	public static int romanToInt(String a) {
	    int i = a.length()-1;
	    char ch, bch;
	    int number = 0;
	    
	  while (i >= 0){
	        ch = a.charAt(i);
	        if (i-1 >= 0)
	            bch = a.charAt(i-1);
	        else 
	            bch = ' ';
	            
	        switch ( ch ){
	            case 'I': number += 1; break;
	            case 'V': number += 5; break;
	            case 'X': number += 10; break;
	            case 'L': number += 50; break;
	            case 'C': number += 100; break;
	            case 'D': number += 500; break;
	            case 'M': number += 1000; break;
	        }
	            
	        if ( bch == 'I'  && (( ch == 'V') || (ch == 'X')) ){
	            number -= 1; i-=2;
	        }
	        else if ( bch == 'X'   && (( ch == 'L') || (ch == 'C')) ){
	            number -= 10; i-=2;
	        }
	        else if ( bch == 'C'  && (( ch == 'D') || (ch == 'M')) ){
	            number -= 100; i-=2;
	        }
	        else i--;
	    }    
	    return number;
	}

}