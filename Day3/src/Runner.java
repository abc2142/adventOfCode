import java.util.regex.*;
import java.util.*;

public class Runner {

    public static void main(String[] args) {
        // Sample input string
        String input = "[from()$&from()#mul(417,968),@how()'#mul(573,792)@+where():?[*;from(389,420)mul(605,462)why()[~*-<when()'{mul(433,657){<mul(315,750)where(42,262)mul(561,402)mul(608,670)-mul(487,177)when()<[from(113,890)~-{;where()$mul(191,692)>{[#select()@mul(308,194)!'#*;&mul(895,408)?<, [(where()]]mul(909,700)?{>{where()mul(757,941)-why()!,*'why()mul(541,157);&don't()'who()&what(882,529) '@)mul(627,86)where()~;how()mul(381,553)mul(973,36)?what()mul(123,588);@mul(21,532)@$/@!}(mul(33,654)select()mul(188,39):-}select(44,36)<{>mul(847,977)!why() :>(/]mul(686,398)'}:[select()^select()?who()who()don't()[:mul(565,649)who()who()[mul(221,665)who()>mul(374,813)(&)from(424,292):{!;%how()mul(676,615)]from(696,308)-from()from()don't()&!where()@who()>{when()>mul(859,72)*/why()mul(754,241):>mul(876,459)?] mul(510,268)when()#%,don't()why()#}>@:from()from()mul(763,5)~why()mul(138,433)>why()@where(){:what()mul(641,49)why()from()'what()@[mul(198,775){+&: :select()where()?when()mul(480,462)*select()who(),what()% ?[mul(416,986)@,mul(961,801)from()%^;how()[~@&<mul(963,22)^^>?[do()(select()how()],)<{'mul(598,617)why()^mul(524,890)who()mul(906,323)how();#*mul(598,235),</%,,?when()$<mul(141,476)^#)!#mul(822,532)mul(162,324)mul(900,330)%when()(^when()['don't()>how()why()mul(182,842)@/!}from()},*@mul(870,516)/mul(715,150)@<why():[[mul(159,287)!from():~?mul(164,124)&from()&who()^$*#mul(611,331);!:?%#!,mul(822,379))$#mul(849,563)select()from(){> why()from()}from()!mul(988,143)mul(473,645):why()+]mul(345,813)%,!why()}~~+do()where()&/select()##when()how()mul(443,642)'}>;@'don't()--}&mul(513,893)+*what(859,928)^~mul(490,172),/&-/;<)$where()mul(358,739)~+%where() {from()~,<mul(815,463)(~mul(614,974)mul(595,34))select()%+#'%mul(176,337);@?${!,mul(766,771)]when()- why())mul(606,556)why(){select()where()>$mul(548,143)^[why()how()mul(27,454) },mul(232,484)why()'' from()where(){?]~mul(702,305!(why()[$^*]+how()mul(441,327)mul(439,264):why()why()mul(17,879)@mul(607,176)+( mul(563,929) -mul(589,618)?what()]mul(980,140)who())/from()mul(812,778)-[ :where()mul(166,911)'*?who()@when(661,665),mul(722,191)-)when() !&]select()when()do()why(910,407)(]what()mul(362,411)}>* @^mul(126,232)&mul(84,996)how();)&,mul(603,235)select()mul(897,935)select()from()^>why()who(540,823)what(293,683)how()how()from()mul(983,655)'{]!<(do()-from()(%$when(115,963)~mul(943,432))#>mul(406,538)/&]!+]'mul(656,848)mul(111,553))&!#from()$@+mul(587,772),mul(988,8)}[@mul(481,867)*how();-who(),!*mul?(;mul(847,886)select()->who()what()where()^(+:mul(602,788)*why()[who()&&mul(743,840)&(*>who())! {-mul(79,831)!-&what(362,84)where(426,894)don't()who()@;mul(289,202)how()do()@why()-&how()[%;(%mul(412,482)<(mul(130,181)select()when(554,864)when()~mul(928,736)where(48,283),/[;?do()^*:mul(895,966)from()where()<#]where(){mul(703,735)??#how(236,74)how()}>how()where(612,279)~mul(174,164)>,!{(where()^$why(),mul(758,914)+select())where()&mul(58,270)@;when(72,904)&$?mul(254,430)'}where()what()[;mul(936,208)when()'mul(437,732):don't()what()who()who()-&[,(*$mul(832,760)when()where(){(where()~}don't()){[mul(190,956)}from()#*]who()mul(53,684)*mul(877,199)+why()-:?mul(89,715-mul(561,55)(*)from()select()select()+mul(221,427)?'+#</mul(802,728)mul(157,716)\r\n"
        		+ ")^:mul(964,991)how()mul(764,507)where(487,815){''mul{from()[(%why()mul(931,685)how())&]@],select()mul(620,310#,from()select()*{}$#?when(445,269)mul(106,680)(] /@%($%mul(712,135)<@when()$what()select()&;;}mul(194,879)when()!mul(855@/?>from(536,759)mul(800,868)';? why(),mul(702,706)mul(214,265)[!%~)how()^?when():mul(293,226)}*;from()!%*-how()why()don't()where()!@]select()from(785,361)/*!when(13,58)mul(861,234)~mul(783,45-mul(438,78)^@#what()[-mul(616,544)where()when()^>$select()where(),who()~mul(134,827)~;*>})!mul(815,435)?:how()what() +mul(61,155)where()^@;}mul(363,973)why(241,333)@*where())mul(440,61),++how(614,777)what()^~->don't()::mul(860,925))what()}select()^'>):'do()why(810,282)%~)]%(from()}mul(275,595)(mul(577,988)(!why(),select()'{mul(166,388)select()mul(999,24[why()-#*mul(130,797)~+{/*mul(767,233)$when()?+select()mul(923,65)<who()$why()how()#*mul(155,403)?[mul(532,756)<what()select()how()&-mul(568,544)why()mul(265,505):%mul(379,672)when()-select()mul(843,360)>how()mul(901,932)[;^~>mul(124,672)[:'!;;why()!mul(676,697)+{~'&$, }mul(251,202){+~,)from())from(506,658)]mul(139,157)/<mul(757,136,:@from()select()[who()mul(798,441)mul(809,378)/]$ how()@<*[how()don't():> from()[:from()what()(why()mul(276,947),}*mul(604,619):@>@what()mul?mul(181,881)'*mul(581,646)/*}when()>how()+mul(358,299)^what():&mul(643,202how()?]who()#}{?<?/don't()} where()]?)^[mul>{,(/]mul(647,517)mul& @<![#what()(^mul(550,59)+]-:how(841,15)mul(145,582),?^~&!,what()why()mul(34,861)~select()who()'select(183,144)don't()select()mul(68,840)from(){;-select()where()!select(752,600)mul(916,820){' ;how()mul(11,821)}~}}}(mul(569,618){mul(596,495)mul(608,82){- who()why()&$do()select()!;}$ ^:]mul(77,402)%select()^why()*?^from()$when()mul(239,628)@from()how(846,366)]select()mul(542,739);{ -{mul(391,525)mul(901,45)<@~@when(),~} when()mul(920,121)how(){from()select()?;mul(401,61)-; </mul(932,438),@$&#how()+/do()}(mul(642,767)mul(31,972)%}mul(982,444)why()]mul(311,82)~<#mul(462,763)#from()?<how()select();where(231,752)mul(484,199)>@$<what()why()??~mul(447,179)''>&what()why()don't()+select() where()select(275,403)*$when()+what()mul(842,582)mul(585,232)what()from()+&how()+how()}&*mul(519,314)how()]+*:mul(667,675)mul(601,526)select():;@from()do()][[-mul(500,597)^,mul(554,855)how()#{:{(<>mul(878,228)~[%-+[^how(781,701)?mul(796,539)~who()+,from()'/mul(504,377),@+{don't()mul(327,427)*)*mul(376,289);what(),why()/(mul(515,43)~:+who()>mul(936,740)&>++'mul(353,140)&^where()*%from()from()don't()#+*where()/mul(248when()*from()#- when()select()mul(934,836):mul(309,385)when()~/'-where()mul(674,43)>~select()how()$:%@,*mul(717,710)$[?} ~(what()[mul(751'?,[;[where();#who()]mul(128,526)< ?why()@>+&+}mul(891,853)![from()^}+@-when()!mul(714,846)}$where()-(/mul(181,843)don't(),>what()@select()#}mul(60,942){$when() <^mul(28,497)#'mul(21,845)'?^mul(742,887)do()mul(382,465)(}when()(mul(897,277)@{;%where()~~(*mul(563,465)!mul}/mul(388,102)>#::when(),select()who() ;mul(11,454)~^mul(436,504)$,>%{;/from()mul(543,776)select()do()$mul(299,377)from():@%who(){#*-where()mul(50,152))^how()#/>why()mul(964,916)>;(-(}mul(536,350);mul(889,495;select()(>where();?~,?<mul(161,470); mul(986,212)-@select()>mul(616,891)?]when(){( when(),+why()mul(331,911^:'mul(499,73)+{%) {who() ][don't()who()mul(857,327)$#mul(876,836)?!(/what()how()mul(350,344)when()[/]when()?what()@mul(280,353)<;select()@$why()how()mul(78,380)[~;;:from()(mul(746,710where()[mul(681,66)who())}why()#:how())'@mul(364,771)'!>from()when()select()+%&when()mul(670,495)\r\n"
        		+ "&>+mul(341,683)how()+!):mul(332,528);/ :^~{when(){-mul(633,994)what()select()@]{from(){* }mul(860,548){@]~[how()don't()?from()where()^mul(347,567)@[/<,where())%who(886,454)mul(247,283)~<  mul(574,729)'/%{( &how(214,925)}(mul(709,340)] from()&from()what()~mul(287,142){when()'how()why()@select()mul(282,401)+>^(%<+ #don't()&''~mul(308,617who()? $%@mul(451,53)^ ^/,%what()don't()what(){'why()-]!%mul(915,199)&'why()%where()^~ >mul(765,859)}-/+,why()mul(821,185){}from()select()who()where()*'*/mul(534^who()when()$}what()<mul(977,817)@*[^<<from()##mul(556,887)#(*)mul(12,102)select():;$mul(955,592)#%+? when(377,210)>mul(275,393):[-:?!#mul(131,783)?,)!mul(350,938);&{:]mul(965,34)from()who(595,453)&from()where()where():select():do()*mul(676,87))?mul(905,348)why(718,352)%>where()who()mul(276,997)/}>>from()$don't()%$<]where(951,222)@mul(515,525)<select()from()mul(878,86[#mul(933,228)}mul(146,814){+?why()where()don't()]^[mul(234,299)}don't()mul(249,997),who(706,968); &who()do()/#+{when()&mul(828,630where()mul(652,632)*select()]@select()[*from()+why()mul(117,510)when()>'> mul(490,120)?mul(813,587)&!$;}#{mul(400,566)}^, >mul(760,893)/$@select()what()%}}mul(673,893)#what()*~']{](mul(307,563)don't()select()mul(719,637);[what()]]:,mul(446,595)!];}$-)*don't()*~({$;mul(41,963)@(><!/how():do()!how()@/}{#(@mul(283,291)<<select()mul(243,974):~[mul(929,741)<what()!}/don't()/who()where()select()>?'~mul(116,816)+?how()mul(262,516)+/?>:^select()mul(73,247)#<-mul(144,855)*<who(369,643)~*+%when();:mul(549,186),(}  mul(970,284)~who()]mul(881,99)how()#mul(741,785)&</^mul(600,654):@@-^why()~{'>don't()$+**from(864,32)-[mul(585,948):-what() where()mul(102,617)&-why(){who()mul+%! +-]#mul(211,622)]'}mul(109'why()mul(121,558),who()mul(880,303)[mul(630,326):-*what()[mul(398,512)from()?how()who()from()where(250,432)where()what()who()mul(325,525)who(854,542)what():%[why()>>~mul(497,254)why()[''select()mul(17,313)$-,(!mul(442,149)^+when(){mul(75,151)who()from()mul(436,893)>/'do():+@when()$mul(297,419)!* mul(659,745)[what(662,767)(mul(840,744)&@^+when()mul(662,186)^$>don't()(how();%select(711,769)({*mul(758,906)'mul(574,852)>*mul#mul(835,592)why()do()from()mul(709,433)mul(297,773<do()^'~--mul(536,607)/<?'{]mul(950,348)mul%+what()}[from()who(974,802)#^#do()@]'+-mul(451,390);?~ &??]mul(757,336)from()where(498,397)/where()  *%mul(2,358)mul(906,246)what()from()why()<@/}#why()@mul(517,189)what(111,211)}when()when(),mul(651,842)>}]@*<#mul(23,184)+;}@*+select()*]from()mul(387,325)why()@ who()*mul(141,91)where()$mul(600,30)mul(445,898)select()from()<:why(){[where()*)mul(303,758)mul(184,650)* why(407,142)#where(73,355)mul(318,19{'[!mul(977,29)why()*[mul(189,449)@where(),why()mul(650,466)~ &@where()who()&#~mul(831'*how()/mul(858,782)why() ?mul<<&'&when()mul(522,337)~mul(879,132)how()mul(363,565)^- )}/!mul(447,64)from()don't()?from()>}(]how()where()*mul(607,173))-)who():{why()$mul(793,899)[[#[?mul(830,619)where()&@mul(147,296)#mul(924,363)!why()}+!-*{who(845,132)mul(108,5)what();%?mul(66,552)[*%:^mul(815,240)why()&&}$]?>mul(273,439)>from()what();:@select()!%>mul(98,451)do()mul(780,696),mul(248,960)mul(218,582)mul(780,166)>!where(),when()mul(658,763)+[-why()!what()do()-{{(-mul(567,864)how()( %select()>mul(486,535)$why()[mul(837,3)~how()do()mul(579,157)-;: how(389,705)<who()mul(623,740)when()why()#%< <mul(57,939)\r\n"
        		+ "}#!/usr/bin/perl{+[who()%}when()/where()why()mul(884,819)@%]#where()<<);>mul(139,24)$]<why()[~:*,when()mul(535,700)-*why()[!how(791,588)mul(956,454)<*/from() ?mul(285,521)):$!? #&!mul(339,830)!+who()what(){mul(753,654)how()who()})('%/do()  ,?#'<>/^mul(157,176)*don't()$mul(308,552)&&;mul(696,996)from()}~when()select()mul(520,748)}{//?how()from()mul(161,494)/#;who()who()#@{mul]}#>what();; mul(225,434) ;[select()^;,!where()mul(441,95)mul(958,361)mul(551,143)}-what()-mul;?[what()what()-)*>[<mul(644,103) $},why(90,907)how()-mul(912,145)>*]mul(541,70)mul(130,582)/+?select()!when()mul(907,591) ')mul(970,793)-~/select()+mul(814,80)(who()@>)mul(490,652):mul(947,108)from()(mul(138,898)where()@,,mul(744,887)$~^,mulfrom()*how(76,868) *-mul(566,680)?why()~%)mul(807,227)~~@mul(409,204)?,*^mul(370,358)]why(),*$;/(mul(480,531)who()(,;when()@]*mul(686< mul(621,530)~:where()]$*}>mul(272,210)mul(437,151)?mul(155,665)[(*)?^mul(826,872):^mul(327,486)?<!:~*[(mul(33,65)}from()#mul(556,218'<how(){mul(34,302)$when()^%how()[&(mul(680,764) [~*#~where()]mul(504,859)+!mul(83,850)@}when()select()*when(){&mul(483,732)[*mul(466,975)where()how())'do()mul(751,95)[*!%-select()when()$how()don't()-!what()mul(440,761))/?from()#mul(697,127),mul(3,457){mul(121,568)~)$mul(146,865)when()when()what()?select()^;mul(469,889)what()mul(762,991)'mul(784,993)from(274,641)@({select()*mul(17from()@when()what()~(from(82,197)what()mul(691,398)select()who(){%^^where()select()select()where()mul(201,195)  select() mul(374,481)mul(74,256)mul(675,62%why(){,when(965,629)%mul(135,133)~^)#[(where()when(){don't()[what(420,380)* !!@&who()>mul(328,665)mul(269,443;@from()/-'mul(759,488)$,]!don't()#:>+} select()&mul(511,390)mul(831,124)!]why()[?mul(361from()'[who()[who())why()]>{mul(628,534)from()select()$,mul(128,673)!~+mul(921,371)what()when(69,457)])when(762,838)mul(487,613)when()why()>>when()}mul(936,340)^[ 'what()select(){what()mul(353,849)[}who()#~mul(253,500)<'( when()$~#mul(708;($]who()'$% mul(916,24)]#!!%}[mul(442,586)where()mul(341,23)%][}; *mul(80,790)mul(700,678)^}~#why()from()]don't()select()select()where()mul(505,405)mul(537,809)how()where()!from()(%^-mul(72,512):who();^from()don't():from()mul(386,882)[)-+>who()how()@mul(483,242)(>%don't()select()how()!mul(527,522)who(189,356)mul(273,705)[mul(966,494),{how(922,891)[mul(820,815)/%(*(! mul(185,66){~,@from()$<*mul(990,763)select()@ select(435,424)mul(739,600)mul(24,331){@,},]+mul(870,249);]??mul(304,894)[{;-mul(557when()why();)mul(214,766)@what()from()where()what()-mul(324,271)!] +@select()&>how()mul(726,478)<mul(19,115){;'{?!where()]mul(941,995)!&}mul(623,71)@ ][mulwhere()};{~]+what(519,395), don't() why())from())!mul(751@]:#/what()))!mul(430,514)where()how()~{mul(613,943)+,where()~-what()mul(624,962){where(6,256)~'^+mul(623,762)-)who()/[where()how(),when()mul(131,519)'mul(825,472)select()why()mul(729,498)/)>where()*where():%!don't()<mul(899{[&~!(> mul(536,734)+how(),?!select(110,54)$#<%mul(442,666)mul(313,428)when()${~])who()mul(475,313)/mul(455,425)~why(124,596)?;</ mul(711,864)mul(395,424)when(261,493):^-}@@mul(936,974)where()what()%,;what()],do()%<mul(530,476)}%from()/,{mul(104,171)(-@( when()from()+~where()mul(866,45)when()/select()select()[*do()from()mul(305,505)why())<#]$what(449,626)select()<do()?$(where()mul(996,143)^when()?*'why(934,258)mul(137,936)>+[/what()where()mul(751,209)\r\n"
        		+ ">;(#]who()mul(529?who()^where()who()-]*/]mul(791,985)>*?what()(%#-#mul(861,903)()*$why()]&]!how()mul(26,564)~)from(),what()>mul(155,783)when()do()} ~#-mul(785,695)}select(),[[from(268,893)^mul(447,496)/{}{mul(14]{mul(137,899): select()#<how()mul(605,192):who()mul(243,379)from(922,761)how()what()~<@)]mul(495,368){who()who()where()%mul(322,384)>when()<mul(294,241)select();&where()mul(797,878)%what()^$?~,mul(336,707){mul(604,448)%<-<}where()when()mul(397,984)mul(163,817)mul(467,247)when()('$*/how()mul(933,99) >mul(350,670)who()'when()when()where()mul(31,73) @/from()mul(158,414)#';who(622,830)why(377,630)@:<[where()mul(624,849)&;$how()@&why()}#+mul(467,869)~:!do(),}}}~{what()&+why()mul(155,247);>+select(526,264);;?:-mul(254,763)where()]who(){'-(mul(377,651)?when()mul(145,270)who();mul(133,206)from()'-<%when())mul(512,808)$mul(273,757))>where();-[mul(831,982)$where()]mul(236,609)mul(510,591)%?+mul(292,894)mul(803,938)~where()select()}mul(906,984when()(~/mul(824,338)^;:where()from()*from()mul(269,910)from(),;+@@:mul(920,254)do()~/(}[?when()%$'mul(189,383)~%@what(){where()<$#mul(891^'mul(150,940) select()/:,mul(399,482'<+!@+,mul(380,77)mul(296,582)^'*-^from()?mul(97,874)why(511,351))&[[why()how()mul(118,975)^@mul(347,398)~>((+'/;&mul(306,417)]~>who(){,when()},#mul(956,209)~!where()how()@#[mul(642,809)when()where()-:,#{from(483,371)why()/mul(440,291);}^^>$:}~mul(265,464)*()<: mul(678,605)select()what(310,329)when()&who()from()mul(238,246)~{when()!>!^~mul(657,258)&]what()<#when()<mul(839when(195,830)}mul(568,364)>who()mul(900,641)how()~mul(614,673)^*@mul(352,930)mul(770,784)+~'!%??!where()mul(857,380)mul(577,531)}where()$['do()when())$)$mul(356,308){*[!{@[]#mul(314,359][why()mul(156,155)]/-!:;what()mul(288,619#]%@/where()from(689,908),mul(126,354))'$%[mul(735,53)#mul(294:-!mul(402,75)#-where()~ )-mul(210,253)[~how()mul(958,838)-mul(245,191)mul(108,788)*/mul(163,448){'select()[']>:}mul/how()why()}mul(745,638)[-<[{+ $:@mul(297,475);%where(344,331)*~{mul(727,796)why()<~mul(103,623)@>[+}+--/)mul(84,259)when()(when()/who()^<who()where()mul(758,654)>^select(){%select()mul(341,793)[ from()&:$mul-how(),#+))[<%mul(581,371)'mul(655,840^**[){[what()mul(468,123)?:who()-where()+/when()mul(746($;!</^)mul(978,477){mul(363,848)don't(),^! @mul(908,776)-/>;?[select()from()# do()@+]<mul(51,677) select(),$mul(969,939) []~)where(989,932)+<{when()mul(415,83)what()-'don't()% +),(mul(939,508)who()(~what()/^mul(397,552)&{/][<:(what()do()';select()who():]mul(27,93){&mul(543,829)^@what()?![[~mul(390,582)when()) when()who()?mulfrom()?^how()-?,^$*mul(886,66)mul(905,693)-select()when()mul(184,786)';mul(973,299)mul(793,249)why()!why()}~@do()*#mul(95,929)+'+&why() how()mul(39,507)when()when()+$!mul(160,310)-&>how()mul(205,112),>do()who())-)mul(884,944)mul(80,793):where()~how()({+~+mul(231,647)mul(274,104)~] ;<when()&,mul(863,62)^who():$mul(933,12)$]& mul(263,821)$/&]mul(124,716)where()how(532,584):}{mul(251,317)?:-what():+mulfrom()#~ mul(869,979)&/:when()%~mul(777,79)#%mul(486,640)])~{;~;mul(760,313)where(630,566)~mul(367,190)from(),:+:why():why(299,976) what()mul(966,554)when()?*:mul(770,722)?<why(290,489)where()~^from():)(mul(576,247)from()}mulhow()from()!do(){%mul(511,224)\r\n"
        		+ "^**@mul(118,454)^[,+?mul(831,394)*who(),how();#mul(838,352) [who())*(don't()how()} why()%}'mul(420,496)where(540,340)>*mul(651,92)-what()?[%how()from(){ 'do()![)'] mul(79,338)what()}?mul(103,696)from(839,939)why()how()[$when()mul(838,159)#,$*&[?-}'mul(373,50)-<@>;,&mul(777,267):![>?:*[who()'mul%@[what()mul(278,948)from()do()mul(920,800))mul(768,240)#[^mul(91,176)~mul(661,925when();! mul(352,766)where()!when()mul(665,531)+mul(587,882-!why()what()mul(444,391)how()}how()where()(where()~?do()@?what()>;mul(10,309)!when()don't()what(){)&(+when()+mul(135,277)*,%don't()what()select()!,$who()!when()mul(433,859)from()where()*from(),<;mul(142,752))what()<what()'$~mul(679,567)when() ~%mul(203,537)&^(+ <}<select()where()mul(23,330)] [select()>&+ ${mul(386,918)mul(465,343)<]}]when()(mul(831,968)why()>)<;who(554,106)mul(849,779)#~$:)what()mul(417,109[*;>*>mul(842,356)}~ $/+mulfrom()~^;^~mul(193,353)how()mul(119,248)]mul(198,841)mul(12,753) ?'when()select()what(569,458)mul(131,926)select(){; )#mul(390,705){~don't(),where()why()~/'mul(439,659))select()*mul(712,720-/ /what()mul(216,581)@}<~mul(892,911)when()~:^?[(mul(745,224)+-where()%?+@$mul(559,946) ^$why(){~*@select(728,442)mul(926,402where(230,603)}how()where()mul(624,409)')mul(69,495)what()(!@/-[when()}how()mul(632,244)!what()from()!mul(671,546);mul(109,6)^>:;^when()what()don't()@~mul(265,748)*?<mul(629,953)+^-who()~when()select()mul(156,419)>how()& <(#!mul(267,519)what()?'when()mul(131,982)/ )-mul(489,494)$]how()>why()from(918,64){*!mul(236,108)%{:]>mul(643,166)when()'%when(461,924)mul(26,478)!)why();#'&+mul(944,785)~*why()[from()!(~where()mul(872,651);select()mul(612,497)/mul(367,560)[[)don't()why())*who()<;,,-mul(635,902)mul(842,116)*^<@>mul(517,582),#mul(557,23)how()when()mul(451,533)<) :,mul(371,893)^^why()who()/+?mul(430,891)what()^})mul(251,512)$)mul(147,724)@^mul(549,762)~mul(392,503)when()!,!;don't()mul(40,634)who()/what()%mul(408,460)]<%'do()-when(){from(){-{?mul(911,748)>{+$>$what(559,658)%')mul(78,496)when(){+mul(397,104)}({>mul(978,665);why()>{^where()}+)!mul(41,590)&what():where()+,{&&don't()mul(590,826)-//;! $mul(698,789){',how()>mul(10,911)what()+!*where()>&'why() mul(433,24): :[(why(),where()&>mul(822,914)?mul(630,134)where()$when()>;/@mul(769,706)@@mul(376,366))!]who() #how()?who()mul(42,846)why()mul(735,630)#)+mul(723,623):@mul(84,151)&+@<(why()mul(203,609);[!?why())why()!mul(738,448)where()}when()#where()mul(494,171)(]@do()-//?-<-*;-mul(794,918)##why()how()%why()# ?mul(224,299)mul(25,111)<-;^*select(712,763)what()!;where()mul(773,912)*;(do()@who()@&%{%mul(61,492){when()((&from()>?mul(850,877)^/mul(643,197),%how();mul(27,746)how()what()}-#select()>don't()'{+;when() ]mul(804,327)?@when()how()+from()mul(731,16)}when(632,481)^ mul(841,888)~:?{[<$+don't()'<&why()mul(668,253)mul(955,947) ' ^(*mul(227,561))^;*{ ,(mul(164,251)# (from()from(31,113)+]when(){mul(45,21)select()mul(180,486);: ?}from()/mul(411,320) ~{-when()){/+-mul(142,258)mul(895,918)#;#:mul(436,950)-{*what()where()select():mul(512,382)~#from(563,273)mul(180,971)(,mul(914,983)#who(){)where(773,354)mul(86,529)select()?$!:-mul(469,419)what()-!+why()#,&]mul(531,80)what()where()!where()";
        
        // Regular expression to match mul(a, b)
        String regex = "mul\\((\\d+),(\\d+)\\)";
        
        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        
        // Create a matcher for the input string
        Matcher matcher = pattern.matcher(input);

        // List to store multiplication results
        List<Long> results = new ArrayList<>();

        // Find all matches and calculate results
        while (matcher.find()) {
            // Extract the two numbers from the match groups
            long num1 = Long.parseLong(matcher.group(1));
            long num2 = Long.parseLong(matcher.group(2));

            // Perform multiplication and store the result
            long result = num1 * num2;
            results.add(result);
        }

        // Output the results
        System.out.println("Multiplication Results:");
        for (long result : results) {
            System.out.println(result);
        }

        // Calculate and print the sum of all multiplication results
        long sum = 0;
        for (long result : results) {
            sum += result;
        }
        System.out.println("Sum of all results: " + sum);
    }
}
