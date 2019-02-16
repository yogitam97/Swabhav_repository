package com.techlabs.reflection;
import java.lang.reflect.*;
import com.techlabs.employee.*;
public class TestReflection {

		public static int getterNum = 0, setterNum = 0;
		public static int methodNum = 0, constructorNum = 0;

		public static void main(String[] args) {

			Class reflectClass = Employee.class;
			String classname = reflectClass.getName();

			Constructor[] constructors = reflectClass.getConstructors();
			constructorNum = constructors.length;
			Method[] methods = reflectClass.getMethods();
			methodNum = methods.length;

			
			countGetters(methods);
			countSetters(methods);

			System.out.println("Number of Constructors : " + constructorNum);
			System.out.println("Number of Methods  : " + methodNum);
			System.out.println("Number of getter methods : " + getterNum);
			System.out.println("Number of setter methods : " + setterNum);
		}

		public static void countGetters(Method[] methods) {

			for (Method method : methods) {
				if (isGetter(method))
					getterNum++;
			}
		}

		public static void countSetters(Method[] methods) {

			for (Method method : methods) {
				if (isSetter(method))
					setterNum++;
			}
		}

		public static boolean isGetter(Method method) {
			if (!method.getName().startsWith("get"))
				return false;
			if (method.getParameterTypes().length != 0)
				return false;
			return true;
		}

		public static boolean isSetter(Method method) {
			if (!method.getName().startsWith("set"))
				return false;
			if (method.getParameterTypes().length != 1)
				return false;
			return true;
		}

	}

