package stream.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		//InputStreamReader : ��Ʈ���� ���ڷ�(���ڿ� ������) �о��ְ� �ϴ� ����� ������Ʈ�� / FileInputStream : Byte�� �д� ��� ��Ʈ��
		//Byte�� �д� �Ŵٺ��� ����� ���� ���ڷ� �ؾ� �������ʰ� ����� �Ǵϱ�, �ش� ������Ʈ���� �Ἥ ���ڷ� �а��ϵ��� �������
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			int i;
			while( (i = isr.read()) != -1){  //���� ��Ʈ������ �н��ϴ�.
				System.out.print((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		// �߰� ����
//		Socket socket = new Socket();
//		try {
//			//������Ʈ���� ������Ʈ���� ���� ���� �ְ�, ��ݽ�Ʈ���� ���μ� ����� �߰��� ���� ����
//			//��, ������Ʈ���� �����ڷ� �ٸ� ������Ʈ��, ��ݽ�Ʈ�� �Ѵ� �� �� ����
//			//���⿡�� byte�� �а��ϴ� ��ݽ�Ʈ���� ���ڷ� �а��ϴ� ������Ʈ���� 1���� ���ΰ�, �װ��� 8K������ ������ �е��� �ϴ� ������Ʈ���� 2���� ����
//			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			br.readLine(); // �� �� ������ �о��� (BufferedReader �ش� ������Ʈ�� ���ο� readLine() �ش� �ż��尡 ���ԵǾ� �־ ��밡��)
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
