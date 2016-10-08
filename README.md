<div class=WordSection1>

<p><span lang=EN-US>For this assignment you will create a simple Java program. </span></p>

<p><span lang=EN-US>(a) create a &quot;Die&quot; class which models a </span><span
lang=EN-US style='mso-fareast-font-family:SimSun'>n</span><span lang=EN-US>-sided
die. This should be in a source file named <b style='mso-bidi-font-weight:normal'>Die.java</b>,
and your class must satisfy the interface given below; that is, you are not
free to change the name, type, or behavior of the given methods. Your classes
will be in the package &quot;<b style='mso-bidi-font-weight:normal'>edu.zju.sc.aoot</b>&quot;.
</span></p>

<p><span lang=EN-US>In addition to your Die class, write a unit test program <b
style='mso-bidi-font-weight:normal'>TestDie.java</b>. Give some thought to how
to thoroughly test your Die class. </span></p>

<p><span lang=EN-US>The goal of this assignment is to get you started on
creating, running</span><span lang=EN-US style='mso-fareast-font-family:SimSun'>,</span><span
lang=EN-US> testing java programs</span><span lang=EN-US style='mso-fareast-font-family:
SimSun'> and using jdk lib properly</span><span lang=EN-US>. </span></p>

<p><span lang=EN-US>Your grade will be based on how well you design and
implement the code, on good programming practices, and on thorough testing. </span></p>

<p class=MsoNormal align=center style='text-align:center'><span lang=EN-US
style='mso-fareast-font-family:"Times New Roman"'>Class Die represents a
classic </span><span lang=EN-US style='mso-fareast-font-family:SimSun'>n</span><span
lang=EN-US style='mso-fareast-font-family:"Times New Roman"'>-sided die. <o:p></o:p></span></p>

<div align=center>

<table class=MsoNormalTable border=1 cellpadding=0 style='mso-cellspacing:1.5pt;
 mso-yfti-tbllook:1184;mso-padding-alt:3.75pt 3.75pt 3.75pt 3.75pt'>
 <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes'>
  <td style='padding:3.75pt 3.75pt 3.75pt 3.75pt'>
  <p class=MsoNormal><b><span lang=EN-US style='mso-fareast-font-family:"Times New Roman"'>Die</span></b><span
  lang=EN-US style='mso-fareast-font-family:"Times New Roman"'><o:p></o:p></span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:1'>
  <td style='padding:3.75pt 3.75pt 3.75pt 3.75pt'>
  <p class=MsoNormal><span lang=EN-US style='mso-fareast-font-family:"Times New Roman"'>Die()<o:p></o:p></span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:2'>
  <td style='padding:3.75pt 3.75pt 3.75pt 3.75pt'>
  <p class=MsoNormal><span lang=EN-US style='mso-fareast-font-family:SimSun'>Die(int)<o:p></o:p></span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:3'>
  <td style='padding:3.75pt 3.75pt 3.75pt 3.75pt'>
  <p class=MsoNormal><span lang=EN-US style='mso-fareast-font-family:SimSun'>int
  numOfSides()<o:p></o:p></span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:4'>
  <td style='padding:3.75pt 3.75pt 3.75pt 3.75pt'>
  <p class=MsoNormal><span lang=EN-US style='mso-fareast-font-family:"Times New Roman"'>int
  roll()<o:p></o:p></span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:5;mso-yfti-lastrow:yes'>
  <td style='padding:3.75pt 3.75pt 3.75pt 3.75pt'>
  <p class=MsoNormal><span lang=EN-US style='mso-fareast-font-family:"Times New Roman"'>int
  topFace()<o:p></o:p></span></p>
  </td>
 </tr>
</table>

</div>

