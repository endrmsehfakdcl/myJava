//01. C:/Temp/file.txt 파일의 유무를 출력하는 프로그램을 작성하시오.
//
//02. BufferdReader클래스의 readLine() 메서드를 
//\사용해 키보드에서 행 단위로 읽은 후 화면에 출력하는 프로그램을 작성하시오.
//Hint) 키보드는 표준 입력 장치이므로 InputStream타입의 System.in 객체를 사용한다. 
//InputStream을 Reader타입으로 변환하려면 InputStreamReader클래스를 사용하면 된다.
//
//03. 5개의 double 타입 숫자로 구성된 배열을 사용해 다음 작업을 수행하는 프로그램을 작성하시오.
//
//- 배열의 모든 원소를 C:/Temp/double.txt파일에 DataOutputStream을 사용해 저장한다.
//- 저장된 숫자를 DataInputStream을 사용해 읽은 후 화면에 출력한다.
//
//04. 키보드로 입력한 이름의 자바 소스 파일을 찾아 맨 앞에 행 번호를 붙여서 출력하는 프로그램을 작성하시오.
//
//05. OutputStream과 관련된 메소드를 이용해 0부터 9까지 
//연속된 숫자와 A부터 Z까지 알파벳 문자를 화면에 출력하는 프로그램을 작성하시오.
//Hint) 0의 아스키코드값은 '48'이며, A의 아스키코드값은 '65'이다. 
//화면은 표준 출력 장치이므로 System.out객체를 OutputStream 타입의 변수에 대입해서 사용한다.
//
//06. 다음 문자열로 구성된 배열과 생성된 파일의 내용을 참고해 
//매 행마다 문자열의 첫 문자, 콜론, 문자열로 구성된 파일을 생성하는 프로그램을 작성하시오.
// PrintStream의 printf()와 println()메소드를 사용할 수 있다.
//
//String[] animals = {"ant", "bat", "cat", "dog"};
//
//== 생성된 파일의 내용 ==
//a : ant
//b : bat
//c : cat
//d : dog
//
//07. 파일 이름을 나타내는 문자열과 특정문자를 주면 파일 속에 포함된 
//특정 문자의 개수를 찾을 수 있는 CountLetter 클래스를 두가지 방식(입출력 스트림 및 채널)으로 작성하시오.
//
//== 출력결과 : 파일을 입력하세요 : C:/Temp/words.txt
//              세고자하는 문자를 입력하세요 : e
//              C:/Temp/words.txt 파일에 e문자가 5개 있습니다.
//
//
//08. 주어진 단어를 문자 하나씩 추측해서 맞추는 행맨(hangman) 프로그램을 작성하시오. 
//처음에는 단어에 포함된 문자의 갯수만큼 빈칸이 나타나며, 
//사용자는 빈칸에 들어갈 문자를 하나씩 추측한다. 
//추측한 문자가 맞으면 빈칸 대신 맞춘 문자를 출력한다. 
//프로그램에서 사용할 문자열은 10개의 단어로 구성된 
//C:/Temp/words.txt파일에 있는 문자열 중 무작위로 선택한다. 
//여섯 번을 초과해서 잘못된 추측을 하면 게임이 종료된다. 
//다음은 최초 화면과 하나의 문자를 맞춘 실행 결과이다.
//
//== 실핼 결과 ==
//추측할 단어입니다 : -----
//지금까지 추측한 내용입니다 :
//추측한 문자를 입력하세요 : a
//정확한 추측입니다. - 6번을 더 추측할 수 있습니다.
//추측할 단어입니다 : ---a-
//지금까지 추측한 내용입니다 : a
//추측한 문자를 입력하세요 :
//  