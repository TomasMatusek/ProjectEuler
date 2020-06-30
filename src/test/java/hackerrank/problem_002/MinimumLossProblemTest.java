package hackerrank.problem_002;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumLossProblemTest {

    @Test
    public void Sample_Test_1() {
        int result = MinimumLossProblem.minimumLoss2(new long[] {5,10,3});
        Assertions.assertEquals(2, result);
    }

    @Test
    public void Sample_Test_2() {
        int result = MinimumLossProblem.minimumLoss2(new long[] {20,7,8,2,5});
        Assertions.assertEquals(2, result);
    }

    @Test
    public void Sample_Test_3() {
        long[] data = new long[] {855281517,196961604,785972507,837186834,642804656,640862982,167523738,478709279,167497845,107347254,62366803,493114739,930049558,358316894,645442329,153402074,760287142,698886177,22102438,60571470,775240278,893828475,227997386,836193,195233072,196929094,663015721,326677619,656757583,563452934,7587392,463797435,24763095,312704909,563472503,656972047,429347456,149780395,50106880,313687927,393378036,249936324,489701424,97287920,843076268,663986928,214398093,410665435,552155022,636100304,501182847,49875745,923353978,652346317,730474658,183098886,483719891,69848618,14243141,604826116,868010045,413837823,327076547,17143639,104874638,247920353,734689621,258799127,472610140,733648623,131037554,654978923,531692160,894636226,36924396,186148873,976375348,419898133,277862889,195674509,711377882,811063137,334697217,456507648,558418786,223275662,587025691,609563585,198485966,33622392,904396389,832292535,482919819,424289331,960813552,994992377,641990212,780902360,989854924,350620484,95018098,612509556,210434998,559241535,48562431,349320778,906811318,417339060,802428860,291358805,579490012,889850126,630019270,383060967,301651135,651798063,582715487,296351868,151316235,318121256,861352452,177454028,80048145,16789463,454623875,829191510,424000801,213369339,315130530,5929334,15118096,875595043,213505405,758982293,763797602,782765481,848444521,828145225,650644575,79504834,994607995,384899642,699088639,124413451,982430471,926750242,912721971,669261266,482593987,355299049,102445833,68245260,398163070,333914726,718162832,349162934,715028682,783408665,634901163,684572122,294980278,952637431,602630537,507036913,411164601,128413338,765840756,911514273,816886721,774951170,602666807,253386878,827819712,274951268,530208986,43415239,561280099,763068468,459068676,119068119,27293579,471733983,115847540,216594349,33746832,961818840,683340474,510424893,337537165,604812544,546073624,746804705,974492088,149606010,267675494,648988218,440645308,579649956,811266859,218035336,245670153,82656552,643026898,311118255,746019645,173110038,945395143,998255249,670395051,867712652,317434256,680112111,113273598,935723682,490200263,862936327,234548635,200328075,447224149,958377928,948414960,579114323,348262816,866982271,131090942,962170711,382571895,341453626,973699632,118167353,292199777,244743519,695451975,458603504,558751,878336669,378567924,924202427,327256385,7464794,176797874,548410738,573474151,448191651,520582224,238486442,743497529,128704461,289279291,362511531,262127782,180701135,347036510,234896296,557047192,599257462,754860859,433615789,390444317,69677520,272639599,265081155,270349184,747651018,533916513,764794721,323065629,159007130,305845149,39607061,286453935,654514717,539747489,441347639,55274894,35487958,299194362,370517432,975243065,681129569,257227621,730901920,155579681,570086670,525545899,480803511,593664434,259904872,636403262,721700049,86815598,817782835,396913454,255161375,260017253,781916352,862364746,394904134,504981458,678933213,680247346,428234486,575283683,876637056,96947900,857216548,896899225,161831731,344434975,545674287,200272722,747123316,43781976,921655745,634466469,349995711,727529199,236482025,17811045,763590999,549855729,869195136,243197989,374377253,692749016,103268786,187224525,741888745,426889706,415253920,555931274,899484378,147661985,725516739,366217207,789432303,121841271,224488941,992882214,581375336,942035960,747092811,276962713,245403714,708652479,187856420,877485655,596142335,554733565,568707983,280063197,259686913,99968332,963378083,599463026,966816522,947723560,679787519,202622718,364030467,299435835,374960921,752003493,779488972,909095476,963264801,919471205,952501798,434337294,837384990,953235881,689376230,913677469,90344595,173547506,843253097};
        int result = MinimumLossProblem.minimumLoss2(data);
        Assertions.assertEquals(13572, result);
    }

    @Test
    public void Sample_Test_4() {
        long[] data = new long[] {718320666,651148245,623507520,9875257,399735580,108954240,712429593,5434840,304857829,172666336,327881948,589198421,521423793,742916814,481491753,700038068,240807339,188898297,764696617,19408273,254744265,530314340,349395270,192009420,801539045,393492862,697538016,799047010,911846690,774103345,706106469,330777760,610216713,582548140,100582515,546334959,394831837,683256950,284758878,268931334,261981884,633369000,422085468,522635405,957827694,972916162,677679943,466427399,853422137,375893830,539702472,692674457,619445831,718251740,528836848,927892857,209640562,247159551,775727056,536004812,301477029,614184833,26109065,825228592,693070605,46819200,190171141,504599080,300175628,982328158,948644482,397454873,802856927,16596411,996774470,355140440,459759229,593526860,614494360,915911929,80902429,316162096,328239680,413495542,204989160,913901046,288272681,340292416,521065297,181991456,400169477,597860807,423796731,906466958,747356303,998597969,612098522,75608748,104342470,224324765,660358984,720634860,385094054,150414065,272906144,556552231,317065851,942072161,346336247,795394245,911252250,748414953,146696035,754286539,761187390,386000684,593585930,315241848,318375339,869044926,450736263,869852633,275100109,931011815,656607846,980584580,87611087,549049727,5567202,538499023,674196489,857162924,208600069,697893457,76172226,753731200,426043388,854475876,54512292,955635955,951997917,362919542,29653284,403279127,621551449,100912337,470808008,620923574,721582576,38592726,352351245,499932071,166474671,582660240,307671328,900797990,634402383,923852431,32749398,268705357,40102317,41698475,883260626,325628868,386751758,576687867,136430191,350739098,560754425,888917570,826774286,291566991,231736059,668823554,490984730,91641137,904115394,55492828,208713976,570537693,441687896,580502540,751095513,684435150,148555498,779634637,142534308,554373279,767290651,346771880,44095909,853824677,428230686,290803920,465489349,471341975,798909711,84241902,269359447,27220154,197926775,86836688,897626822,459899168,747296611,739271139,439109886,62484897,186073359,982703263,167972993,474972092,268696265,257469720,589727648,100795678,767291532,196350871,708881530,300576734,685337825,554798384,792310778,705567920,595233136,467800210,656830150,783873752,450542142,51234801,265999123,607777831,382222756,170345325,813731066,129025814,15454895,367090504,124632052,98568503,49394962,101100300,43732221,334377496,918543804,755546877,188259442,509140275,18426596,105048631,819656311,527868524,866416214,508386442,371841433,185974089,498939712,465844664,697689178,427891206,51602879,661264003,681926610,952065817,48644809,280132397,402237240,16433123,672011967,540238447,537987480,919648961,579152126,707266898,734400508,174949505,661265156,75772614,689792446,28466301,931147767,628971744,683333160,860012757,617910694,727103971,416794285,615648169,690725471,137976201,492045289,871023856,585851565,881154923,672097603,414574545,880926609,699526442,972112851,221925643,210229131,294163528,74476132,230413315,108209560,405078860,19565537,41836352,101407357,663845053,733372937,361372342,76438229,704076823,342497474,413816472,907177959,731877107,24988055,365742848,874528873,279918621,302639259,532616162,126878513,743985359,748115838,374023581,675322236,942178408,42075998,789276521,448766135,862731078,302832319,588380329,190524259,454698458,805966451,610444006,866332208,618394297,785600793,443044860,137105801,399451381,268453117,833667066,623354392,365935014,931059366,999393072,603299768,921713674,256191427,460628829,729977774,806241668,794470982,810184247,255804121,110728411,405583304,969108805,573729757,542510608,533178517,887401948,418349239,343650646,319583332,961560751,107357957,417902125,57429401,11636835,972146491,909613029,98018323,381076547,342860402,726676152,518102925,615724245,529382271,678430044,89425956,481514718,98466578,314832665,646866019,352900871,594534125,722111199,228414838,807855993,849951526,838910244,847846031,121831690,97931804,999577518,530879755,61803242,590052152,59991199,474089762,791385897,953165110,586172600,376792123,757880787,125699749,153536147,738766595,817665811,898683119,663806587,930793189,108579648,900311866,90308994,457512236,752659876,238989610,78128683,425901411,882465517,957667015,758321823,157415729,87347586,551179784,91093802,250426730,624171938,401870204,926787932,397973969,945279318,872736893,254138789,974628690,635535692,808933665,376043977,404005650,760403775,89658216,517185989,834455152,405861083,599581998,757078570,455504919,267065523,973190615,354605957,119397386,466489120,528952177,272389164,12190884,435082429,503220535,613614496,60455183,795614629,127579767,823769202,126192848,883464416,697084251,799091178,801059585,731260513,626387444,255020631,429736063,402514224,512942463,306781021,89003879,932651214,567333097,240084202,468512030,861258255,13050763,597005868,46342608,346481868,956857638,46601236,566614750,992828214,986892991,79238458,271646121,594696505,746692005,80997231,561672037,178472460,675811643,232797005,747054468,316210468,488059752,673835358,748317582,627402718,412533569,967611044,791455862,48797679,982746867,301681923,62130884,955913458,423614554,489257715,114628454,665862311,360412254,297835778,182192415,201993559,694548137,497892375,416900002,379409071,246310735,626695981,285548679,83466935,386917594,279119033,486663655,749645438,34698992,575629093,300393779,332352745,441529854,873805749,647232116,735224503,290938556,174608616,143006436,978100620,81819529,883192640,447362781,779235392,624018610,658649548,986958311,449085041,88850435,941308104,929929021,592262975,48553180,176989442,28311326,441581822,404224457,834944094,870325009,515793445,161508909,404520387,637942998,804853575,408978448,421969207,890308303,904218311,611046573,900148596,68195305,503255449,39537179,445409049,143722624,293568609,14680166,60532732,80916174,928488578,742722679,872845813,573749938,805210530,980504257,596390254,628299526,825693946,779666318,812909747,912301939,405713941,265588005,258862870,483768084,220165747,138683868,269984257,294991020,650875060,222508993,245503344,942982257,721233117,812821626,663710152,50354697,384574295,288484888,121931538,23820682,721096231,534900799,558676137,511327342,829270558,892678337,558521311,330473293,915022915,876587505,592605454,602302562,94927608,941299640,850207935,433236431,633460325,143897756,515445440,30905164,451546854,810822452,842531130,666052310,686509028,755999889,864410131,228668525,969751066,146427754,662781872,15617215,376440522,652929357,633419289,683591637,421168840,595728724,469735127,97712749,970833008,779962873,373936461,587815999,551892010,484161401,841441014,977611092,425784575,319931528,667960510,562213659,925955981,749087253,855205064,157918945,493219875,994915886,904188773,528405843,825619141,277287807,71120341,492993270,49243154,666585026,528944654,373032305,352994356,224552480,680108987,622394379,257854396,366750707,81457629,576882204,138383551,494049190,137488174,627887828,163104280,429819379,149064542,749114852,688134018,193345761,195292250,747862753,371157422,442017863,962919217,938791384,508912433,553230503,716784664,185027053,646323216,206468767,240356109,43882341,882390982,181392642,370529653,299134103,373253291,190063568,34150022,95243622,589178578,129531777,573832866,494757435,382242947,221549143,960158476,391131785,138242541,540540180,354441655,741305804,345296871,42211091,99096263,858360383,516625932,674202911,738503222,87788092,549387534,937997912,168553499,988779216,405107724,65581968,2786389,297295111,932331209,865652033,90749442,803437725,641322457,198127936,224787124,576159820,397791392,992182286,520252598,253528196,663846007,815995911,396118006,570442260,496642870,773648225,802590812,66938535,39388292,158633647,271052110,142933213,765953282,737838337,961221020,906711270,549409468,804894299,571352508,32719231,115075068,931164997,480405375,380262090,571893433,426451421,260350724,112602416,289097719,791782814,405105786,195725831,21551283,605552906,345829871,902705477,227040570,95782422,351647607,574812192,128593611,250414215,956196389,368214916,637365045,508921351,729180561,381290339,847366161,696668219,535198236,514947365,93329948,627279417,576713756,791157110,630115849,598871196,800409538,629787626,463490909,606082747,136988309,406704011,304702059,362330778,389856642,965989037,693548359,652357456,612868537,262372207,382355950,534989391,354708978,650445754,254720329,8089966,109288102,241949254,164131250,392298898,264095102,523781788,172530305,913558360,200324819,94368624,306118608,865290840,186158488,59757478,962894542,904427811,86150334,55443169,563189821,19587720,440660234,748356666,120300856,962727938,427194193,618473589,985046035,929331201,5690836,877324450,276921053,526937496,183489150,776203770,717950189,881393296,997909871,771437617,597819604,574491315,613764450,511766279,300625261,900421164,826236747,220200354,200836690,347547934,763379409,456808901};
        int result = MinimumLossProblem.minimumLoss2(data);
        Assertions.assertEquals(1938, result);
    }

    @Test
    public void When_RevertMethodExecuted_Then_RightOrderReturned() {
        long[] list = new long[] {2,3,4,5,7,9};
        MinimumLossProblem.revertValue(list);
    }
}