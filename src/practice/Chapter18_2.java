package practice;

public class Chapter18_2 {

	public static void main(String args[]) {

		//結合した文字列の格納場所をStringBufferクラスを用いて作成する
		StringBuffer sb = new StringBuffer();

		//1～100をカンマ区切りで格納する
		for (int i = 1; i <= 100; i++) {
			if (i < 100) {
				sb.append(i).append(",");
			} else {
				sb.append(i);
			}
		}

		//結合したStringBufferをString型のmojiでインスタンス化し、出力する
		String moji = new String(sb);

		//カンマ区切りで取り出した文字列リストを作成する。
		String[] toridashi;

		//文字列をカンマ区切りで分割し、リストにする。
		toridashi = moji.split(",");

		//リストの中身を取り出し、出力する。
		for (String t : toridashi) {
			System.out.println(t);
		}

	}
}