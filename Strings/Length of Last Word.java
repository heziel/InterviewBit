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
	
		//ArrayList<Integer> a = new ArrayList<>(Arrays.asList(  94, 21, 6, 30, 70, 57, 78, 27, 18, 41, 36, 15, 95, 24, 2, 55, 25, 48));
	

		System.out.println( lengthOfLastWord("hello world    "));	
	}
	

		public static int lengthOfLastWord(final String a) {
		    int size = a.length();
		    int counter = 0 ;
		    char ch;
		    
		    for ( int i = size - 1 ; i >= 0 ; i--){
		        ch = a.charAt(i);
		        if (( ch >= 'a' && ch <= 'z')  || (ch >= 'A' && ch <= 'Z')){
		            counter++;
		        } 
	            else if (ch == ' ' && counter ==0){}
		        else{
		            return counter;
		        }
		    } 
		    return counter > 0 ?  counter : 0;
		    
		}


}