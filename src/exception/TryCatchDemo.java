package exception;

/**
 * java异常处理机制中的try-catch 语法： try{ 可能出现异常的代码片段 }catch（xxxxException e){
 * 当try中出现xxxxException后的解决办法 }
 * 
 * @author soft01
 *
 */
public class TryCatchDemo {

	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String str = "阿";
			/*
			 * 当jvm执行到某一句话时若出现了某种异常时，jvm便会实例化对应异常的实例， 并将整个代码的执行过程设置进去，然后将该异常抛出。
			 */
			System.out.println(str.length());
			/*
			 * try语句块中出错代码以下内容都不会运行
			 */
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
			System.out.println("!!!!!!!!!");
		} catch (NullPointerException e) {
			System.out.println("出现空指针异常");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("字符串下标越界");
		} catch (NumberFormatException e) {
			System.out.println("字符串内容不是数字");
		} catch (Exception e) {
			/*
			 * 应当养成一个好习惯，在最后一个catch中捕获Exception
			 * 这样可以避免因为一个未捕获的异常导致程序中断
			 */
			System.out.println("出错了");
		}
		System.out.println("程序结束了");
	}

}
