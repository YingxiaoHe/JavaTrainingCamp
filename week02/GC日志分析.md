# 串行GC
### gc log:
##### -Xmx512m -Xms512m
    Java HotSpot(TM) 64-Bit Server VM (25.251-b08) for windows-amd64 JRE (1.8.0_251-b08), built on Mar 12 2020 06:31:49 by "" with MS VC++ 10.0 (VS2010)
    Memory: 4k page, physical 16112436k(5889008k free), swap 20831028k(6718368k free)
    CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseSerialGC
    0.185: [GC (Allocation Failure) 0.185: [DefNew: 139685K->17472K(157248K), 0.0251928 secs] 139685K->45554K(506816K), 0.0254391 secs] [Times: user=0.00 sys=0.03, real=0.03 secs]
    0.240: [GC (Allocation Failure) 0.241: [DefNew: 157248K->17470K(157248K), 0.0701727 secs] 185330K->86983K(506816K), 0.0702491 secs] [Times: user=0.02 sys=0.06, real=0.07 secs]
    0.342: [GC (Allocation Failure) 0.342: [DefNew: 156946K->17471K(157248K), 0.0261499 secs] 226459K->131394K(506816K), 0.0262484 secs] [Times: user=0.02 sys=0.02, real=0.03 secs]
    0.396: [GC (Allocation Failure) 0.396: [DefNew: 157247K->17472K(157248K), 0.0271727 secs] 271170K->177199K(506816K), 0.0272619 secs] [Times: user=0.01 sys=0.02, real=0.03 secs]
    0.453: [GC (Allocation Failure) 0.453: [DefNew: 157248K->17470K(157248K), 0.0264083 secs] 316975K->219293K(506816K), 0.0264879 secs] [Times: user=0.00 sys=0.02, real=0.03 secs]
    0.508: [GC (Allocation Failure) 0.508: [DefNew: 157246K->17471K(157248K), 0.0229597 secs] 359069K->262116K(506816K), 0.0230364 secs] [Times: user=0.00 sys=0.03, real=0.02 secs]
    0.561: [GC (Allocation Failure) 0.561: [DefNew: 156641K->17470K(157248K), 0.0233283 secs] 401286K->307607K(506816K), 0.0234098 secs] [Times: user=0.00 sys=0.02, real=0.02 secs]
    0.611: [GC (Allocation Failure) 0.611: [DefNew: 157246K->17471K(157248K), 0.0188209 secs] 447383K->346720K(506816K), 0.0188968 secs] [Times: user=0.02 sys=0.00, real=0.02 secs]
    0.654: [GC (Allocation Failure) 0.654: [DefNew: 157247K->157247K(157248K), 0.0000261 secs]0.654: [Tenured: 329248K->273523K(349568K), 0.0432904 secs] 486496K->273523K(506816K), [Metaspace: 3294K->3294K(1056768K)], 0.0434382 secs] [Times: user=0.05 sys=0.00, real=0.04 secs]
    0.722: [GC (Allocation Failure) 0.722: [DefNew: 139776K->17470K(157248K), 0.0085288 secs] 413299K->321312K(506816K), 0.0085840 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
    0.757: [GC (Allocation Failure) 0.757: [DefNew: 156825K->156825K(157248K), 0.0000151 secs]0.757: [Tenured: 303841K->302662K(349568K), 0.0544894 secs] 460667K->302662K(506816K), [Metaspace: 3294K->3294K(1056768K)], 0.0545837 secs] [Times: user=0.06 sys=0.00, real=0.05 secs]
    0.838: [GC (Allocation Failure) 0.838: [DefNew: 139776K->17471K(157248K), 0.0100676 secs] 442438K->349146K(506816K), 0.0101409 secs] [Times: user=0.02 sys=0.00, real=0.01 secs]
    0.877: [GC (Allocation Failure) 0.877: [DefNew: 157247K->157247K(157248K), 0.0000154 secs]0.877: [Tenured: 331675K->318003K(349568K), 0.0560468 secs] 488922K->318003K(506816K), [Metaspace: 3294K->3294K(1056768K)], 0.0561502 secs] [Times: user=0.05 sys=0.00, real=0.06 secs]
    0.959: [GC (Allocation Failure) 0.959: [DefNew: 139218K->139218K(157248K), 0.0000113 secs]0.959: [Tenured: 318003K->306044K(349568K), 0.0541662 secs] 457222K->306044K(506816K), [Metaspace: 3294K->3294K(1056768K)], 0.0542477 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
    1.040: [GC (Allocation Failure) 1.040: [DefNew: 139776K->17471K(157248K), 0.0106149 secs] 445820K->354868K(506816K), 0.0106900 secs] [Times: user=0.02 sys=0.00, real=0.01 secs]
    1.079: [GC (Allocation Failure) 1.079: [DefNew: 157247K->157247K(157248K), 0.0000136 secs]1.079: [Tenured: 337396K->335097K(349568K), 0.0455844 secs] 494644K->335097K(506816K), [Metaspace: 3800K->3800K(1056768K)], 0.0456740 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
    Heap
    def new generation   total 157248K, used 5696K [0x00000000e0000000, 0x00000000eaaa0000, 0x00000000eaaa0000)
    eden space 139776K,   4% used [0x00000000e0000000, 0x00000000e0590128, 0x00000000e8880000)
    from space 17472K,   0% used [0x00000000e9990000, 0x00000000e9990000, 0x00000000eaaa0000)
    to   space 17472K,   0% used [0x00000000e8880000, 0x00000000e8880000, 0x00000000e9990000)
    tenured generation   total 349568K, used 335097K [0x00000000eaaa0000, 0x0000000100000000, 0x0000000100000000)
    the space 349568K,  95% used [0x00000000eaaa0000, 0x00000000ff1de658, 0x00000000ff1de800, 0x0000000100000000)
    Metaspace       used 3807K, capacity 4540K, committed 4864K, reserved 1056768K
    class space    used 420K, capacity 428K, committed 512K, reserved 1048576K
##### -Xmx1g -Xms1g
    Java HotSpot(TM) 64-Bit Server VM (25.251-b08) for windows-amd64 JRE (1.8.0_251-b08), built on Mar 12 2020 06:31:49 by "" with MS VC++ 10.0 (VS2010)
    Memory: 4k page, physical 16112436k(6252380k free), swap 21355316k(5019348k free)
    CommandLine flags: -XX:InitialHeapSize=1073741824 -XX:MaxHeapSize=1073741824 -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseSerialGC
    0.222: [GC (Allocation Failure) 0.222: [DefNew: 279616K->34944K(314560K), 0.0299944 secs] 279616K->82260K(1013632K), 0.0302226 secs] [Times: user=0.00 sys=0.03, real=0.03 secs]
    0.303: [GC (Allocation Failure) 0.303: [DefNew: 314560K->34943K(314560K), 0.0432147 secs] 361876K->167062K(1013632K), 0.0432725 secs] [Times: user=0.00 sys=0.05, real=0.04 secs]
    0.396: [GC (Allocation Failure) 0.396: [DefNew: 314559K->34943K(314560K), 0.0347396 secs] 446678K->252291K(1013632K), 0.0348090 secs] [Times: user=0.02 sys=0.02, real=0.03 secs]
    0.484: [GC (Allocation Failure) 0.484: [DefNew: 314559K->34943K(314560K), 0.0313867 secs] 531907K->327590K(1013632K), 0.0314806 secs] [Times: user=0.00 sys=0.03, real=0.03 secs]
    0.563: [GC (Allocation Failure) 0.563: [DefNew: 314559K->34943K(314560K), 0.0309136 secs] 607206K->400410K(1013632K), 0.0310767 secs] [Times: user=0.03 sys=0.00, real=0.03 secs]
    0.647: [GC (Allocation Failure) 0.648: [DefNew: 314559K->34943K(314560K), 0.0324953 secs] 680026K->474199K(1013632K), 0.0325668 secs] [Times: user=0.02 sys=0.02, real=0.03 secs]
    0.729: [GC (Allocation Failure) 0.730: [DefNew: 314197K->34944K(314560K), 0.0350617 secs] 753454K->560052K(1013632K), 0.0351228 secs] [Times: user=0.00 sys=0.03, real=0.03 secs]
    0.814: [GC (Allocation Failure) 0.814: [DefNew: 314560K->34943K(314560K), 0.0363800 secs] 839668K->639649K(1013632K), 0.0364458 secs] [Times: user=0.03 sys=0.00, real=0.04 secs]
    0.900: [GC (Allocation Failure) 0.901: [DefNew: 314559K->34943K(314560K), 0.1019110 secs] 919265K->721099K(1013632K), 0.1019746 secs] [Times: user=0.03 sys=0.08, real=0.10 secs]
    1.071: [GC (Allocation Failure) 1.071: [DefNew: 314559K->314559K(314560K), 0.0000191 secs]1.071: [Tenured: 686155K->388397K(699072K), 0.0683696 secs] 1000715K->388397K(1013632K), [Metaspace: 3291K->3291K(1056768K)], 0.0684757 secs] [Times: user=0.08 sys=0.00, real=0.07 secs]
    Heap
    def new generation   total 314560K, used 16960K [0x00000000c0000000, 0x00000000d5550000, 0x00000000d5550000)
    eden space 279616K,   6% used [0x00000000c0000000, 0x00000000c1090310, 0x00000000d1110000)
    from space 34944K,   0% used [0x00000000d3330000, 0x00000000d3330000, 0x00000000d5550000)
    to   space 34944K,   0% used [0x00000000d1110000, 0x00000000d1110000, 0x00000000d3330000)
    tenured generation   total 699072K, used 388397K [0x00000000d5550000, 0x0000000100000000, 0x0000000100000000)
    the space 699072K,  55% used [0x00000000d5550000, 0x00000000ed09b4d0, 0x00000000ed09b600, 0x0000000100000000)
    Metaspace       used 3310K, capacity 4500K, committed 4864K, reserved 1056768K
    class space    used 361K, capacity 388K, committed 512K, reserved 1048576K
##### -Xms4g -Xmx4g
    Java HotSpot(TM) 64-Bit Server VM (25.251-b08) for windows-amd64 JRE (1.8.0_251-b08), built on Mar 12 2020 06:31:49 by "" with MS VC++ 10.0 (VS2010)
    Memory: 4k page, physical 16112436k(7330440k free), swap 20831028k(8089256k free)
    CommandLine flags: -XX:InitialHeapSize=4294967296 -XX:MaxHeapSize=4294967296 -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseSerialGC
    1.005: [GC (Allocation Failure) 1.006: [DefNew: 1118528K->139775K(1258304K), 0.0929768 secs] 1118528K->231488K(4054528K), 0.0939254 secs] [Times: user=0.03 sys=0.06, real=0.09 secs]
    Heap
    def new generation   total 1258304K, used 218080K [0x00000006c0000000, 0x0000000715550000, 0x0000000715550000)
    eden space 1118528K,   7% used [0x00000006c0000000, 0x00000006c4c782a0, 0x0000000704450000)
    from space 139776K,  99% used [0x000000070ccd0000, 0x000000071554fff8, 0x0000000715550000)
    to   space 139776K,   0% used [0x0000000704450000, 0x0000000704450000, 0x000000070ccd0000)
    tenured generation   total 2796224K, used 91712K [0x0000000715550000, 0x00000007c0000000, 0x00000007c0000000)
    the space 2796224K,   3% used [0x0000000715550000, 0x000000071aee0248, 0x000000071aee0400, 0x00000007c0000000)
    Metaspace       used 3299K, capacity 4500K, committed 4864K, reserved 1056768K
    class space    used 359K, capacity 388K, committed 512K, reserved 1048576K

### 分析：
    串行GC的年轻代叫def new，年老代叫tenured
    -Xmx512m -Xms512m，发生了16次GC，其中11次年轻代，5次老年代。在最后一次GC中发现老年代占用了95%快满了。于是增加了程序执行时间，发现超过1秒后，每次GC都会触发Full GC。
    -Xmx1g -Xms1g，发生了10次GC，其中9次年轻代，1次老年代。
    -Xms4g -Xmx4g，只发生了一次年轻代GC。

##### -Xmx1g -Xms1g时的表格分析
|GC区域|距离上一次GC时长|GC发生时年轻代|GC发生后年轻代|释放年轻代|老年代增量|GC后总内存|GC所需时间
|----|----|----|----|----|----|----|----|
|DefNew|222ms|273.06M|34.13M|238.94M|46.21M|80.33M|30ms|
|DefNew|81ms|306.29M|34.12M|273.06M|82.81M|163.15M|43ms|
|DefNew|93ms|307.19M|34.12M|273.07M|83.23M|246.38M|35ms|
|DefNew|88ms|307.19M|34.12M|273.07M|73.54M|319.91M|31ms|
|DefNew|79ms|307.19M|34.12M|273.07M|71.11M|391.03M|31ms|
|DefNew|85ms|307.19M|34.12M|273.07M|72.06M|463.08M|32ms|
|DefNew|82ms|306.83M|34.12M|272.71M|83.84M|546.93M|35ms|
|DefNew|84ms|307.19M|34.12M|273.07M|77.73M|624.66M|36ms|
|DefNew|87ms|307.19M|34.12M|273.07M|79.54M|704.20M|102ms|
|Tenured|170ms|307.19M|307.19M|0M|-290.78M|379.29M|0.02ms|

# 并行GC
### gc log:
##### -Xms512m -Xmx512m
    Java HotSpot(TM) 64-Bit Server VM (25.251-b08) for windows-amd64 JRE (1.8.0_251-b08), built on Mar 12 2020 06:31:49 by "" with MS VC++ 10.0 (VS2010)
    Memory: 4k page, physical 16112436k(6298900k free), swap 20831028k(6557448k free)
    CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseParallelGC
    0.170: [GC (Allocation Failure) [PSYoungGen: 131584K->21502K(153088K)] 131584K->45060K(502784K), 0.0085655 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
    0.203: [GC (Allocation Failure) [PSYoungGen: 153086K->21488K(153088K)] 176644K->86520K(502784K), 0.0119576 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
    0.241: [GC (Allocation Failure) [PSYoungGen: 152975K->21500K(153088K)] 218006K->124179K(502784K), 0.0096083 secs] [Times: user=0.05 sys=0.09, real=0.01 secs]
    0.275: [GC (Allocation Failure) [PSYoungGen: 153084K->21489K(153088K)] 255763K->165554K(502784K), 0.0106813 secs] [Times: user=0.02 sys=0.13, real=0.01 secs]
    0.309: [GC (Allocation Failure) [PSYoungGen: 153048K->21490K(153088K)] 297113K->211439K(502784K), 0.0120571 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
    0.346: [GC (Allocation Failure) [PSYoungGen: 152913K->21500K(80384K)] 342862K->257656K(430080K), 0.0114579 secs] [Times: user=0.03 sys=0.11, real=0.01 secs]
    0.367: [GC (Allocation Failure) [PSYoungGen: 80380K->35488K(116736K)] 316536K->275448K(466432K), 0.0056351 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
    0.383: [GC (Allocation Failure) [PSYoungGen: 94368K->45337K(116736K)] 334328K->289960K(466432K), 0.0067062 secs] [Times: user=0.11 sys=0.05, real=0.01 secs]
    0.398: [GC (Allocation Failure) [PSYoungGen: 104217K->53843K(116736K)] 348840K->308169K(466432K), 0.0083477 secs] [Times: user=0.13 sys=0.03, real=0.01 secs]
    0.415: [GC (Allocation Failure) [PSYoungGen: 112723K->41170K(116736K)] 367049K->326704K(466432K), 0.0108672 secs] [Times: user=0.05 sys=0.11, real=0.01 secs]
    0.435: [GC (Allocation Failure) [PSYoungGen: 99695K->25297K(116736K)] 385229K->348565K(466432K), 0.0102606 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
    0.445: [Full GC (Ergonomics) [PSYoungGen: 25297K->0K(116736K)] [ParOldGen: 323267K->258105K(349696K)] 348565K->258105K(466432K), [Metaspace: 3291K->3291K(1056768K)], 0.0352173 secs] [Times: user=0.28 sys=0.03, real=0.04 secs]
    0.489: [GC (Allocation Failure) [PSYoungGen: 58279K->20749K(116736K)] 316385K->278855K(466432K), 0.0027560 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.502: [GC (Allocation Failure) [PSYoungGen: 79624K->19799K(116736K)] 337729K->296586K(466432K), 0.0047786 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.516: [GC (Allocation Failure) [PSYoungGen: 78679K->22477K(116736K)] 355466K->317708K(466432K), 0.0051020 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.521: [Full GC (Ergonomics) [PSYoungGen: 22477K->0K(116736K)] [ParOldGen: 295230K->273117K(349696K)] 317708K->273117K(466432K), [Metaspace: 3291K->3291K(1056768K)], 0.0339525 secs] [Times: user=0.31 sys=0.00, real=0.03 secs]
    0.564: [GC (Allocation Failure) [PSYoungGen: 58880K->26612K(116736K)] 331997K->299730K(466432K), 0.0031755 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.578: [GC (Allocation Failure) [PSYoungGen: 85492K->21162K(116736K)] 358610K->319226K(466432K), 0.0050495 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.592: [GC (Allocation Failure) [PSYoungGen: 80042K->21975K(116736K)] 378106K->339355K(466432K), 0.0049628 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
    0.597: [Full GC (Ergonomics) [PSYoungGen: 21975K->0K(116736K)] [ParOldGen: 317379K->296099K(349696K)] 339355K->296099K(466432K), [Metaspace: 3291K->3291K(1056768K)], 0.0367851 secs] [Times: user=0.30 sys=0.00, real=0.04 secs]
    0.644: [GC (Allocation Failure) [PSYoungGen: 58880K->24894K(116736K)] 354979K->320994K(466432K), 0.0032154 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.657: [GC (Allocation Failure) [PSYoungGen: 83774K->21021K(116736K)] 379874K->341222K(466432K), 0.0054525 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.662: [Full GC (Ergonomics) [PSYoungGen: 21021K->0K(116736K)] [ParOldGen: 320200K->306308K(349696K)] 341222K->306308K(466432K), [Metaspace: 3291K->3291K(1056768K)], 0.0374120 secs] [Times: user=0.31 sys=0.00, real=0.04 secs]
    0.710: [Full GC (Ergonomics) [PSYoungGen: 58793K->0K(116736K)] [ParOldGen: 306308K->312536K(349696K)] 365102K->312536K(466432K), [Metaspace: 3291K->3291K(1056768K)], 0.0395072 secs] [Times: user=0.47 sys=0.00, real=0.04 secs]
    0.760: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 312536K->316249K(349696K)] 371416K->316249K(466432K), [Metaspace: 3291K->3291K(1056768K)], 0.0405137 secs] [Times: user=0.47 sys=0.00, real=0.04 secs]
    0.811: [Full GC (Ergonomics) [PSYoungGen: 58792K->0K(116736K)] [ParOldGen: 316249K->319759K(349696K)] 375042K->319759K(466432K), [Metaspace: 3291K->3291K(1056768K)], 0.0399111 secs] [Times: user=0.31 sys=0.00, real=0.04 secs]
    0.862: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 319759K->314556K(349696K)] 378639K->314556K(466432K), [Metaspace: 3291K->3291K(1056768K)], 0.0429603 secs] [Times: user=0.44 sys=0.00, real=0.04 secs]
    0.915: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 314556K->316996K(349696K)] 373436K->316996K(466432K), [Metaspace: 3291K->3291K(1056768K)], 0.0423806 secs] [Times: user=0.41 sys=0.00, real=0.04 secs]
    0.967: [Full GC (Ergonomics) [PSYoungGen: 58705K->0K(116736K)] [ParOldGen: 316996K->318690K(349696K)] 375701K->318690K(466432K), [Metaspace: 3291K->3291K(1056768K)], 0.0419847 secs] [Times: user=0.31 sys=0.00, real=0.04 secs]
    1.019: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 318690K->324329K(349696K)] 377570K->324329K(466432K), [Metaspace: 3291K->3291K(1056768K)], 0.0382320 secs] [Times: user=0.30 sys=0.00, real=0.04 secs]
    1.068: [Full GC (Ergonomics) [PSYoungGen: 58545K->0K(116736K)] [ParOldGen: 324329K->321721K(349696K)] 382874K->321721K(466432K), [Metaspace: 3291K->3291K(1056768K)], 0.0433897 secs] [Times: user=0.44 sys=0.00, real=0.04 secs]
    Heap
    PSYoungGen      total 116736K, used 4182K [0x00000000f5580000, 0x0000000100000000, 0x0000000100000000)
    eden space 58880K, 7% used [0x00000000f5580000,0x00000000f5995af8,0x00000000f8f00000)
    from space 57856K, 0% used [0x00000000f8f00000,0x00000000f8f00000,0x00000000fc780000)
    to   space 57856K, 0% used [0x00000000fc780000,0x00000000fc780000,0x0000000100000000)
    ParOldGen       total 349696K, used 321721K [0x00000000e0000000, 0x00000000f5580000, 0x00000000f5580000)
    object space 349696K, 92% used [0x00000000e0000000,0x00000000f3a2e520,0x00000000f5580000)
    Metaspace       used 3307K, capacity 4500K, committed 4864K, reserved 1056768K
    class space    used 360K, capacity 388K, committed 512K, reserved 1048576K
##### -Xmx1g -Xms1g
    Java HotSpot(TM) 64-Bit Server VM (25.251-b08) for windows-amd64 JRE (1.8.0_251-b08), built on Mar 12 2020 06:31:49 by "" with MS VC++ 10.0 (VS2010)
    Memory: 4k page, physical 16112436k(5876624k free), swap 21355316k(4731644k free)
    CommandLine flags: -XX:InitialHeapSize=1073741824 -XX:MaxHeapSize=1073741824 -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseParallelGC
    0.217: [GC (Allocation Failure) [PSYoungGen: 262144K->43510K(305664K)] 262144K->74278K(1005056K), 0.0135045 secs] [Times: user=0.00 sys=0.01, real=0.01 secs]
    0.281: [GC (Allocation Failure) [PSYoungGen: 305654K->43515K(305664K)] 336422K->149051K(1005056K), 0.0212984 secs] [Times: user=0.02 sys=0.14, real=0.02 secs]
    0.353: [GC (Allocation Failure) [PSYoungGen: 305659K->43509K(305664K)] 411195K->220354K(1005056K), 0.0172680 secs] [Times: user=0.08 sys=0.08, real=0.02 secs]
    0.418: [GC (Allocation Failure) [PSYoungGen: 305653K->43517K(305664K)] 482498K->297811K(1005056K), 0.0186242 secs] [Times: user=0.16 sys=0.02, real=0.02 secs]
    0.487: [GC (Allocation Failure) [PSYoungGen: 305661K->43519K(305664K)] 559955K->368063K(1005056K), 0.0168784 secs] [Times: user=0.02 sys=0.14, real=0.02 secs]
    0.552: [GC (Allocation Failure) [PSYoungGen: 305663K->43502K(160256K)] 630207K->446493K(859648K), 0.0201602 secs] [Times: user=0.00 sys=0.16, real=0.02 secs]
    0.591: [GC (Allocation Failure) [PSYoungGen: 160238K->70330K(232960K)] 563229K->483280K(932352K), 0.0100849 secs] [Times: user=0.13 sys=0.00, real=0.01 secs]
    0.620: [GC (Allocation Failure) [PSYoungGen: 187066K->97513K(232960K)] 600016K->516826K(932352K), 0.0125643 secs] [Times: user=0.16 sys=0.00, real=0.01 secs]
    0.652: [GC (Allocation Failure) [PSYoungGen: 214249K->113178K(232960K)] 633562K->551330K(932352K), 0.0147855 secs] [Times: user=0.16 sys=0.00, real=0.01 secs]
    0.688: [GC (Allocation Failure) [PSYoungGen: 229715K->78557K(232960K)] 667867K->583414K(932352K), 0.0185283 secs] [Times: user=0.08 sys=0.08, real=0.02 secs]
    0.727: [GC (Allocation Failure) [PSYoungGen: 195257K->35745K(232960K)] 700114K->612209K(932352K), 0.0156672 secs] [Times: user=0.06 sys=0.06, real=0.02 secs]
    0.761: [GC (Allocation Failure) [PSYoungGen: 152481K->39426K(232960K)] 728945K->649080K(932352K), 0.0110699 secs] [Times: user=0.03 sys=0.11, real=0.01 secs]
    0.772: [Full GC (Ergonomics) [PSYoungGen: 39426K->0K(232960K)] [ParOldGen: 609654K->340833K(699392K)] 649080K->340833K(932352K), [Metaspace: 3293K->3293K(1056768K)], 0.0514711 secs] [Times: user=0.39 sys=0.00, real=0.05 secs]
    0.845: [GC (Allocation Failure) [PSYoungGen: 116736K->41277K(232960K)] 457569K->382111K(932352K), 0.0051369 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
    0.872: [GC (Allocation Failure) [PSYoungGen: 158013K->39999K(232960K)] 498847K->419088K(932352K), 0.0092360 secs] [Times: user=0.14 sys=0.00, real=0.01 secs]
    0.903: [GC (Allocation Failure) [PSYoungGen: 156735K->41926K(232960K)] 535824K->456670K(932352K), 0.0106374 secs] [Times: user=0.14 sys=0.00, real=0.01 secs]
    0.936: [GC (Allocation Failure) [PSYoungGen: 158662K->33859K(232960K)] 573406K->487494K(932352K), 0.0096101 secs] [Times: user=0.13 sys=0.00, real=0.01 secs]
    0.970: [GC (Allocation Failure) [PSYoungGen: 150595K->43972K(232960K)] 604230K->525062K(932352K), 0.0096348 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
    1.003: [GC (Allocation Failure) [PSYoungGen: 160708K->40778K(232960K)] 641798K->560139K(932352K), 0.0099968 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
    1.035: [GC (Allocation Failure) [PSYoungGen: 157514K->39487K(232960K)] 676875K->596693K(932352K), 0.0097253 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
    1.069: [GC (Allocation Failure) [PSYoungGen: 156223K->38411K(232960K)] 713429K->630462K(932352K), 0.0099633 secs] [Times: user=0.14 sys=0.00, real=0.01 secs]
    1.101: [GC (Allocation Failure) [PSYoungGen: 155147K->40394K(232960K)] 747198K->667562K(932352K), 0.0111696 secs] [Times: user=0.08 sys=0.06, real=0.01 secs]
    1.113: [Full GC (Ergonomics) [PSYoungGen: 40394K->0K(232960K)] [ParOldGen: 627167K->376698K(699392K)] 667562K->376698K(932352K), [Metaspace: 3799K->3799K(1056768K)], 0.0559006 secs] [Times: user=0.42 sys=0.00, real=0.06 secs]
    Heap
    PSYoungGen      total 232960K, used 4737K [0x00000000eab00000, 0x0000000100000000, 0x0000000100000000)
    eden space 116736K, 4% used [0x00000000eab00000,0x00000000eafa04c0,0x00000000f1d00000)
    from space 116224K, 0% used [0x00000000f1d00000,0x00000000f1d00000,0x00000000f8e80000)
    to   space 116224K, 0% used [0x00000000f8e80000,0x00000000f8e80000,0x0000000100000000)
    ParOldGen       total 699392K, used 376698K [0x00000000c0000000, 0x00000000eab00000, 0x00000000eab00000)
    object space 699392K, 53% used [0x00000000c0000000,0x00000000d6fde9a0,0x00000000eab00000)
    Metaspace       used 3806K, capacity 4540K, committed 4864K, reserved 1056768K
    class space    used 420K, capacity 428K, committed 512K, reserved 1048576K
##### -Xms4g -Xmx4g
    Java HotSpot(TM) 64-Bit Server VM (25.251-b08) for windows-amd64 JRE (1.8.0_251-b08), built on Mar 12 2020 06:31:49 by "" with MS VC++ 10.0 (VS2010)
    Memory: 4k page, physical 16112436k(6311320k free), swap 20831028k(6571816k free)
    CommandLine flags: -XX:InitialHeapSize=4294967296 -XX:MaxHeapSize=4294967296 -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:-UseLargePagesIndividualAllocation -XX:+UseParallelGC
    0.495: [GC (Allocation Failure) [PSYoungGen: 1048576K->174587K(1223168K)] 1048576K->231117K(4019712K), 0.0585350 secs] [Times: user=0.11 sys=0.41, real=0.06 secs]
    0.766: [GC (Allocation Failure) [PSYoungGen: 1223163K->174577K(1223168K)] 1279693K->361860K(4019712K), 0.0683591 secs] [Times: user=0.16 sys=0.31, real=0.07 secs]
    1.029: [GC (Allocation Failure) [PSYoungGen: 1223153K->174585K(1223168K)] 1410436K->486415K(4019712K), 0.0486986 secs] [Times: user=0.42 sys=0.13, real=0.05 secs]
    Heap
    PSYoungGen      total 1223168K, used 342769K [0x000000076ab00000, 0x00000007c0000000, 0x00000007c0000000)
    eden space 1048576K, 16% used [0x000000076ab00000,0x0000000774f3df40,0x00000007aab00000)
    from space 174592K, 99% used [0x00000007aab00000,0x00000007b557e650,0x00000007b5580000)
    to   space 174592K, 0% used [0x00000007b5580000,0x00000007b5580000,0x00000007c0000000)
    ParOldGen       total 2796544K, used 311829K [0x00000006c0000000, 0x000000076ab00000, 0x000000076ab00000)
    object space 2796544K, 11% used [0x00000006c0000000,0x00000006d30855c8,0x000000076ab00000)
    Metaspace       used 3301K, capacity 4500K, committed 4864K, reserved 1056768K
    class space    used 359K, capacity 388K, committed 512K, reserved 1048576K
### 分析
    并行GC的年轻代叫PSYoungGen，老年代叫ParOldGen
    -Xms512m -Xmx512m，发生了31次GC，其中19次Young GC，每次3-10ms；12次Full GC，每次33-43ms。在662ms时每次GC都是Full GC。
    -Xmx1g -Xms1g，发生了23次GC，其中21次Young GC，每次十几毫秒；2次Full GC，每次50ms。
    -Xmx4g -Xms4g，发生了3次GC，都是Young GC，每次48-68ms。
    增加了内存后，GC发生频率降低了，同时每次GC的耗时也增加了，但是总耗时大幅度降低。

# CMS GC
### gc log:
##### -Xmx512m -Xms512m
    Java HotSpot(TM) 64-Bit Server VM (25.251-b08) for windows-amd64 JRE (1.8.0_251-b08), built on Mar 12 2020 06:31:49 by "" with MS VC++ 10.0 (VS2010)
    Memory: 4k page, physical 16112436k(7313804k free), swap 20831028k(6737248k free)
    CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:MaxNewSize=178958336 -XX:MaxTenuringThreshold=6 -XX:NewSize=178958336 -XX:OldPLABSize=16 -XX:OldSize=357912576 -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:-UseLargePagesIndividualAllocation -XX:+UseParNewGC
    0.168: [GC (Allocation Failure) 0.169: [ParNew: 139776K->17472K(157248K), 0.0096672 secs] 139776K->44659K(506816K), 0.0099302 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
    0.203: [GC (Allocation Failure) 0.203: [ParNew: 157248K->17472K(157248K), 0.0120183 secs] 184435K->83677K(506816K), 0.0120977 secs] [Times: user=0.03 sys=0.09, real=0.01 secs]
    0.240: [GC (Allocation Failure) 0.240: [ParNew: 157248K->17470K(157248K), 0.0199978 secs] 223453K->125952K(506816K), 0.0200711 secs] [Times: user=0.14 sys=0.02, real=0.02 secs]
    0.284: [GC (Allocation Failure) 0.284: [ParNew: 157163K->17472K(157248K), 0.0215340 secs] 265645K->173410K(506816K), 0.0215985 secs] [Times: user=0.16 sys=0.00, real=0.02 secs]
    0.332: [GC (Allocation Failure) 0.332: [ParNew: 157248K->17471K(157248K), 0.0218289 secs] 313186K->220481K(506816K), 0.0218857 secs] [Times: user=0.13 sys=0.02, real=0.02 secs]
    0.354: [GC (CMS Initial Mark) [1 CMS-initial-mark: 203009K(349568K)] 223423K(506816K), 0.0003143 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.354: [CMS-concurrent-mark-start]
    0.355: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.355: [CMS-concurrent-preclean-start]
    0.356: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.356: [CMS-concurrent-abortable-preclean-start]
    0.379: [GC (Allocation Failure) 0.379: [ParNew: 157247K->17469K(157248K), 0.0181496 secs] 360257K->262088K(506816K), 0.0182178 secs] [Times: user=0.16 sys=0.00, real=0.02 secs]
    0.422: [GC (Allocation Failure) 0.422: [ParNew: 157245K->17471K(157248K), 0.0205700 secs] 401864K->308869K(506816K), 0.0206484 secs] [Times: user=0.14 sys=0.02, real=0.02 secs]
    0.466: [GC (Allocation Failure) 0.466: [ParNew: 156719K->17471K(157248K), 0.0211415 secs] 448117K->355312K(506816K), 0.0212216 secs] [Times: user=0.16 sys=0.00, real=0.02 secs]
    0.487: [CMS-concurrent-abortable-preclean: 0.002/0.131 secs] [Times: user=0.53 sys=0.02, real=0.13 secs]
    0.487: [GC (CMS Final Remark) [YG occupancy: 20988 K (157248 K)]0.487: [Rescan (parallel) , 0.0003913 secs]0.488: [weak refs processing, 0.0000123 secs]0.488: [class unloading, 0.0002687 secs]0.488: [scrub symbol table, 0.0004711 secs]0.488: [scrub string table, 0.0001562 secs][1 CMS-remark: 337841K(349568K)] 358829K(506816K), 0.0013840 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.489: [CMS-concurrent-sweep-start]
    0.490: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.490: [CMS-concurrent-reset-start]
    0.491: [CMS-concurrent-reset: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.511: [GC (Allocation Failure) 0.511: [ParNew (promotion failed): 157247K->157246K(157248K), 0.0140463 secs]0.525: [CMS: 347288K->269650K(349568K), 0.0463062 secs] 456828K->269650K(506816K), [Metaspace: 3293K->3293K(1056768K)], 0.0604751 secs] [Times: user=0.05 sys=0.00, real=0.06 secs]
    0.572: [GC (CMS Initial Mark) [1 CMS-initial-mark: 269650K(349568K)] 270441K(506816K), 0.0002954 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.572: [CMS-concurrent-mark-start]
    0.573: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.06 sys=0.00, real=0.00 secs]
    0.573: [CMS-concurrent-preclean-start]
    0.574: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.574: [CMS-concurrent-abortable-preclean-start]
    0.596: [GC (Allocation Failure) 0.596: [ParNew: 139776K->17471K(157248K), 0.0077351 secs] 409426K->312492K(506816K), 0.0078804 secs] [Times: user=0.16 sys=0.00, real=0.01 secs]
    0.628: [GC (Allocation Failure) 0.628: [ParNew: 157199K->17470K(157248K), 0.0116332 secs] 452220K->358643K(506816K), 0.0116914 secs] [Times: user=0.16 sys=0.00, real=0.01 secs]
    0.640: [CMS-concurrent-abortable-preclean: 0.001/0.066 secs] [Times: user=0.34 sys=0.00, real=0.07 secs]
    0.640: [GC (CMS Final Remark) [YG occupancy: 20304 K (157248 K)]0.640: [Rescan (parallel) , 0.0003446 secs]0.640: [weak refs processing, 0.0000086 secs]0.640: [class unloading, 0.0002705 secs]0.640: [scrub symbol table, 0.0004279 secs]0.641: [scrub string table, 0.0000904 secs][1 CMS-remark: 341173K(349568K)] 361477K(506816K), 0.0012028 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.641: [CMS-concurrent-sweep-start]
    0.642: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.642: [CMS-concurrent-reset-start]
    0.642: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.664: [GC (Allocation Failure) 0.664: [ParNew: 157246K->157246K(157248K), 0.0000285 secs]0.664: [CMS: 341173K->302401K(349568K), 0.0481232 secs] 498419K->302401K(506816K), [Metaspace: 3293K->3293K(1056768K)], 0.0482436 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
    0.712: [GC (CMS Initial Mark) [1 CMS-initial-mark: 302401K(349568K)] 302998K(506816K), 0.0004796 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.713: [CMS-concurrent-mark-start]
    0.714: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.06 sys=0.00, real=0.00 secs]
    0.714: [CMS-concurrent-preclean-start]
    0.715: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.715: [CMS-concurrent-abortable-preclean-start]
    0.736: [GC (Allocation Failure) 0.736: [ParNew: 139776K->17469K(157248K), 0.0087789 secs] 442177K->349426K(506816K), 0.0088386 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
    0.745: [CMS-concurrent-abortable-preclean: 0.000/0.030 secs] [Times: user=0.02 sys=0.00, real=0.03 secs]
    0.745: [GC (CMS Final Remark) [YG occupancy: 20531 K (157248 K)]0.745: [Rescan (parallel) , 0.0004123 secs]0.745: [weak refs processing, 0.0000071 secs]0.745: [class unloading, 0.0002762 secs]0.746: [scrub symbol table, 0.0004338 secs]0.746: [scrub string table, 0.0000890 secs][1 CMS-remark: 331957K(349568K)] 352489K(506816K), 0.0012643 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.746: [CMS-concurrent-sweep-start]
    0.747: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.747: [CMS-concurrent-reset-start]
    0.747: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.770: [GC (Allocation Failure) 0.770: [ParNew: 157245K->157245K(157248K), 0.0000301 secs]0.770: [CMS: 331596K->318546K(349568K), 0.0501004 secs] 488842K->318546K(506816K), [Metaspace: 3293K->3293K(1056768K)], 0.0502441 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
    0.821: [GC (CMS Initial Mark) [1 CMS-initial-mark: 318546K(349568K)] 321838K(506816K), 0.0005231 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.821: [CMS-concurrent-mark-start]
    0.823: [CMS-concurrent-mark: 0.002/0.002 secs] [Times: user=0.06 sys=0.00, real=0.00 secs]
    0.823: [CMS-concurrent-preclean-start]
    0.823: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.823: [CMS-concurrent-abortable-preclean-start]
    0.846: [GC (Allocation Failure) 0.846: [ParNew (promotion failed): 139280K->156752K(157248K), 0.0092658 secs]0.855: [CMS0.855: [CMS-concurrent-abortable-preclean: 0.000/0.032 secs] [Times: user=0.17 sys=0.00, real=0.03 secs]
    (concurrent mode failure): 349397K->335376K(349568K), 0.0529592 secs] 457827K->335376K(506816K), [Metaspace: 3293K->3293K(1056768K)], 0.0623411 secs] [Times: user=0.20 sys=0.00, real=0.06 secs]
    0.932: [GC (Allocation Failure) 0.932: [ParNew: 139608K->139608K(157248K), 0.0000238 secs]0.932: [CMS: 335376K->343289K(349568K), 0.0539990 secs] 474985K->343289K(506816K), [Metaspace: 3293K->3293K(1056768K)], 0.0541057 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
    0.986: [GC (CMS Initial Mark) [1 CMS-initial-mark: 343289K(349568K)] 343694K(506816K), 0.0003899 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.986: [CMS-concurrent-mark-start]
    0.988: [CMS-concurrent-mark: 0.002/0.002 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.988: [CMS-concurrent-preclean-start]
    0.989: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.989: [CMS-concurrent-abortable-preclean-start]
    0.989: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.989: [GC (CMS Final Remark) [YG occupancy: 15939 K (157248 K)]0.989: [Rescan (parallel) , 0.0004369 secs]0.989: [weak refs processing, 0.0000090 secs]0.989: [class unloading, 0.0002771 secs]0.990: [scrub symbol table, 0.0004212 secs]0.990: [scrub string table, 0.0000914 secs][1 CMS-remark: 343289K(349568K)] 359229K(506816K), 0.0013052 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.990: [CMS-concurrent-sweep-start]
    0.991: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.991: [CMS-concurrent-reset-start]
    0.991: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    1.011: [GC (Allocation Failure) 1.011: [ParNew: 139776K->139776K(157248K), 0.0000146 secs]1.011: [CMS: 342568K->349288K(349568K), 0.0578824 secs] 482344K->351064K(506816K), [Metaspace: 3293K->3293K(1056768K)], 0.0579631 secs] [Times: user=0.05 sys=0.00, real=0.06 secs]
    1.070: [GC (CMS Initial Mark) [1 CMS-initial-mark: 349288K(349568K)] 356708K(506816K), 0.0004398 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    1.070: [CMS-concurrent-mark-start]
    1.071: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    1.071: [CMS-concurrent-preclean-start]
    1.073: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.03 sys=0.01, real=0.00 secs]
    1.073: [CMS-concurrent-abortable-preclean-start]
    1.073: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    1.073: [GC (CMS Final Remark) [YG occupancy: 19629 K (157248 K)]1.073: [Rescan (parallel) , 0.0004311 secs]1.074: [weak refs processing, 0.0000098 secs]1.074: [class unloading, 0.0003316 secs]1.074: [scrub symbol table, 0.0005796 secs]1.075: [scrub string table, 0.0001255 secs][1 CMS-remark: 349288K(349568K)] 368918K(506816K), 0.0015637 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    1.075: [CMS-concurrent-sweep-start]
    1.076: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    1.076: [CMS-concurrent-reset-start]
    1.076: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    Heap
    par new generation   total 157248K, used 139780K [0x00000000e0000000, 0x00000000eaaa0000, 0x00000000eaaa0000)
    eden space 139776K, 100% used [0x00000000e0000000, 0x00000000e8880000, 0x00000000e8880000)
    from space 17472K,   0% used [0x00000000e9990000, 0x00000000e9991158, 0x00000000eaaa0000)
    to   space 17472K,   0% used [0x00000000e8880000, 0x00000000e8880000, 0x00000000e9990000)
    concurrent mark-sweep generation total 349568K, used 349288K [0x00000000eaaa0000, 0x0000000100000000, 0x0000000100000000)
    Metaspace       used 3807K, capacity 4540K, committed 4864K, reserved 1056768K
    class space    used 420K, capacity 428K, committed 512K, reserved 1048576K

##### -Xmx1g -Xms1g
    Java HotSpot(TM) 64-Bit Server VM (25.251-b08) for windows-amd64 JRE (1.8.0_251-b08), built on Mar 12 2020 06:31:49 by "" with MS VC++ 10.0 (VS2010)
    Memory: 4k page, physical 16112436k(5805956k free), swap 21355316k(4781156k free)
    CommandLine flags: -XX:InitialHeapSize=1073741824 -XX:MaxHeapSize=1073741824 -XX:MaxNewSize=357916672 -XX:MaxTenuringThreshold=6 -XX:NewSize=357916672 -XX:OldPLABSize=16 -XX:OldSize=715825152 -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:-UseLargePagesIndividualAllocation -XX:+UseParNewGC
    0.242: [GC (Allocation Failure) 0.242: [ParNew: 279616K->34944K(314560K), 0.0167985 secs] 279616K->82774K(1013632K), 0.0170636 secs] [Times: user=0.05 sys=0.08, real=0.02 secs]
    0.319: [GC (Allocation Failure) 0.319: [ParNew: 314465K->34944K(314560K), 0.0235584 secs] 362295K->159570K(1013632K), 0.0236454 secs] [Times: user=0.06 sys=0.06, real=0.02 secs]
    0.393: [GC (Allocation Failure) 0.393: [ParNew: 314560K->34944K(314560K), 0.0386213 secs] 439186K->236944K(1013632K), 0.0386738 secs] [Times: user=0.39 sys=0.03, real=0.04 secs]
    0.481: [GC (Allocation Failure) 0.481: [ParNew: 314423K->34944K(314560K), 0.0388414 secs] 516423K->317086K(1013632K), 0.0389686 secs] [Times: user=0.41 sys=0.06, real=0.04 secs]
    0.568: [GC (Allocation Failure) 0.568: [ParNew: 314560K->34943K(314560K), 0.0421206 secs] 596702K->405754K(1013632K), 0.0422091 secs] [Times: user=0.31 sys=0.00, real=0.04 secs]
    0.610: [GC (CMS Initial Mark) [1 CMS-initial-mark: 370811K(699072K)] 406510K(1013632K), 0.0002390 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.610: [CMS-concurrent-mark-start]
    0.612: [CMS-concurrent-mark: 0.002/0.002 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    0.612: [CMS-concurrent-preclean-start]
    0.614: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.03 sys=0.00, real=0.00 secs]
    0.614: [CMS-concurrent-abortable-preclean-start]
    0.660: [GC (Allocation Failure) 0.660: [ParNew: 314559K->34942K(314560K), 0.0405385 secs] 685370K->488930K(1013632K), 0.0405940 secs] [Times: user=0.30 sys=0.02, real=0.04 secs]
    0.756: [GC (Allocation Failure) 0.757: [ParNew: 314446K->34943K(314560K), 0.0399401 secs] 768434K->566928K(1013632K), 0.0400281 secs] [Times: user=0.28 sys=0.03, real=0.04 secs]
    0.846: [GC (Allocation Failure) 0.846: [ParNew: 314559K->34941K(314560K), 0.0400191 secs] 846544K->648850K(1013632K), 0.0400716 secs] [Times: user=0.42 sys=0.03, real=0.04 secs]
    0.935: [GC (Allocation Failure) 0.935: [ParNew: 314557K->314557K(314560K), 0.0000144 secs]0.935: [CMS0.935: [CMS-concurrent-abortable-preclean: 0.007/0.321 secs] [Times: user=1.20 sys=0.08, real=0.32 secs]
    (concurrent mode failure): 613908K->341906K(699072K), 0.0659824 secs] 928466K->341906K(1013632K), [Metaspace: 3293K->3293K(1056768K)], 0.0660722 secs] [Times: user=0.06 sys=0.00, real=0.07 secs]
    1.051: [GC (Allocation Failure) 1.051: [ParNew: 279616K->34942K(314560K), 0.0165047 secs] 621522K->429382K(1013632K), 0.0165636 secs] [Times: user=0.19 sys=0.00, real=0.02 secs]
    1.067: [GC (CMS Initial Mark) [1 CMS-initial-mark: 394439K(699072K)] 432323K(1013632K), 0.0003451 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    1.068: [CMS-concurrent-mark-start]
    1.069: [CMS-concurrent-mark: 0.002/0.002 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    1.070: [CMS-concurrent-preclean-start]
    1.070: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
    1.070: [CMS-concurrent-abortable-preclean-start]
    Heap
    par new generation   total 314560K, used 242835K [0x00000000c0000000, 0x00000000d5550000, 0x00000000d5550000)
    eden space 279616K,  74% used [0x00000000c0000000, 0x00000000ccb05258, 0x00000000d1110000)
    from space 34944K,  99% used [0x00000000d3330000, 0x00000000d554fb88, 0x00000000d5550000)
    to   space 34944K,   0% used [0x00000000d1110000, 0x00000000d1110000, 0x00000000d3330000)
    concurrent mark-sweep generation total 699072K, used 394439K [0x00000000d5550000, 0x0000000100000000, 0x0000000100000000)
    Metaspace       used 3804K, capacity 4540K, committed 4864K, reserved 1056768K
    class space    used 420K, capacity 428K, committed 512K, reserved 1048576K
##### -Xms4g -Xmx4g
    Java HotSpot(TM) 64-Bit Server VM (25.251-b08) for windows-amd64 JRE (1.8.0_251-b08), built on Mar 12 2020 06:31:49 by "" with MS VC++ 10.0 (VS2010)
    Memory: 4k page, physical 16112436k(7274716k free), swap 20831028k(6700056k free)
    CommandLine flags: -XX:InitialHeapSize=4294967296 -XX:MaxHeapSize=4294967296 -XX:MaxNewSize=872415232 -XX:MaxTenuringThreshold=6 -XX:NewSize=872415232 -XX:OldPLABSize=16 -XX:OldSize=1744830464 -XX:+PrintGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XX:-UseLargePagesIndividualAllocation -XX:+UseParNewGC
    0.372: [GC (Allocation Failure) 0.372: [ParNew: 681600K->85184K(766784K), 0.0356013 secs] 681600K->173827K(4109120K), 0.0358504 secs] [Times: user=0.06 sys=0.25, real=0.04 secs]
    0.545: [GC (Allocation Failure) 0.545: [ParNew: 766784K->85184K(766784K), 0.0414973 secs] 855427K->307838K(4109120K), 0.0415736 secs] [Times: user=0.20 sys=0.22, real=0.04 secs]
    0.708: [GC (Allocation Failure) 0.708: [ParNew: 766784K->85184K(766784K), 0.0721776 secs] 989438K->453059K(4109120K), 0.0722511 secs] [Times: user=0.75 sys=0.03, real=0.07 secs]
    0.907: [GC (Allocation Failure) 0.907: [ParNew: 766784K->85184K(766784K), 0.1332324 secs] 1134659K->601894K(4109120K), 0.1333230 secs] [Times: user=1.00 sys=0.14, real=0.13 secs]
    Heap
    par new generation   total 766784K, used 456417K [0x00000006c0000000, 0x00000006f4000000, 0x00000006f4000000)
    eden space 681600K,  54% used [0x00000006c0000000, 0x00000006d6a88468, 0x00000006e99a0000)
    from space 85184K, 100% used [0x00000006e99a0000, 0x00000006eecd0000, 0x00000006eecd0000)
    to   space 85184K,   0% used [0x00000006eecd0000, 0x00000006eecd0000, 0x00000006f4000000)
    concurrent mark-sweep generation total 3342336K, used 516710K [0x00000006f4000000, 0x00000007c0000000, 0x00000007c0000000)
    Metaspace       used 3807K, capacity 4540K, committed 4864K, reserved 1056768K
    class space    used 420K, capacity 428K, committed 512K, reserved 1048576K
### 分析
    CMS GC的年轻代叫par new generation，老年代叫concurrent mark-sweep generation
    -Xmx512m -Xms512m，发生23次GC，其中17次年轻代GC，每次最快几毫秒，最慢十几毫秒，还发生了两次ParNew (promotion failed)；6次CMS GC，每次初始标记+最终标记耗时不到1毫秒。
    -Xmx1g -Xms1g，发生12次GC，其中10次年轻代GC，每次16-42ms；2次CMS GC，每次初始标记耗时与512m大小时几乎一样，没有发生最终标记及以后阶段。
    -Xms4g -Xmx4g，发生4次GC，都是年轻代GC
    如果内存太小，会导致GC时发生ParNew (promotion failed)。
    内存大小对初始标记的耗时影响不大

# G1 GC
### gc log:
##### -Xmx512m -Xms512m
    Java HotSpot(TM) 64-Bit Server VM (25.251-b08) for windows-amd64 JRE (1.8.0_251-b08), built on Mar 12 2020 06:31:49 by "" with MS VC++ 10.0 (VS2010)
    Memory: 4k page, physical 16112436k(6777304k free), swap 20831028k(5858688k free)
    CommandLine flags: -XX:InitialHeapSize=536870912 -XX:MaxHeapSize=536870912 -XX:+PrintGC -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseG1GC -XX:-UseLargePagesIndividualAllocation
    0.142: [GC pause (G1 Evacuation Pause) (young) 29M->11M(512M), 0.0027848 secs]
    0.157: [GC pause (G1 Evacuation Pause) (young) 44M->25M(512M), 0.0030353 secs]
    0.174: [GC pause (G1 Evacuation Pause) (young) 67M->39M(512M), 0.0036851 secs]
    0.216: [GC pause (G1 Evacuation Pause) (young) 142M->70M(512M), 0.0087652 secs]
    0.247: [GC pause (G1 Evacuation Pause) (young) 180M->105M(512M), 0.0070525 secs]
    0.285: [GC pause (G1 Evacuation Pause) (young) 218M->143M(512M), 0.0099345 secs]
    0.340: [GC pause (G1 Evacuation Pause) (young) 285M->184M(512M), 0.0109966 secs]
    0.379: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 309M->218M(512M), 0.0091151 secs]
    0.388: [GC concurrent-root-region-scan-start]
    0.388: [GC concurrent-root-region-scan-end, 0.0002002 secs]
    0.388: [GC concurrent-mark-start]
    0.390: [GC concurrent-mark-end, 0.0017007 secs]
    0.390: [GC remark, 0.0019147 secs]
    0.393: [GC cleanup 227M->227M(512M), 0.0008298 secs]
    0.441: [GC pause (G1 Evacuation Pause) (young) 399M->262M(512M), 0.0112231 secs]
    0.454: [GC pause (G1 Evacuation Pause) (mixed) 267M->249M(512M), 0.0066272 secs]
    0.461: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 252M->249M(512M), 0.0014231 secs]
    0.462: [GC concurrent-root-region-scan-start]
    0.463: [GC concurrent-root-region-scan-end, 0.0001496 secs]
    0.463: [GC concurrent-mark-start]
    0.464: [GC concurrent-mark-end, 0.0017646 secs]
    0.465: [GC remark, 0.0015435 secs]
    0.466: [GC cleanup 260M->260M(512M), 0.0010887 secs]
    0.499: [GC pause (G1 Evacuation Pause) (young) 406M->295M(512M), 0.0070330 secs]
    0.509: [GC pause (G1 Evacuation Pause) (mixed) 305M->273M(512M), 0.0060542 secs]
    0.515: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 273M->273M(512M), 0.0019531 secs]
    0.517: [GC concurrent-root-region-scan-start]
    0.518: [GC concurrent-root-region-scan-end, 0.0003414 secs]
    0.518: [GC concurrent-mark-start]
    0.520: [GC concurrent-mark-end, 0.0028008 secs]
    0.521: [GC remark, 0.0016227 secs]
    0.522: [GC cleanup 284M->284M(512M), 0.0008553 secs]
    0.551: [GC pause (G1 Evacuation Pause) (young)-- 422M->339M(512M), 0.0078164 secs]
    0.561: [GC pause (G1 Evacuation Pause) (mixed) 350M->318M(512M), 0.0056637 secs]
    0.568: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 322M->319M(512M), 0.0021357 secs]
    0.570: [GC concurrent-root-region-scan-start]
    0.570: [GC concurrent-root-region-scan-end, 0.0002257 secs]
    0.570: [GC concurrent-mark-start]
    0.573: [GC concurrent-mark-end, 0.0023779 secs]
    0.573: [GC remark, 0.0016896 secs]
    0.575: [GC cleanup 323M->323M(512M), 0.0008763 secs]
    0.594: [GC pause (G1 Evacuation Pause) (young) 421M->354M(512M), 0.0052749 secs]
    0.604: [GC pause (G1 Evacuation Pause) (mixed) 372M->322M(512M), 0.0051926 secs]
    0.614: [GC pause (G1 Evacuation Pause) (mixed) 349M->319M(512M), 0.0048835 secs]
    0.619: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 320M->320M(512M), 0.0021819 secs]
    0.622: [GC concurrent-root-region-scan-start]
    0.622: [GC concurrent-root-region-scan-end, 0.0003740 secs]
    0.622: [GC concurrent-mark-start]
    0.625: [GC concurrent-mark-end, 0.0025325 secs]
    0.625: [GC remark, 0.0017838 secs]
    0.627: [GC cleanup 327M->327M(512M), 0.0008889 secs]
    0.628: [GC concurrent-cleanup-start]
    0.628: [GC concurrent-cleanup-end, 0.0000148 secs]
    0.647: [GC pause (G1 Evacuation Pause) (young) 409M->346M(512M), 0.0050247 secs]
    0.657: [GC pause (G1 Evacuation Pause) (mixed) 361M->326M(512M), 0.0065812 secs]
    0.671: [GC pause (G1 Evacuation Pause) (mixed) 351M->330M(512M), 0.0031233 secs]
    0.675: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 331M->331M(512M), 0.0015695 secs]
    0.677: [GC concurrent-root-region-scan-start]
    0.677: [GC concurrent-root-region-scan-end, 0.0001772 secs]
    0.677: [GC concurrent-mark-start]
    0.678: [GC concurrent-mark-end, 0.0016264 secs]
    0.679: [GC remark, 0.0014505 secs]
    0.680: [GC cleanup 340M->340M(512M), 0.0008733 secs]
    0.695: [GC pause (G1 Evacuation Pause) (young) 398M->351M(512M), 0.0042914 secs]
    0.705: [GC pause (G1 Evacuation Pause) (mixed) 369M->330M(512M), 0.0075565 secs]
    0.719: [GC pause (G1 Evacuation Pause) (mixed) 357M->339M(512M), 0.0051841 secs]
    0.725: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 340M->339M(512M), 0.0016255 secs]
    0.727: [GC concurrent-root-region-scan-start]
    0.727: [GC concurrent-root-region-scan-end, 0.0001711 secs]
    0.727: [GC concurrent-mark-start]
    0.728: [GC concurrent-mark-end, 0.0014905 secs]
    0.728: [GC remark, 0.0015027 secs]
    0.730: [GC cleanup 346M->346M(512M), 0.0009785 secs]
    0.731: [GC concurrent-cleanup-start]
    0.731: [GC concurrent-cleanup-end, 0.0000147 secs]
    0.745: [GC pause (G1 Evacuation Pause) (young) 402M->357M(512M), 0.0039450 secs]
    0.755: [GC pause (G1 Evacuation Pause) (mixed) 375M->341M(512M), 0.0067082 secs]
    0.763: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 347M->342M(512M), 0.0021297 secs]
    0.765: [GC concurrent-root-region-scan-start]
    0.765: [GC concurrent-root-region-scan-end, 0.0001992 secs]
    0.765: [GC concurrent-mark-start]
    0.767: [GC concurrent-mark-end, 0.0021582 secs]
    0.768: [GC remark, 0.0019212 secs]
    0.770: [GC cleanup 355M->355M(512M), 0.0011333 secs]
    0.781: [GC pause (G1 Evacuation Pause) (young) 415M->366M(512M), 0.0052852 secs]
    0.791: [GC pause (G1 Evacuation Pause) (mixed) 387M->353M(512M), 0.0059941 secs]
    0.797: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 353M->353M(512M), 0.0020220 secs]
    0.799: [GC concurrent-root-region-scan-start]
    0.799: [GC concurrent-root-region-scan-end, 0.0000057 secs]
    0.799: [GC concurrent-mark-start]
    0.801: [GC concurrent-mark-end, 0.0021415 secs]
    0.802: [GC remark, 0.0016708 secs]
    0.804: [GC cleanup 361M->361M(512M), 0.0008522 secs]
    0.813: [GC pause (G1 Evacuation Pause) (young) 411M->370M(512M), 0.0035286 secs]
    0.823: [GC pause (G1 Evacuation Pause) (mixed) 393M->361M(512M), 0.0063704 secs]
    0.830: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 365M->362M(512M), 0.0020767 secs]
    0.832: [GC concurrent-root-region-scan-start]
    0.832: [GC concurrent-root-region-scan-end, 0.0002747 secs]
    0.832: [GC concurrent-mark-start]
    0.835: [GC concurrent-mark-end, 0.0023438 secs]
    0.835: [GC remark, 0.0017096 secs]
    0.837: [GC cleanup 371M->371M(512M), 0.0009629 secs]
    0.846: [GC pause (G1 Evacuation Pause) (young) 410M->376M(512M), 0.0035649 secs]
    0.856: [GC pause (G1 Evacuation Pause) (mixed) 401M->366M(512M), 0.0067995 secs]
    0.863: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 367M->366M(512M), 0.0018113 secs]
    0.865: [GC concurrent-root-region-scan-start]
    0.865: [GC concurrent-root-region-scan-end, 0.0000068 secs]
    0.865: [GC concurrent-mark-start]
    0.867: [GC concurrent-mark-end, 0.0021117 secs]
    0.867: [GC remark, 0.0018416 secs]
    0.869: [GC cleanup 375M->375M(512M), 0.0008989 secs]
    0.877: [GC pause (G1 Evacuation Pause) (young) 407M->376M(512M), 0.0035688 secs]
    0.887: [GC pause (G1 Evacuation Pause) (mixed) 406M->367M(512M), 0.0071819 secs]
    0.895: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 368M->367M(512M), 0.0016960 secs]
    0.896: [GC concurrent-root-region-scan-start]
    0.896: [GC concurrent-root-region-scan-end, 0.0000060 secs]
    0.896: [GC concurrent-mark-start]
    0.898: [GC concurrent-mark-end, 0.0021200 secs]
    0.899: [GC remark, 0.0018377 secs]
    0.901: [GC cleanup 381M->381M(512M), 0.0009810 secs]
    0.910: [GC pause (G1 Evacuation Pause) (young) 411M->379M(512M), 0.0030812 secs]
    0.921: [GC pause (G1 Evacuation Pause) (mixed) 403M->369M(512M), 0.0063139 secs]
    0.928: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 370M->369M(512M), 0.0015690 secs]
    0.929: [GC concurrent-root-region-scan-start]
    0.929: [GC concurrent-root-region-scan-end, 0.0000716 secs]
    0.929: [GC concurrent-mark-start]
    0.931: [GC concurrent-mark-end, 0.0019535 secs]
    0.931: [GC remark, 0.0019292 secs]
    0.934: [GC cleanup 379M->379M(512M), 0.0011338 secs]
    0.943: [GC pause (G1 Evacuation Pause) (young) 408M->377M(512M), 0.0032753 secs]
    0.953: [GC pause (G1 Evacuation Pause) (mixed) 405M->371M(512M), 0.0071350 secs]
    0.960: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 372M->371M(512M), 0.0016512 secs]
    0.962: [GC concurrent-root-region-scan-start]
    0.962: [GC concurrent-root-region-scan-end, 0.0000061 secs]
    0.962: [GC concurrent-mark-start]
    0.964: [GC concurrent-mark-end, 0.0018717 secs]
    0.964: [GC remark, 0.0017233 secs]
    0.966: [GC cleanup 382M->382M(512M), 0.0009605 secs]
    0.975: [GC pause (G1 Evacuation Pause) (young) 406M->379M(512M), 0.0030755 secs]
    0.985: [GC pause (G1 Evacuation Pause) (mixed) 406M->371M(512M), 0.0064846 secs]
    0.992: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 371M->370M(512M), 0.0016676 secs]
    0.994: [GC concurrent-root-region-scan-start]
    0.994: [GC concurrent-root-region-scan-end, 0.0000747 secs]
    0.994: [GC concurrent-mark-start]
    0.996: [GC concurrent-mark-end, 0.0020430 secs]
    0.996: [GC remark, 0.0017248 secs]
    0.998: [GC cleanup 383M->383M(512M), 0.0009537 secs]
    1.009: [GC pause (G1 Evacuation Pause) (young) 408M->383M(512M), 0.0037138 secs]
    1.019: [GC pause (G1 Evacuation Pause) (mixed) 409M->378M(512M), 0.0077905 secs]
    1.027: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 379M->378M(512M), 0.0018689 secs]
    1.029: [GC concurrent-root-region-scan-start]
    1.029: [GC concurrent-root-region-scan-end, 0.0000944 secs]
    1.029: [GC concurrent-mark-start]
    1.031: [GC concurrent-mark-end, 0.0022791 secs]
    1.031: [GC remark, 0.0019467 secs]
    1.033: [GC cleanup 389M->389M(512M), 0.0009729 secs]
    1.041: [GC pause (G1 Evacuation Pause) (young) 408M->385M(512M), 0.0028026 secs]
    1.049: [GC pause (G1 Evacuation Pause) (mixed) 411M->379M(512M), 0.0066891 secs]
    1.056: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 380M->379M(512M), 0.0021989 secs]
    1.058: [GC concurrent-root-region-scan-start]
    1.058: [GC concurrent-root-region-scan-end, 0.0001001 secs]
    1.058: [GC concurrent-mark-start]
    1.061: [GC concurrent-mark-end, 0.0029072 secs]
    1.061: [GC remark, 0.0017492 secs]
    1.063: [GC cleanup 392M->392M(512M), 0.0009485 secs]
    1.071: [GC pause (G1 Evacuation Pause) (young) 414M->391M(512M), 0.0032022 secs]
    1.079: [GC pause (G1 Evacuation Pause) (mixed) 414M->386M(512M), 0.0048451 secs]
    1.084: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 387M->386M(512M), 0.0020426 secs]
    1.086: [GC concurrent-root-region-scan-start]
    1.086: [GC concurrent-root-region-scan-end, 0.0002061 secs]
    1.086: [GC concurrent-mark-start]
    1.089: [GC concurrent-mark-end, 0.0029098 secs]
    1.089: [GC remark, 0.0020034 secs]
    1.091: [GC cleanup 394M->394M(512M), 0.0009481 secs]
    1.097: [GC pause (G1 Evacuation Pause) (young) 412M->391M(512M), 0.0023563 secs]
    1.106: [GC pause (G1 Evacuation Pause) (mixed) 416M->384M(512M), 0.0057618 secs]
    1.112: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 386M->385M(512M), 0.0018893 secs]
    1.114: [GC concurrent-root-region-scan-start]
    1.114: [GC concurrent-root-region-scan-end, 0.0002698 secs]
    1.114: [GC concurrent-mark-start]
    1.117: [GC concurrent-mark-end, 0.0029291 secs]
    1.118: [GC remark, 0.0017581 secs]
    1.120: [GC cleanup 399M->399M(512M), 0.0007831 secs]
##### -Xmx1g -Xms1g
    Java HotSpot(TM) 64-Bit Server VM (25.251-b08) for windows-amd64 JRE (1.8.0_251-b08), built on Mar 12 2020 06:31:49 by "" with MS VC++ 10.0 (VS2010)
    Memory: 4k page, physical 16112436k(6692820k free), swap 20831028k(5791504k free)
    CommandLine flags: -XX:InitialHeapSize=1073741824 -XX:MaxHeapSize=1073741824 -XX:+PrintGC -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseG1GC -XX:-UseLargePagesIndividualAllocation
    0.189: [GC pause (G1 Evacuation Pause) (young) 64M->22M(1024M), 0.0060051 secs]
    0.216: [GC pause (G1 Evacuation Pause) (young) 77M->40M(1024M), 0.0062162 secs]
    0.239: [GC pause (G1 Evacuation Pause) (young) 95M->61M(1024M), 0.0049259 secs]
    0.266: [GC pause (G1 Evacuation Pause) (young) 138M->83M(1024M), 0.0064529 secs]
    0.308: [GC pause (G1 Evacuation Pause) (young) 209M->128M(1024M), 0.0083710 secs]
    0.376: [GC pause (G1 Evacuation Pause) (young) 316M->181M(1024M), 0.0139701 secs]
    0.427: [GC pause (G1 Evacuation Pause) (young) 334M->221M(1024M), 0.0132230 secs]
    0.495: [GC pause (G1 Evacuation Pause) (young) 446M->278M(1024M), 0.0153600 secs]
    0.597: [GC pause (G1 Evacuation Pause) (young) 554M->351M(1024M), 0.1043024 secs]
    0.755: [GC pause (G1 Evacuation Pause) (young) 565M->405M(1024M), 0.0461697 secs]
    0.820: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 497M->432M(1024M), 0.0085000 secs]
    0.829: [GC concurrent-root-region-scan-start]
    0.829: [GC concurrent-root-region-scan-end, 0.0003076 secs]
    0.829: [GC concurrent-mark-start]
    0.831: [GC concurrent-mark-end, 0.0020933 secs]
    0.831: [GC remark, 0.0020267 secs]
    0.834: [GC cleanup 439M->428M(1024M), 0.0012282 secs]
    0.835: [GC concurrent-cleanup-start]
    0.835: [GC concurrent-cleanup-end, 0.0000454 secs]
    1.030: [GC pause (G1 Evacuation Pause) (young) 784M->493M(1024M), 0.0240504 secs]
    1.057: [GC pause (G1 Evacuation Pause) (mixed) 503M->409M(1024M), 0.0101527 secs]
    1.082: [GC pause (G1 Evacuation Pause) (mixed) 475M->423M(1024M), 0.0040931 secs]
    1.086: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 425M->423M(1024M), 0.0019949 secs]
    1.088: [GC concurrent-root-region-scan-start]
    1.089: [GC concurrent-root-region-scan-end, 0.0002291 secs]
    1.089: [GC concurrent-mark-start]
    1.090: [GC concurrent-mark-end, 0.0017773 secs]
    1.091: [GC remark, 0.0015284 secs]
    1.092: [GC cleanup 435M->429M(1024M), 0.0010286 secs]
    1.093: [GC concurrent-cleanup-start]
    1.093: [GC concurrent-cleanup-end, 0.0000256 secs]
##### -Xms4g -Xmx4g 20s
    Java HotSpot(TM) 64-Bit Server VM (25.251-b08) for windows-amd64 JRE (1.8.0_251-b08), built on Mar 12 2020 06:31:49 by "" with MS VC++ 10.0 (VS2010)
    Memory: 4k page, physical 16112436k(6883328k free), swap 20831028k(5581496k free)
    CommandLine flags: -XX:InitialHeapSize=4294967296 -XX:MaxHeapSize=4294967296 -XX:+PrintGC -XX:+PrintGCTimeStamps -XX:+UseCompressedClassPointers -XX:+UseCompressedOops -XX:+UseG1GC -XX:-UseLargePagesIndividualAllocation
    0.296: [GC pause (G1 Evacuation Pause) (young) 204M->69M(4096M), 0.0143248 secs]
    0.350: [GC pause (G1 Evacuation Pause) (young) 247M->135M(4096M), 0.0139268 secs]
    0.404: [GC pause (G1 Evacuation Pause) (young) 313M->192M(4096M), 0.0139048 secs]
    0.455: [GC pause (G1 Evacuation Pause) (young) 370M->250M(4096M), 0.0135805 secs]
    0.506: [GC pause (G1 Evacuation Pause) (young) 428M->311M(4096M), 0.0153044 secs]
    0.555: [GC pause (G1 Evacuation Pause) (young) 489M->369M(4096M), 0.0144600 secs]
    0.604: [GC pause (G1 Evacuation Pause) (young) 547M->425M(4096M), 0.0130845 secs]
    0.655: [GC pause (G1 Evacuation Pause) (young) 617M->487M(4096M), 0.0141955 secs]
    0.725: [GC pause (G1 Evacuation Pause) (young) 735M->555M(4096M), 0.0198867 secs]
    0.814: [GC pause (G1 Evacuation Pause) (young) 879M->649M(4096M), 0.0234297 secs]
    0.906: [GC pause (G1 Evacuation Pause) (young) 979M->740M(4096M), 0.0234366 secs]
    1.025: [GC pause (G1 Evacuation Pause) (young) 1160M->851M(4096M), 0.0336962 secs]
    1.175: [GC pause (G1 Evacuation Pause) (young) 1347M->987M(4096M), 0.0984606 secs]
    1.388: [GC pause (G1 Evacuation Pause) (young) 1501M->1113M(4096M), 0.0857949 secs]
    1.588: [GC pause (G1 Evacuation Pause) (young) 1691M->1243M(4096M), 0.0464147 secs]
    1.756: [GC pause (G1 Evacuation Pause) (young) 1883M->1394M(4096M), 0.0451748 secs]
    2.093: [GC pause (G1 Evacuation Pause) (young) 2498M->1591M(4096M), 0.0612191 secs]
    2.336: [GC pause (G1 Evacuation Pause) (young) 2591M->1736M(4096M), 0.0445694 secs]
    2.823: [GC pause (G1 Evacuation Pause) (young) 3230M->1915M(4096M), 0.0650911 secs]
    3.158: [GC pause (G1 Evacuation Pause) (young) 3325M->2056M(4096M), 0.0568954 secs]
    3.454: [GC pause (G1 Evacuation Pause) (young) (initial-mark) 3352M->2183M(4096M), 0.0531313 secs]
    3.507: [GC concurrent-root-region-scan-start]
    3.507: [GC concurrent-root-region-scan-end, 0.0003245 secs]
    3.507: [GC concurrent-mark-start]
    3.516: [GC concurrent-mark-end, 0.0089779 secs]
    3.516: [GC remark, 0.0020613 secs]
    3.518: [GC cleanup 2216M->702M(4096M), 0.0018894 secs]
    3.520: [GC concurrent-cleanup-start]
    3.521: [GC concurrent-cleanup-end, 0.0010506 secs]
    3.736: [GC pause (G1 Evacuation Pause) (young) 1863M->806M(4096M), 0.0400012 secs]
    3.781: [GC pause (G1 Evacuation Pause) (mixed) 836M->721M(4096M), 0.0215599 secs]
    4.309: [GC pause (G1 Evacuation Pause) (young) 3167M->1066M(4096M), 0.0476405 secs]
    4.743: [GC pause (G1 Evacuation Pause) (young) 3214M->1151M(4096M), 0.0483501 secs]
    5.171: [GC pause (G1 Evacuation Pause) (young) 3261M->1227M(4096M), 0.0468277 secs]
    5.579: [GC pause (G1 Evacuation Pause) (young) 3275M->1315M(4096M), 0.0459128 secs]
    5.981: [GC pause (G1 Evacuation Pause) (young) 3281M->1405M(4096M), 0.0447483 secs]
    6.366: [GC pause (G1 Evacuation Pause) (young) 3287M->1523M(4096M), 0.0464308 secs]
    6.732: [GC pause (G1 Evacuation Pause) (young) 3293M->1634M(4096M), 0.0451591 secs]
    7.072: [GC pause (G1 Evacuation Pause) (young) 3298M->1731M(4096M), 0.0424453 secs]
    7.395: [GC pause (G1 Evacuation Pause) (young) 3317M->1861M(4096M), 0.0436445 secs]
    7.701: [GC pause (G1 Evacuation Pause) (young) 3331M->1987M(4096M), 0.0408301 secs]
    7.989: [GC pause (G1 Evacuation Pause) (young) 3345M->2127M(4096M), 0.0405727 secs]
    8.245: [GC pause (G1 Evacuation Pause) (young) (initial-mark) 3359M->2275M(4096M), 0.0401783 secs]
    8.285: [GC concurrent-root-region-scan-start]
    8.286: [GC concurrent-root-region-scan-end, 0.0002666 secs]
    8.286: [GC concurrent-mark-start]
    8.290: [GC concurrent-mark-end, 0.0039982 secs]
    8.290: [GC remark, 0.0022364 secs]
    8.292: [GC cleanup 2300M->722M(4096M), 0.0021925 secs]
    8.294: [GC concurrent-cleanup-start]
    8.297: [GC concurrent-cleanup-end, 0.0024949 secs]
    8.516: [GC pause (G1 Evacuation Pause) (young) 1799M->833M(4096M), 0.0358553 secs]
    8.562: [GC pause (G1 Evacuation Pause) (mixed) 875M->755M(4096M), 0.0225363 secs]
    9.024: [GC pause (G1 Evacuation Pause) (young) 3197M->1109M(4096M), 0.0444097 secs]
    9.445: [GC pause (G1 Evacuation Pause) (young) 3257M->1179M(4096M), 0.0460795 secs]
    9.865: [GC pause (G1 Evacuation Pause) (young) 3269M->1241M(4096M), 0.0447422 secs]
    10.269: [GC pause (G1 Evacuation Pause) (young) 3277M->1329M(4096M), 0.0455485 secs]
    10.661: [GC pause (G1 Evacuation Pause) (young) 3283M->1419M(4096M), 0.0476585 secs]
    11.038: [GC pause (G1 Evacuation Pause) (young) 3285M->1523M(4096M), 0.0446919 secs]
    11.396: [GC pause (G1 Evacuation Pause) (young) 3295M->1624M(4096M), 0.0446783 secs]
    11.738: [GC pause (G1 Evacuation Pause) (young) 3304M->1739M(4096M), 0.0441335 secs]
    12.064: [GC pause (G1 Evacuation Pause) (young) 3317M->1865M(4096M), 0.0424438 secs]
    12.367: [GC pause (G1 Evacuation Pause) (young) 3329M->1993M(4096M), 0.0415769 secs]
    12.651: [GC pause (G1 Evacuation Pause) (young) 3345M->2141M(4096M), 0.0418586 secs]
    12.905: [GC pause (G1 Evacuation Pause) (young) (initial-mark) 3361M->2281M(4096M), 0.0399499 secs]
    12.945: [GC concurrent-root-region-scan-start]
    12.946: [GC concurrent-root-region-scan-end, 0.0004341 secs]
    12.946: [GC concurrent-mark-start]
    12.950: [GC concurrent-mark-end, 0.0043987 secs]
    12.950: [GC remark, 0.0018994 secs]
    12.952: [GC cleanup 2300M->712M(4096M), 0.0018016 secs]
    12.954: [GC concurrent-cleanup-start]
    12.955: [GC concurrent-cleanup-end, 0.0013084 secs]
    13.153: [GC pause (G1 Evacuation Pause) (young) 1793M->837M(4096M), 0.0380264 secs]
    13.201: [GC pause (G1 Evacuation Pause) (mixed) 881M->748M(4096M), 0.0209527 secs]
    13.641: [GC pause (G1 Evacuation Pause) (young) 3092M->1106M(4096M), 0.0471954 secs]
    14.051: [GC pause (G1 Evacuation Pause) (young) 3182M->1199M(4096M), 0.0462181 secs]
    14.456: [GC pause (G1 Evacuation Pause) (young) 3215M->1293M(4096M), 0.0468905 secs]
    14.851: [GC pause (G1 Evacuation Pause) (young) 3239M->1378M(4096M), 0.0446134 secs]
    15.225: [GC pause (G1 Evacuation Pause) (young) 3258M->1490M(4096M), 0.0491424 secs]
    15.587: [GC pause (G1 Evacuation Pause) (young) 3274M->1612M(4096M), 0.0459384 secs]
    15.925: [GC pause (G1 Evacuation Pause) (young) 3290M->1717M(4096M), 0.0432247 secs]
    16.259: [GC pause (G1 Evacuation Pause) (young) 3311M->1838M(4096M), 0.0437845 secs]
    16.567: [GC pause (G1 Evacuation Pause) (young) 3322M->1971M(4096M), 0.0408751 secs]
    16.853: [GC pause (G1 Evacuation Pause) (young) 3339M->2109M(4096M), 0.0398447 secs]
    17.112: [GC pause (G1 Evacuation Pause) (young) (initial-mark) 3357M->2256M(4096M), 0.0412526 secs]
    17.154: [GC concurrent-root-region-scan-start]
    17.154: [GC concurrent-root-region-scan-end, 0.0004080 secs]
    17.154: [GC concurrent-mark-start]
    17.159: [GC concurrent-mark-end, 0.0049978 secs]
    17.159: [GC remark, 0.0023716 secs]
    17.162: [GC cleanup 2285M->685M(4096M), 0.0025357 secs]
    17.165: [GC concurrent-cleanup-start]
    17.166: [GC concurrent-cleanup-end, 0.0013222 secs]
    17.364: [GC pause (G1 Evacuation Pause) (young) 1776M->792M(4096M), 0.0369720 secs]
    17.408: [GC pause (G1 Evacuation Pause) (mixed) 832M->748M(4096M), 0.0230166 secs]
    17.856: [GC pause (G1 Evacuation Pause) (young) 3188M->1100M(4096M), 0.0444985 secs]
    18.284: [GC pause (G1 Evacuation Pause) (young) 3248M->1181M(4096M), 0.0471296 secs]
    18.702: [GC pause (G1 Evacuation Pause) (young) 3283M->1251M(4096M), 0.0455139 secs]
    19.106: [GC pause (G1 Evacuation Pause) (young) 3283M->1344M(4096M), 0.0469319 secs]
    19.496: [GC pause (G1 Evacuation Pause) (young) 3284M->1435M(4096M), 0.0470233 secs]
    19.870: [GC pause (G1 Evacuation Pause) (young) 3287M->1549M(4096M), 0.0457323 secs]

### 分析
    512m时，绝大部分Young GC耗时都是几毫秒，Full GC的初始标记阶段耗时基本不超过2毫秒。
    1g时，Young GC耗时在十毫秒以内，Full GC初始标记也没有超过2毫秒。
    4g时，为了产生Full GC，执行了20s。Young GC耗时影响比较大，到后期基本都是三四十毫秒；Full GC的初始标记影响不大，在4ms左右。
    