<ul type=disc>
 <li class=MsoNormal style='mso-margin-top-alt:auto;mso-margin-bottom-alt:auto;
     mso-list:l0 level1 lfo3;tab-stops:list 36.0pt'><span lang=EN-US
     style='mso-fareast-font-family:"Times New Roman"'>Write </span><span
     lang=EN-US style='mso-fareast-font-family:SimSun'>two</span><span
     lang=EN-US style='mso-fareast-font-family:"Times New Roman"'> constructor</span><span
     lang=EN-US style='mso-fareast-font-family:SimSun'>s, one</span><span
     lang=EN-US style='mso-fareast-font-family:"Times New Roman"'> with no
     arguments</span><span lang=EN-US style='mso-fareast-font-family:SimSun'>
     (default is 6-sides)</span><span lang=EN-US style='mso-fareast-font-family:
     "Times New Roman"'> </span><span lang=EN-US style='mso-fareast-font-family:
     SimSun'>, the other with an integer argument to specify the number of
     sides. (Throw IllegalArgumentException for wrong input)</span><span
     lang=EN-US style='mso-fareast-font-family:"Times New Roman"'><o:p></o:p></span></li>
 <li class=MsoNormal style='mso-margin-top-alt:auto;mso-margin-bottom-alt:auto;
     mso-list:l0 level1 lfo3;tab-stops:list 36.0pt'><span lang=EN-US
     style='mso-fareast-font-family:SimSun'>The numOfSides() method will return
     the number of sides.</span><span lang=EN-US style='mso-fareast-font-family:
     "Times New Roman"'><o:p></o:p></span></li>
 <li class=MsoNormal style='mso-margin-top-alt:auto;mso-margin-bottom-alt:auto;
     mso-list:l0 level1 lfo3;tab-stops:list 36.0pt'><span lang=EN-US
     style='mso-fareast-font-family:"Times New Roman"'>The roll() method will
     roll the Die object and return the value on top. Use the <b
     style='mso-bidi-font-weight:normal'>java.util.Random</b> class to simulate
     the random rolls of the die. <o:p></o:p></span></li>
 <li class=MsoNormal style='mso-margin-top-alt:auto;mso-margin-bottom-alt:auto;
     mso-list:l0 level1 lfo3;tab-stops:list 36.0pt'><span lang=EN-US
     style='mso-fareast-font-family:"Times New Roman"'>The topFace() method
     returns the value on the top surface of the die without rolling it. <o:p></o:p></span></li>
</ul>

<p class=MsoNormal><span lang=EN-US style='mso-fareast-font-family:"Times New Roman"'>So
the relationship between class Die and class java.util.Random is <b>class
composition</b> (a &quot;has-a&quot; relation). The UML class diagram is: <o:p></o:p></span></p>

<p class=MsoNormal align=center style='text-align:center'><span lang=EN-US
style='mso-no-proof:yes'><!--[if gte vml 1]><v:shapetype id="_x0000_t75"
 coordsize="21600,21600" o:spt="75" o:preferrelative="t" path="m@4@5l@4@11@9@11@9@5xe"
 filled="f" stroked="f">
 <v:stroke joinstyle="miter"/>
 <v:formulas>
  <v:f eqn="if lineDrawn pixelLineWidth 0"/>
  <v:f eqn="sum @0 1 0"/>
  <v:f eqn="sum 0 0 @1"/>
  <v:f eqn="prod @2 1 2"/>
  <v:f eqn="prod @3 21600 pixelWidth"/>
  <v:f eqn="prod @3 21600 pixelHeight"/>
  <v:f eqn="sum @0 0 1"/>
  <v:f eqn="prod @6 1 2"/>
  <v:f eqn="prod @7 21600 pixelWidth"/>
  <v:f eqn="sum @8 21600 0"/>
  <v:f eqn="prod @7 21600 pixelHeight"/>
  <v:f eqn="sum @10 21600 0"/>
 </v:formulas>
 <v:path o:extrusionok="f" gradientshapeok="t" o:connecttype="rect"/>
 <o:lock v:ext="edit" aspectratio="t"/>
</v:shapetype><v:shape id="_x56fe__x7247__x0020_1" o:spid="_x0000_i1026"
 type="#_x0000_t75" style='width:315pt;height:69.75pt;visibility:visible;
 mso-wrap-style:square'>
 <v:imagedata src="A%20simple%20Die%20class.files/image001.png" o:title=""/>
</v:shape><![endif]--><![if !vml]><img width=420 height=93
src="A%20simple%20Die%20class.files/image002.jpg" v:shapes="_x56fe__x7247__x0020_1"><![endif]></span><span
lang=EN-US style='mso-fareast-font-family:"Times New Roman"'><o:p></o:p></span></p>

