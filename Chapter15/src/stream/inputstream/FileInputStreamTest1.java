package stream.inputstream;
import java.io.FileInputStream;
import java.io.IOException;

//FileInputStream Ŭ������ ����� Ŭ������ ����ó�� �ʿ�
//������ input.txt ������ �����ؼ� ���ܰ� �ȳ���
public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
		
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		
		} catch (IOException e) {
			System.out.println(e); //"input.txt" ������ ��� �ش� exception�� ������ ��
		} finally{
			try {
				fis.close();
			} 
			// catch (Exception e) {} �̰� ���� �ֻ���Ŭ�����̴�
			// �ؿ� �ΰ��� ���� exception�� �� �ɾ��ִ� ���̶� ���α׷��� ���������� �Ѿ
			//"end"�� ����� ������, ���������� � exception�� �ִ� �� �˸�
			//���������� exception�� �ڵ����༭ � exception���� �߻��ߴٴ� �α׸� �����ִ� �� ����
			//�������� exception�� �𸣸� �ֻ��� exceptionŬ������ ���൵ ��
			catch (IOException e) {
				System.out.println(e); // fis ������ ã�� �� ��� fis.close();�� ���� �� �ϴ� �ش� exception�� ������ ��
			} catch (NullPointerException e){
				System.out.println(e); // Null���� fis�� pointer�� �ȵ� exception�� ��������� ���⿡�� �Ѿ(fis���� null������ �������� ���̶�)
			}
		}
		//���� exception 3 �ܰ踦 ���ľ��� �ش� ���� ������ �ȵǴ� ���ܻ�Ȳ�� ���ܵ� �Ѿ�� �۵��϶�� ��
		//NullPointerException e �̰��� �� ���ָ� ���⼭ ���ܻ����� �ڵ鸵 �Ѱ� ��� ���α׷��� �װ� �Ǽ� "end"�� ����� �ȵ�
		//�׷��� ���α׷��� �����ʰ� �����۵��� ������� �Ǽ� "end" ��� �ܰ���� �Ѿ�� ��
		System.out.println("end"); 
		
	}
}
