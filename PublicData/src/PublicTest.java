import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class PublicTest {
	public static void main(String[] args) {
		try {
//			DOM(Document Object Model : HTML 객체) Document 객체 생성
//			XML 문서에서 DOM 오브젝트 트리를 생성하는 parser를 얻을 수 있다
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//			xml 파일을 파싱(해석)하는 객체
			DocumentBuilder parser = dbf.newDocumentBuilder();
			
			Document xmlDoc = null;
			String url = "xml\\book.xml";
//			xml 파일을 파싱(Document 객체로 받음)
			xmlDoc = parser.parse(url);
			
//			<booklist> : 루트 엘리먼트 접근
			Element root = xmlDoc.getDocumentElement();
			
//			<book> : root의 하위 엘리먼트 접근
//			item(0) : 첫번째 책
			Node bookNode = root.getElementsByTagName("book").item(0);
//			<author> : book의 하위 엘리먼트 접근
			Node authorNode = ((Element)bookNode).getElementsByTagName("author").item(0);
//			author = 홍길동
			String author = authorNode.getTextContent();
			
//			book 태그의 전체 개수 = 2
			int length = root.getElementsByTagName("book").getLength();
			
			for(int i = 0; i < length; i++) {
//				i 따라 책 반복
				Node bNode = root.getElementsByTagName("book").item(i);
//				'react' or 'vue'
				String kind = ((Element)bNode).getAttribute("kind");
				System.out.println(kind);
				
//				<title> : 하위 엘리멘트 접근
				Node tNode = ((Element)bNode).getElementsByTagName("title").item(0);
//				getTagName() = title + 리액트 정복, 뷰 첫걸음
				System.out.println(((Element)tNode).getTagName() + " : " + tNode.getTextContent());
				
				Node aNode = ((Element)bNode).getElementsByTagName("author").item(0);
				System.out.println(((Element)aNode).getTagName() + " : " + aNode.getTextContent());
				
				Node pNode = ((Element)bNode).getElementsByTagName("price").item(0);
				System.out.println(((Element)pNode).getTagName() + " : " + pNode.getTextContent());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