<p><span lang=EN-US>(b) Add comment documentation to your program (both class
Die and class TestDie) and use javadoc to extract the documentation into an
HTML file. Include a javadoc comment for each class and each method. The class
comment should include your name and the date (use the @author tag). Method
comments should <b>briefly</b> describe the purpose of the method, its
arguments, and what, if anything, it returns (using @param, @return and @throws
as appropriate). </span></p>

<p><span lang=EN-US>The physical location of the javadoc comments is critical.
A class comment must immediately precede the line containing the keyword <i>class</i>,
and method comments must immediately precede the method. </span></p>

<p><span lang=EN-US><span style='mso-spacerun:yes'> </span>(3) </span><span
lang=EN-US style='mso-fareast-font-family:SimSun'>You need to compile, run the
unit tests and coverage report using <b style='mso-bidi-font-weight:normal'>maven</b>.<o:p></o:p></span></p>

<p><span lang=EN-US>When you have commented your source files, run javadoc to
create the .html files and view them in a browser of your choice. </span></p>

<p><span lang=EN-US>Hints:<span style='mso-spacerun:yes'>  </span>&quot;mvn
compile/test/cobertura:cobertura&quot; will be used.</span><span lang=EN-US
style='mso-fareast-font-family:SimSun'><o:p></o:p></span></p>

<div class=MsoNormal align=center style='text-align:center'><span lang=EN-US
style='mso-fareast-font-family:"Times New Roman"'>

<hr size=2 width="100%" align=center>

</span></div>

<p class=MsoNormal><b><span lang=EN-US style='mso-fareast-font-family:"Times New Roman"'>What
to submit:</span></b><span lang=EN-US style='mso-fareast-font-family:"Times New Roman"'>
<o:p></o:p></span></p>

<ul type=disc>
 <li class=MsoNormal style='mso-margin-top-alt:auto;mso-margin-bottom-alt:auto;
     mso-list:l2 level1 lfo6;tab-stops:list 36.0pt'><span lang=EN-US
     style='mso-fareast-font-family:SimSun'>Source Code (including the JUnit
     class)</span><span lang=EN-US style='mso-fareast-font-family:"Times New Roman"'><o:p></o:p></span></li>
 <li class=MsoNormal style='mso-margin-top-alt:auto;mso-margin-bottom-alt:auto;
     mso-list:l2 level1 lfo6;tab-stops:list 36.0pt'><span lang=EN-US
     style='mso-fareast-font-family:SimSun'>javadoc</span><span lang=EN-US
     style='mso-fareast-font-family:"Times New Roman"'><o:p></o:p></span></li>
 <li class=MsoNormal style='mso-margin-top-alt:auto;mso-margin-bottom-alt:auto;
     mso-list:l2 level1 lfo6;tab-stops:list 36.0pt'><span lang=EN-US
     style='mso-fareast-font-family:SimSun'>testing log</span><span lang=EN-US
     style='mso-fareast-font-family:"Times New Roman"'><o:p></o:p></span></li>
 <li class=MsoNormal style='mso-margin-top-alt:auto;mso-margin-bottom-alt:auto;
     mso-list:l2 level1 lfo6;tab-stops:list 36.0pt'><span lang=EN-US
     style='mso-fareast-font-family:SimSun'>coverage report</span><span
     lang=EN-US style='mso-fareast-font-family:"Times New Roman"'><o:p></o:p></span></li>
 <li class=MsoNormal style='mso-margin-top-alt:auto;mso-margin-bottom-alt:auto;
     mso-list:l2 level1 lfo6;tab-stops:list 36.0pt'><s><span lang=EN-US
     style='mso-fareast-font-family:SimSun'>checkstyle file</span></s><s><span
     lang=EN-US style='mso-fareast-font-family:"Times New Roman"'><o:p></o:p></span></s></li>
</ul>

