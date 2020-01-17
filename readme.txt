一.
請安裝:jdk-7u15-windows-x64.exe -- Java 7 JDK (64位元)
安裝步驟請參考:(第二部分)安裝 Java SE 7 的開發環境

二.
jdk-7u15-apidocs.zip -- JavaSE 7 API 開發文檔
請解壓縮至 C:\Program Files\Java\jdk1.7.0_15 下
安裝步驟請參考:(第二部分)安裝 Java SE 7 的開發環境

三.
請安裝:netbeans-7.2-ml-javase-windows.exe -- Netbeans IDE 開發工具
安裝步驟請參考:(第二部分)安裝 Java SE 7 的開發環境

四:
Java 7 Sample Code.zip
Netbeans 7.2 專案檔
1.解壓縮 Java 7 Sample Code.zip
2.開啟Netbeans > 檔案(F) > Open Project

五:
commons-lang3-3.1-bin.zip
Apache lang 資源包
1.將commons-lang3-3.1-bin.zip解壓縮到 C:\
2.於Netbeans中展開Java 7 Sample Code專案
3.選擇[程式庫] > Add JAR/Folder... > 匯入 "C:\commons-lang3-3.1\commons-lang3-3.1.jar"
4.匯入derby jar :
	4-1 : 選擇[程式庫] > Add JAR/Folder... > 匯入 "C:\Program Files\Java\jdk1.7.0_15\db\lib\derby.jar"
	4-2 : 選擇[程式庫] > Add JAR/Folder... > 匯入 "C:\Program Files\Java\jdk1.7.0_15\db\lib\derbyclient.jar"
	4-3 : 選擇[程式庫] > Add JAR/Folder... > 匯入 "C:\Program Files\Java\jdk1.7.0_15\db\lib\derbyLocale_zh_TW.jar"
	4-4 : 選擇[程式庫] > Add JAR/Folder... > 匯入 "C:\Program Files\Java\jdk1.7.0_15\db\lib\derbynet.jar"
	4-5 : 選擇[程式庫] > Add JAR/Folder... > 匯入 "C:\Program Files\Java\jdk1.7.0_15\db\lib\derbytools.jar"

