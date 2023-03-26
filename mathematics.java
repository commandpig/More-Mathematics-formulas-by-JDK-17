public class mathematics{
	public static void main(String[] args){
		System.out.println("Test");
		System.out.println(power(1.14, 5.14));
		System.out.println(extract(19.19, 8.10));
		System.out.println(logarithm(2.55, 2999.9984));
		System.out.println(average(114.514, 1919.810));
		System.out.println(maximum(29.99, 99.84));
		System.out.println(minimum(29.99, 99.84));
		System.out.println(integer(66.66, true));
		System.out.println(integer(66.66, false));
		System.out.println(round(1.4, 0));
		System.out.println(round(1.5, 0));
		System.out.println(round(3.1415926536, 4));
		System.out.println(round(3.1415926536, 5));
		System.out.println(Math.PI);
		System.out.println(pi(15));
		System.out.println(pi(2));
		System.out.println(e(15));
		System.out.println(e(2));
		System.out.println(extract(2, 2));
		System.out.println(ex2(15));
		System.out.println(ex2(2));
		System.out.println(scientific(0.000000386));
		System.out.println(scientific(0.0386));
		System.out.println(scientific(3.86));
		System.out.println(scientific(386));
		System.out.println(scientific(38600000));
	}
	public static double power(double base, double exponent){		// base^exponent
		return(Math.pow(base, exponent));
	}
	public static double extract(double exponent, double power){	// exponent√power
		return(Math.pow(power, (1 / exponent)));
	}
	public static double logarithm(double base, double power){		// log(base,power)
		return(Math.log(power) / Math.log(base));
	}
	public static double average(double a, double b){
		return((a + b) / 2);
	}
	public static double maximum(double a, double b){
		if(a > b){
			return(a);
		}else{
			return(b);
		}
	}
	public static double minimum(double a, double b){
		if(a < b){
			return(a);
		}else{
			return(b);
		}
	}
	public static long integer(double number, boolean mode){
		if(mode){
			return(Math.round(Math.ceil(number)));
		}else{
			return(Math.round(Math.floor(number)));
		}
	}
	public static double round(double number, int exponent){
		long tmp = Math.round(Math.pow(10, exponent));
		double round = Math.round(number * tmp);
		return(round / tmp);
	}
	public static double pi(int exponent){
		if(exponent > 14){
			return(3.141592653589793);
		}else{
			return(round(3.141592653589793, exponent));
		}
	}
	public static double e(int exponent){
		if(exponent > 14){
			return(2.718281828459045);
		}else{
			return(round(2.718281828459045, exponent));
		}
	}
	public static double ex2(int exponent){
		if(exponent > 14){
			return(1.414213562373095);
		}else{
			return(round(1.414213562373095, exponent));
		}
	}
	public static String scientific(double d){
		double tmp = d;
		int exponent = 0;
		if(d < 1){
			for(;;){
				tmp = tmp * 10;
				exponent--;
				if(tmp >= 1){
					break;
				}
			}
		}else if(d >= 10){
			for(;;){
				tmp = tmp / 10;
				exponent++;
				if(tmp < 10){
					break;
				}
			}
		}
		tmp = round(tmp, 14);
		return(tmp + "*10^" + exponent);
	}
}