<p class=MsoNormal style='mso-margin-top-alt:auto;mso-margin-bottom-alt:auto'><span
style='font-family:SimSun;mso-ascii-font-family:"Times New Roman";mso-hansi-font-family:
"Times New Roman"'>&#25552;&#20132;&#26102;&#25152;&#26377;&#30340;&#25991;&#20214;&#24517;&#39035;&#21387;&#32553;&#25104;&#19968;&#20010;</span><span
lang=EN-US style='mso-fareast-font-family:SimSun'>zip</span><span
style='font-family:SimSun;mso-ascii-font-family:"Times New Roman";mso-hansi-font-family:
"Times New Roman"'>&#21253;&#65292;</span><span lang=EN-US style='mso-fareast-font-family:
SimSun'>zip</span><span style='font-family:SimSun;mso-ascii-font-family:"Times New Roman";
mso-hansi-font-family:"Times New Roman"'>&#21253;&#21629;&#21517;&#65306;</span><b
style='mso-bidi-font-weight:normal'><span lang=EN-US style='mso-fareast-font-family:
SimSun'>hw3-</span></b><b style='mso-bidi-font-weight:normal'><span
style='font-family:SimSun;mso-ascii-font-family:"Times New Roman";mso-hansi-font-family:
"Times New Roman"'>&#23398;&#21495;</span></b><b style='mso-bidi-font-weight:
normal'><span lang=EN-US style='mso-fareast-font-family:SimSun'>-</span></b><b
style='mso-bidi-font-weight:normal'><span style='font-family:SimSun;mso-ascii-font-family:
"Times New Roman";mso-hansi-font-family:"Times New Roman"'>&#22995;&#21517;</span></b><b
style='mso-bidi-font-weight:normal'><span lang=EN-US style='mso-fareast-font-family:
SimSun'>.zip </span></b><span style='font-family:SimSun;mso-ascii-font-family:
"Times New Roman";mso-hansi-font-family:"Times New Roman";color:red'>&#65288;&#27880;&#24847;&#65306;&#21629;&#21517;&#39035;&#20005;&#26684;&#31526;&#21512;&#35201;&#27714;&#65292;&#21542;&#21017;&#25552;&#20132;&#26080;&#25928;&#65289;</span><span
style='font-family:SimSun;mso-ascii-font-family:"Times New Roman";mso-hansi-font-family:
"Times New Roman"'>&#65292;&#19978;&#20256;&#21040;</span><span lang=EN-US
style='mso-fareast-font-family:SimSun'>ftp</span><span style='font-family:SimSun;
mso-ascii-font-family:"Times New Roman";mso-hansi-font-family:"Times New Roman"'>&#30446;&#24405;“</span><b
style='mso-bidi-font-weight:normal'><span lang=EN-US style='mso-fareast-font-family:
SimSun'>homework\week3-bigdata</span></b><span style='font-family:SimSun;
mso-ascii-font-family:"Times New Roman";mso-hansi-font-family:"Times New Roman"'>”&#19979;&#12290;</span><span
lang=EN-US style='mso-fareast-font-family:SimSun'><o:p></o:p></span></p>

<p class=MsoNormal style='mso-margin-top-alt:auto;mso-margin-bottom-alt:auto'><span
style='font-family:SimSun;mso-ascii-font-family:"Times New Roman";mso-hansi-font-family:
"Times New Roman";color:red'>&#35201;&#30830;&#20445;&#35299;&#21387;&#21518;&#21487;&#20197;&#30452;&#25509;&#36816;&#34892;</span><span
lang=EN-US style='color:red'>mvn compile/test/cobertura:cobertura</span><span
style='font-family:SimSun;mso-ascii-font-family:"Times New Roman";mso-fareast-font-family:
SimSun;mso-fareast-theme-font:minor-fareast;mso-hansi-font-family:"Times New Roman";
color:red'>&#21487;&#20197;&#33719;&#24471;&#30456;&#24212;&#32467;&#26524;&#12290;</span><span
lang=EN-US style='color:red'><o:p></o:p></span></p>

<p class=MsoNormal style='mso-margin-top-alt:auto;mso-margin-bottom-alt:auto'><span
lang=EN-US style='color:red'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal style='mso-margin-top-alt:auto;mso-margin-bottom-alt:auto'><span
lang=EN-US style='color:red'><o:p>&nbsp;</o:p></span></p>

</div>
