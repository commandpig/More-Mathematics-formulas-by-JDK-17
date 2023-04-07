//                    _ooOoo_
//                   o8888888o
//                   88" . "88
//                   (| -_- |)
//                    O\ = /O
//                ____/`---'\____
//              .   ' \\| |// `.
//               / \\||| : |||// \
//             / _||||| -:- |||||- \
//               | | \\\ - /// | |
//             | \_| ''\---/'' | |
//              \ .-\__ `-` ___/-. /
//           ___`. .' /--.--\ `. . __
//        ."" '< `.___\_<|>_/___.' >'"".
//       | | : `- \`.;`\ _ /`;.`/ - ` : | |
//         \ \ `-. \_ __\ /__ _/ .-` / /
// ======`-.____`-.___\_____/___.-`____.-'======
//                    `=---='
//
// .............................................
//          佛祖保佑             永无BUG

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
		System.out.println(Math.E);
		System.out.println(e(15));
		System.out.println(e(2));
		System.out.println(Math.sqrt(2));
		System.out.println(extract(2, 2));
		System.out.println(ex2(15));
		System.out.println(ex2(2));
		System.out.println(scientific(0.000000386));
		System.out.println(scientific(0.0386));
		System.out.println(scientific(3.86));
		System.out.println(scientific(386));
		System.out.println(scientific(38600000));
		System.out.println(english(0));
		System.out.println(sin(0.11, false));
		System.out.println(sin(0.45, true));
		System.out.println(cos(0.14, false));
		System.out.println(cos(0.19, true));
		System.out.println(tan(0.19, false));
		System.out.println(tan(0.81, true));
	}
	public static double power(double base, double exponent){
		return(Math.pow(base, exponent));
	}
	public static double extract(double exponent, double power){
		return(Math.pow(power, (1 / exponent)));
	}
	public static double logarithm(double base, double power){
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
	public static String english(double d){
		return("");
	}
	public static double sin(double d, boolean anti){
		if(anti){
			return(Math.asin(d));
		}else{
			return(Math.sin(d));
		}
	}
	public static double cos(double d, boolean anti){
		if(anti){
			return(Math.acos(d));
		}else{
			return(Math.cos(d));
		}
	}
	public static double tan(double d, boolean anti){
		if(anti){
			return(Math.atan(d));
		}else{
			return(Math.tan(d));
		}
	}
}