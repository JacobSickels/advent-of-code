(ns advent-of-code.2017.day-09)

(def data "{{{{{{{<>},<<!>},<,>},{{<oou<o{!>,<i!!!!!>!!ouu}i>},<a!!!>!i!!!>!!<!!,!oa''!!!>!{>}},{{{{<a!!!>!!!>!!\"!!o\">}},{{{{{<!!i!!!>},<!!!>!>},<>}}},{}},<!>},<iu<!>!!o!!!!ee!!!!io!!!>!>!>},<'>},{{{{<!>,<ei'{!!}!>},<!><!!!>>},{<\"a!>!>,'>,{{{<!>},<!>,<!e>}}}}},<!>},<!!!><!!i!!e\"!>},<!>},<,!>,<!!!>!>a,>},{{{<>}},{{<!,u<!}!>},<!>},<i!>,<e>}}}}},{{<!>!o{a\"i!u{}!>,<{!!!>,<!!!>!a>,{}},{{},<!>,<!>},<!!a,e{a!!!>e>},{<!eo,!!aa>}}}},{{{{{}}},{}},{{{{},<e!!!>>},{}},{{{<<!!ii!!!>i'!\"a!!!>!>>}},{{{},<}{e}<!>},<>},{<!!o<!!!u!!\"},!!,{!>},<!>!!!!!!!>!!!>},<>}},{<\"e!>},<,o!!\"!>e!>}\"!>,<}a>}},{{<!!a'!!!!uo\"\"!!'{!!!!'>}}},{{<,!!{ai{,ou!>},<a!>,<!!>,<>},{{{<'o!!!><!!!>u,!!!>!>},<!!!!!>,<>}},{{{{<>}},{{{<!!\"aei!!!!!>\"!!o\"!!!!!>aioo,>},<!>!!!>,<!<,!!!>{i!!!>},<!<!!!!!!u'{!!,e\"e>},{<{!>},<}!>,<!!!!o!!!>!!i}!!{!!!>>}}},{{{{<u!}<,o{!!!!,<{!!'>},<a>},{<<!>},<e!>,<'}u,!e}!>},<!!!>\">}}},{{{<>}},{{}}}}}}},{{{<ae{,}<>},{{<!>},<}!eu}\"},!a,a>}},{{{{<e!!ue\"'<i!>,<!!ai!>},<\"\">},{}}},<,{>}},{{{}},{<!>!>},<!!!{!\"'!uu!!!>},<{>}},{{},{{<<o!>,,i!!!!u!!'!'{\"ei{\">},{}}},{{{<!>,<}<!{,!>},<i!>,!!e}\">}},{{<a!u!!!>!eu\"!{!ua{>}}}}},{{{{},{}}},{{<!!!>!<au!!!!,!i\"!!!>},<o}i,!!'{<'!>,<<>},{{{{},{<aiu,!>,<!!>}},{{{<!e\"!a\"i>},{{<!!!>u,a{!!!>,<eu}!!<}!>>}}}}}},{{<}!>u!>},<eooo!!a!!'!!!o{u!>},<>}}},{},{{{}}}},{{{{},{{{<{\"o!!o!><'!!!>>},{{<!!e!!,}ia!>},<'!!,'<e!>},<u!>!>,<!!!>!>,<!!!>>},{<!u!!,u<!>},<!!!>u!!!>!>,<u>}}}},{{{{<u!!},,u{'!!!!!!,!!'>},{<<',!oi!>},<!>,<!oi!>!>},<e>}},{{}}}}}},{{{},{{{{}},{{},{<!>},<!!!>!!!>\"<i!!>}}},{{{<!!!>!>},<u!,i!!!!!>!>},<aa!!{!!!ie\"!>!\">,<!!!>!!ee>},{{<!><!!!><{!!!>'e!!<!>,<!>,<'!{>}}},{{<}u,!,!!!>!>},<!!!>!\"i{!!!>,>}},{{<\"{!!!>ioua!!!>u!ouu!>a!!u>}}},{{}},{{{{},{<e>},{{<!>!!!!!!!>,<\"!!!>ea<aa!>},<'!!!>ue!'>}}},{{{{<!>,<ei!!!>},<o!!ei!\"!!<!>},<u}>}},{{{{{},{<i'!>},<!>,!>},<\"oa<>}}},{{<au\"}!>,<!e\"ieau>}}},{<\",o<!>!!!>e,!>,<uo!>},<eae!>},<\",!!!i>,{<e!!<!!<uiu>}},{<!,<}ae}!>,<ue}i}!!!>{>}},{<!!!}'!,o}!'iu!>},<!!!>!'o>}},{},{{{<'>},{<>}}}},{{{{{},<>},{<{!oo\"!>},<<\"e!>,<!>\"{o!}!!!>},<a!>>}},{<!!!>,<,\"e!!i{ii!!!!a}u>,<!!!eooio!!!>!>,<'o{!>!>,<!>,<,>},{{<'!!!>!i!!!>\"!>},<ieo!!!!!>,<!>'!>,<u!>},<}>}}},{<!>},<\"}!>},<!!o>,<uo!!{<'!{a!>,<>},{{{<!>},<'u!>},<>},<!!}e!>'a!!!>!o!!}\">},{{<i'{{}ea{\"e{!!!e!!!}!>>}}}},{{<<!!!!!e!!{\"'!>},<!!!!'u!!a!\"!>,<!>},<<oo!!ie!!!>>,<u!!!>!!a{>},{{{{<>}},{}},{<!!!!a!>,<\"<<<!!i\"!!'\"}!!!au'>}},{{{},{}}}}},{{{<{}a!u!>},<!>},<ei!!!>{!!'>},<!!!!!>!!!!!>oo''<>},{{<!>},<!!!!!!,!>,<a!>},<'>},{{<u{!>!!!>!>},<a!,ae!!!!!>{>}}}},{},{{{{{},{<u!>,<!>oio!}!>,a!!'u!>},<'!!>}},{<u!>,<!>!!!>},<}!>!!!>!!!!<{!!io!>!!!>},<!!io>},{{<i{!>!!!>>}}},{<i>,<i!!ou'!>},<!!!}ea!>!!\"'\"{!!,>},{{<,\"!!a!>},<!>,<!>},<!>},<!!!>>},<{!!ou'!!!,a>}},{{<!!o',e!!,a>},{}},{{{<!>},<!!!>o{u\"!!!!!!!!!!>}},{<!!!!!>>}}}}},{{{<e!!},au!!ee!a!!{!!u>},<o!!!{!\"!!\"i>},{{},{<!>,!>,<>,{{<!\",e<o'<iao,i!>,<!!!>>,{<i{!!!>!!!>!>!!!>!>},<!}a}!ioe>}},<}!!e>}}}}},{},{{},{{},{<uii\",i!!!o'\">}}},{{<}!>},<a!!,!>,<!!!>!!!>a!!\"!!'>},{<{'!>},<oau!!!>i!>,<!!\"<{!>'!>},<'!!>,<>},{<!a{o!>},<!{!a>,{<u,\"!!!>,>}}}}},{{{{{{<\"\"!!!>!>,<'!o!!!>>},{}}},{<'!\"o!!!>}!>},<>,{<'>}},{{<,a!i\"!}i!!!>\"a\"!!!!{u!!,i>},{<o!>},<!!!>},<{io!>e!>,<!!!>,<>,{{<o'!!ioa!!ia\"\"\"'>}}}}},{{<!!!>!<au!!,!!\"e!!!>!a,eeia,>},{<>}}},{{{<>}},{{<!>},<}>},{<o'a>}},{{<<!<!>},<{!>!ia!>},<{o!>}!!!>},<>}}},{{{<!>'o\"a}euu!!!>ua>},{{<\"!>},<{!>a!>},<i}!>,<eo!>},<>},{<}!!e!a!!>}}},{{<!>},<!!!>,<!!!<i\"!!<!>,<!>,<!>,<!!}!>,<<oo>,<!>,<\"!!!>,<!>},<aiio!!,!>}!u!>},<u!>,<u!!\"a{>}},{{<>,{<!oi>}},{{{<}i!'\",!>!,!!e<!!!>!u>}},{}},{<ie!>>,{<!>,<\"'!'e!!!>!>},<!>},<u\"!>!!<{>,{<e'!>,<!>'!>},<'!!!!a{{!!!>!>e}a}!>},<!>,<>}}}}},{{{<!!!>!>,<!<''>},{<o!!!>!,!>},<!>u''<>}}}},{{{{{<!>e\"a>}}},{<!>!!}!>,<'o!!!>,<!!!>}\"\"o{u!!!>>}},{{{<!!au\"!!}!!!!!>},<{!!e,o!>!ou>},{{{<!!>}},{}},{{<\"'!'{>},<!>},<o>}},{{{<!>,<'a,!eo,!!>},<\"\"!>,<!>},<!,'!!!><!i!>,<e{>},{{<!!a!>!!!>ii!>},<!>,<u,!!i'!!i'!!<!!{!!!ea}!!!!!!>,{}}},{{},{{<!>,<!>},<!}<,{ua,<!>},<e!!e<>},{<!!!>uo\"!!!>,}e!>u>}}}},{{{{<}!!}!>}'!!<{!a!>,<a!{!,>}}}},{{{<{\"<!ua{!>},<\"!ii\"'}!!!>!!}<!>,<<>,<,!!!!!!!!!>\"{!!\"eu,!!!>,<o\"a!!i!>,<e>},{}},{},{{},{{{<u!>u<!!<!>},<!>,<!!!>}\">},<\"\"e}<,!>!o!!!>}!!o>},{<{>}}},{{{{{<!a}uuee>}},{{{<,o!>},<u!!!>!>,<!}!!!>a}ee>},{{<{,!!,!>},<!!!>a>},<!><'<i!>!!u<a!>{i>}},<!!'oe!>},<<u!!!!>}},{{<aa!>},<!o!>},<\"{o<>},{<!>},<!!!u\"!>,<>}},{<}oio>,{{<!<{}<\"e!!!>'!>},<o!\"i,!i!!!!u>},{<!>,a!>!>},<!!!>,<}>}}}},{{<{,ei!e{'{!{\">,{<i!!!!!>,o!\",a}!>,<!!ia!!>}},{{<\",'!>{!\"iu!!!>!>},<!>},<!!!>>,{<\"a!!!>!>!>},<}{!,!!!!ou}{>}},<!!ie<!!!!uuu!u,!>u}!!!>>}},{{<\"!>,<!>,<!o{!>},<!!!>a!!a,!>,<u\"\"a!><\">,{<!!o!!<'!!!>!>,<!!!>!>},<!!ae!>},<!!!>},<!!!><'>}}}}}}}},{{{{{<!}!o{!e!!<<o!!o!!,!>},<e>},<i!>},<\"o!>!>},<'!!!>,<a!>},<e>},{{{{<au,'!!!>!>,<!!a>},{<\"!}!i!!!>},<o!>},<o}'!!!>!>},<{>}}}}},{{{<i!>\"!!ua!>},<\"!!!>!!!>{'ie{'}>},<!!!>,!!!!!>},<u!>!!u\"{'o>},{{<u!!!!!>!>},<!!a!a!!{{'<!!!!!>,<!e>,{<!!!!!>o'ui!!!><{>}},{{},{<!>,<<u!>{o!!}\"!>},<{}e\">,{}}}}},{{{<ao'\"!!!!!>!>},<!!!'\"u>},{{{{<!!!>,<>}}},{}}},{{<}!>,<'!>,<!!iu!u!!!>,<!}ae}!i!!!,!>!>a>},{<!!!>!>,<\"<e}!>,<<!!i>},{<!!!>!>,<!io>,<{!!\"eo>}},{{},{{<!!,!!!>o!io!>},<!!!>'<!!!'!!i>},<'i,!>iea!!!!!>\"!!!'>}},{{{{<e!>,<}!!\"!>,<<a!e'}<>}},{<!>},<,'!>,<u>}},{{<o!!!>,}!!'!>},<!>},<{>},{<aa'u!!}!>>}},{{{{<!>'!!\"i!!!>!\"o!!!>!!!>ii'>}}},{<u!!!>},<a!>,<u},!>!!!!!>!>,<a<!{!>,<{<u>}}}},{{{<!i!!!>a}\">}},{{<u{!>a!>!>,<{!!!!i!!!>,<!!!>,{>},{<u,e!!,<i!!!au!>},<'}}!>,<!!}o>}}}},{{{{{{},{<!>},<'{!!>}},{<a!a!!!>!!{!>o!!e!!\"'!!!>},<\"o!!<>}},{{<!!}au\"!>>,<!eo!>,!><!!!!'i<,!!!>,<}!!<{!io}>},<'\"!>,!!!>!>},<e,eei!!}!!<!>,<o!!!>>},{{<e<aoaua,!!!>aa!!!>eau,'>,<i!ua\"u}>}}}},{},{},{{{<o'!'o!e!!!!'ea}>,{}},{{<,{<e!!!!}}<!>},<>},{}},{{{}},<!!!>!>!!\"'!!u!a!!,a>}},{{},{<!!!>oo\"!!!>,{>,<!>'<!>>},{<o,!!!!!'!!!>!!!>!!'{''!>{i{!>},<>}},{{{<!>,<\"!!'i\"u<!{o<i{i!}!>i>},{}}},{{{{<'<{<iaa!>},<!>},<{a!!!>>}},<o!!!>!!{!!o>},{{<!!!>},<i!>!!!!e!>}!!!>!!!!!>'\">},<>},{{<'{!!}a\">}}}}},{{{{{<<!>,<\"!>},<u!>},<!!!>,<!i'{>}},{<,!!!>},<au!>},<!!ie,!!}!>,<>,<,!>},<!!!>,<a>},{}},{{<i\"u,!{ae{,!<a'!>},<!>,<>},{{{{{<o\"!>ua,!}'<<u!a!>,<u}!>>},<i!>},<i!!!>o\"!>},<\">},{{{},{}}}},{{<!!o!,,!a}>},{{<>},<!!\"!>},<!{\"}!>},<!!>}}},{},{{{{<!!a}!!e!<uu!}!!eu!!{ai{!>!'>},{<'!!!>!!!>},<!!!!!>\"ioa!!!>}!!!>'>}},{}}}}}},{{<<!>,<!!!>!o'e{!!\"\"!e',a!>!!!>},<>},{{},{<!i!!ui<\"\"}!!!{oi,!>,<<{o!!u>}}},{{{}},{{<{>},<!!{!!!>,<!u!!,!>},<i!!ui!>o!>a,>},{<!>o!>e'!!!>},<!!<>,{{}}}}}},{{},{{{<o!!!><,!!\"}!>},<!!!><u!>,<>},{{}},{<!}{!!!'a>,{<!!!!!!au,!>},<i!>,<!>,<<aaa!e>,<}!!!!!>e\"{!!<,'!>!>!!!>\"!ee{!>},<>}}},{{{<a!>,<!o},ai!>},<>}}},{{{{<!>,<e<!>},<,e!!!>}'!!'uei>},{<\"{i>}},<!,!{!>},<\"!>,<u!!!<!!!a!!!>eu!<{a>}}},{{{{<{\"!oi>,{}},{{<}!>},<\"au>,{<!!}{io<!a!!!>,<<ai!!{!eo>}},{}}},{{{<!!!>i!!!!}'e!!!>\"}<!u!}a}>,{<<!'\"ea!!!>!!!>>,<>}},{<!>},<au!!!>},<e!!o!!a,!>!o!>,<>,<!>,<}!>},<!>!!!>!!!>!>},<>}},{}},{{{{{},{}}},{{<!>',ua'!!a{{>},{<!,!!!>{>}},{{<}!>aai!!'\"}!<!!!>!!<!!}uiue>},{{{<!,!>},<{!!e!>},<!e{!!}!!u<a\"!>,<u\"i!>,<>},<>}}}},{{{<o!>},<!!!>e!!{'\"oi!>>}}},{{{<!!},!!!a!!!>!!i,o!>},<!!!>>},{{},{<!!ii,!!!>,<\"!!!>}!>},<!!u>}}}}},{}},{{}}},{{{<!>o!e,!!>,{{},{}}},{{<!<>},<}!>},<u'u<ea!i'<o<!>oeee>}},{{{<i,{a<'!>i\"e{!>},<o>}},{}},{{{},{<!>u'!!!o}a!>,<>}},{{{{<,oo!!!>o<\"ao!!!>,<'!}!u!!,,{>}},{{<u!!u!!!><!!!>},<},>},<i\"!!'e!>},<u!>},<!!!!!>},,!>{>},{{{{<}\"\"\"e!>ei\"!\"}!!e'!!>}},{<!!!>},<{<}}ieoai!\",!>,<u>},{{{<!!,{!}!i!>},<'}!}u{,!}{e!!>,{<,}}!>!>!,i!>},<!{\"o}u!!\"i!!a}>}},{<a!>o,ua!!!>,<u!>},<\"!!!!a!}a!!!>},<{!!!>!>,<>}}}}}}},{<!!!>!>},<i<!!!!!>},<e!>o}!!!>,<{!!<}u>,<!!!!!{!!o!ooe!!!!!>!!}}!>!>},<a!},!!!}'!!,i>}},{{<aa!!!>!>,<a'!!!><!>},<!!!>},<{!!!!!>'o!>,<>},{{{<,<!!!{<eaa!>'>},{}},<a{!>!!},!!!>'>}}}},{{{{{{<!{e!>>,{<!!!!!>!<!>},<!!!>,<!!!>,<>}},{{<!>},<!!!!!>a,!!}!\"i{!!!>,<>}},{{<o!>,<!>}!!!!>}}},{{{{{},{<!>,<e!!!!!>}!!!>,<!!!>,<!!iei>}},{{<!!!>e!>!>i!!}!>,<>},{<i!!!!!>,<,!!ou!!<!!<e\"{e<>}},{{}}},{{<!u<!!!><}u'!!!>},<,!!!e>}},{}},{{<!>,<a!!i>},<}u\"\"!!!>io!!!>},<!!e!,!!>},{<!!!>{>,{}}},{{}},{{{<!eu!!!>o,!!e''i<!!!'!>},<!!!>>}},{<!!!>a!>,<ao!!!>,<>,<,!,}>},{<!!!>o'!>e>,{}}}},{{{{}}},{{{<u{,'\">,{}}},{{{<o,!!!>!>>}},{<'o}'!>,<!i>,<!!a!>,<!!!!'{!!!>{a!!i'>}},{{},{{{<,!>},<!!!!!!,!>},<!>,<!>,<i>}},{{<!!!>u!!!>o!>ei,!}!!!!!!!>!!!>!>,<>},<'o!}'>}},{{{<i!>,<<>}},{{<!!{!>},<!>},<!!!>},<!!!>,<u!>},<!>!!!>ae!>,<>},<!!!>u!>,<<'<!\"}!!!!!>{!>!!\"}!>,<<>}},{{{<!',<!!ua!\"'!!a!>},<,!o!!u!!!}'i!!>,<o!!o>},{{{},{<!!i!u\">}},{}},{}},{{{}},{{<\"u!e!!,!,!>},<i!>},<i'{!!!>,a!>},<\"!>,<!>>},<!>u!>},<!!{!>!>,<!><}!!i!>,<i'a'!!,e>}},{{{{{{{},<}}},!,<e}!!!!}!i!>>}}}},{{{<a}e!>},<<!!!>>,{{<!!!!<,{e!>!!!>!!a\",!>},<u{>}}},{<!!!>\"<e<!!oo!!!>!>a!!,!>},<>}},{<\"!!!>},<,!u!!!{!>},<,<,o'!>,<\"!\"{!>,<>,<!>!e\"!!!!!>!!!!}\"<<!!!!!>'o!>},<\"!>},<}u>},{{{{<,!>,<a,e!!!>!<!!,>}}},{{<!io{>}}}},{{{}},{<!>,<!!!<!!eu'!!!>}!>},<,i{!>},<!!!>>,{{},{<!!}'!!!>i!>,<i!!!}!>!>!!i!{!>,<!!!!o!!!>},<!!!>>}}}}}}}}},{{{<>}},{{<>},{<!>,<oa'o!!e<,!>,<a!>,<>}}},{{<!!e!,i!<\"!<<!>},<}!!!>!>>,<!!!}e!!!>,<o!!!>!!>},{<o'o!>!>},<e{!>!>!!!>},<!!!>!e!!!>!>!>o!!\"!a>,{<!>,<!!!!!>>,{<'>}}}}},{{{<u!>!!,e!!>}}},{{},{{<!>},<{ia!!}e\"<!>!>},<!!i\"{!>,<!!e!\">}},{<!\"}'!>,!>},<!<!!'!>u!'!!i!!!\"!<>,<!>!!ua}<!!<u\"!!!!!!!>{}>}}},{{{{{{{},<>},{<!>!!!>!!a!>,<!!!><>},{{{<,,ua!>,<<\"!i!{\"!>},<oi>,{<>}},{<}}!!!>!>o!!!>!!a!!{i<ua,{a{>}},<<e!>,<!>},<i!!!>!!!>}!!'!!!!!>,<u<!!<!!!!}!!u>}}},{},{{{<!!}e!>,<>}}}},{{<!!!>!!!>,<ii!>,<!!!aaaa'!>},<!!,!<!>,<!>!>}>,<!!u!ui!<!!!>},<<<!>,<ia!>e!!u!!{<>},{{<uuia\"}u!>,<o!>,<{!>},<!!!>!'!>},<'{,\">,{<!>},<<,ue!!<!e!>,<!>},<!!!a>}}},{{{<!!!>\"!!e!>,<!>,<{!>,<>},<!>},<'a\"!!!,!>},<!!'>},<'\"uo{e!!{!!!>i\"!>!{!>},<,i{>}},{{{}},{{{<!!!>!>,<>,<iou!!!>!!!>!>,<!,u!!!>!>},<>}},{}},{{<!>},<!>},<!>i<!!o{u!!!>,<a!i!!!><>}}}},{{<,oa!>o\"!>},<a!!a}>},{<'!>},<ii\">,{<,u>}},{{<a!!!>,<o}!!!>,!<'>},{{<!!e!!,!ui!o,>}}}},{{<>}},{{{},{{<!>},<<!,!!!>!!!!!!!>},<e!<!>},<!>!!'>},<o\">},{}},{{<\"!i!!ii!!!>,<,!!!>'{,'u<>}},{{<<!{'\"!>},<>},{<,!e!>!!!>i!>,<!>,<!!\"!>},<!>!}!>!>},<oa{\">}}}},{{{{<<>}},{{<!>!!u!!!!},!>},<!>'<!>,<!!{\"i\"'!!!>!>},<o>},<!>,<!o!!!>>}},{{{{<}{a!>},<uu}<!>},<!>},<,\"ia!'!!,e'i>}},{{<!!>},{<!>},<{!>,<ii,e'a!>},<!!\"!>!>,<\">}}},{<!>,<{\"!>!>,<!i!>>}},{{{{<ea!!}i'>}},{},{{{{<!!!>!!\"a!>,<>,{}}},{<!>},<e'>}}}},{{<!!\"'{{!!o,'u!,>,{<a!!{!>>}},{{{{{<}\"!!!>!>u!!!>}}i!>,<}'a!{{>},<,!>!>!}<i!>,<!!!>},<a,>},{{{{<>}}},{<!>,<!!eao,!!!!'>,{<i!!'\",!\",a!au>}},{{<!!',!!oa!!!>a!,ei!!!>!>\"!>>}}}},{<!!,!!!>!>},<!>!>}}\"\"<!!,eo!>},<>,<a!!!>{!>},<!\"<!'}>},{<o>}},{{<e}!>},<u!>!>},<!!\"!!<'!!i!>},<!>,<!}!>{,!>},<>}}},{{},<!>!!!>'}eu!>,<!a!!!>!!!>!!!>!!!>\"}!e>}},{{{{<!,!}!!!e<!!!>!>,<i!i>},{{<!!!>,<{!{i!>}!}a\",oo!>,<!!!>,<>,{<,!e'>}},<!>},<!i!>},<!<<!!!>a!!!!'<'!!!>,<>}},{{<e!>},<!!!!}>}},{{<o!,{o!!!!,!e<i!>,<u'<i!!!!e>},<!u!>,<!>},<!!!>},<\"i!!e!>},<iu}!>},<i>}}},{{{<!>{}\"!!!>},<!!u<!>,<\"!<a,{!!!>>},{{<!>},<>,{<a\"'!>},<{\"!}!!oo!!!>'!>,<u'!>,<'>}}}},{{{<!!!!u\"ioa,!>},<!!!>!>},<!!!>},<!'!i!!u>},<{!>,<u!!<}!!!{auau,}i>},<a<!!ou!>,<!!!!i{!>,<<>},{{}}}}}},{{{{<!!u,'<!!!>},<<u!!!'!',!>,<\"!>,<!!!!!>}>},<!>,<!!!!<,!!!!!!}!>{'!>},<ue!>,<!ao!!!!!>>},{{<!!}uo!>,<}i!{>}}},{{{{{},{}}},{{<a!>{>,<!>,!!!u!>>}}},{}},{{},{},{}}},{{{{{<a!>,<e,!!\"!!!>},<!!{}}!!,io{!ioou>}},{{}},{}},{{},{{},{{{}},{{<<!!!>},<,'!!a!>},<!!!>'!!!>>,<!>',!>,<e,<,<uiaaa!>!!'!>},<>},{{{<!!!>'!!!>!>},<e!>ue!e\"!!!>},<<uu!!!>\"o>},{<!!!>oe}{'!!<>}},{<>}},{{},<'!>},<!!!>u>}},{<>}},{{{{},{{{<,a!>e!!!>!!!>}o!>},<e!,!!e}\"!!!>,<>}},{{<}!!!!!!!>o<>}}}}}},{{{},{<{!!!>'!!u!!!>'>,{{<!o!>'!!!!e!\"i>}}}},{{{<u>,<!!,o!!e!!o{o!>,<>}}},{{{{{{<!!!>}!>},<!!{!!!,>},<!!!!u!>o''\"u>},{{{<!!!>!!a!>,<'{!>,<!>,<>}},<<!!\"\"!!o!!iauu!>},<i!!!>ii!,!!e>}},{}},{{<!!!!!\"!>},<{i}!>},<!!e{ea!!!>!\"<e!!u>}},{{{{}},{<,!>i!!i,a!>},<\"!>u!aoe>,{<,<!!>}}},<i!>!>,<'!ua!o!>,<!u!!>}},{{{<ea\"!!!>!>},<!,,!!!>!!oie\"!i>,<!!!>{!!!>'{{>}},{{{{<!>!!o!>i!!!>},<<e!!'!>,<e>}}},{},{{<!>},<!!}>},<uo!>>}},{{{<'!!!!!>o!!!!!>!>,<!>},<!!!>>,{<}!!!!!!u!!!>},<!!!>,<!{!!\"!!!>>}},{<>,{<eii{!!'eua\"i!!!>'>}}},{{{<e!>ee}i!a!!!>!!!>},<}<!!!>!!,!!!>!>!!i!>,<i>}},{{{{},{}}},{{{{<!!!>e{uo{u>,<!>!!!>,<{!>}!u>},<!!!>'>},<,!!u!>,<!!}aiua!!!>,<!!!>>}}},{{}}},{}}},{{<,{{>},{{<,!>},<i!!!>iu{}!>,<!!!>!!!>!!!>{!{a,>,{{<!!!>!aa>},<au\"ua'e!!!><!>},<!u!!!>o!!'!,>}},{{},<\"'ai!!!>'ia>}},{{{},{<u!>},<\"!!!'!>!!!!}!>},<!!!>!!!>,<uo!>,<>}},<!>},<}'!><o{!>,<i{!>!!,>}},{{{<!!!>\"}>},{<ie!>,<}}ieo!!o!>,<!!!>!!!>>}},{<\"!>!e!!!>!>},<!!{,!>,<!!!!!>,!<>,{<>}},{<!>},<!!a}!!{\"!>,<!>!<}<o!!!>{'>,<!'\"o>}}},{{{{<!>,<!!!}!!}!>,<eo<}>},{{<e!!!>,<!e}!e{!!!>},<!>o!!<!!'!!!{{<!><>,{}}}}},{{<}'!!!!'!<o!>>}},{<,u!!{!!!!!>\"!!e>,<!'<!\"!>},<}\"}<!!!>!!{o!!!>o!ie!!!>>}}}},{{<!!!>},<!!!>i!>e<!>!<!>,<!!!!{\"uao\"i!>,<!>},<,>,<u!!{{!!'o!>},<!!,}>},{{<}ei!>,<o{!!!>!}u!>},<!>},<!!o{!>,<iui!>},<>},{<!,oo''}!!!>},<!!!>i!>},<a!!!>u}u>}},{}},{{{{{{<\"io!>},<!>,<\"}!\"!!!>}}>},{<>}},{}},{{{{<!>!>},<!>,<!!uo!!o!>,<!!eu!>o!{>},{<a<iu,!!aa!ea!!!!!!!>!u<i<,!!\"!!!o!e}>}},{{<u!>,<e<>}}},{<a!>},<!>e'<!!!!!>!!!!'!a!>},<}i>,{{},{<<a!}!o\"!>,<<u!>},<!>},<!!!>!!a\"e>}}},{{<!a\",i<>},{<!io!>,<>,<'ai!\">}}}},{{<e!>a}}!\"!!e!!o,e!>,<i{!!!>,<{<ua>},{<!<i\"!!!>!!>}}},{<!!!!!!u>,<e!!!>,<<eu>},{{{<!!}{!>},<''!!!>!!{!!!><!!i!>},<a,!!!>},<'!!!!!>},<>},{}},{{<!!!><!!ou,!>uea>},{}}}}},{{}},{{{{{{<u>}},{{},{<}!!!>,<u>}},{{{<!>u!{io!>,<!!a!!!>{{>},{{<}!ea!>>}}},{<!!!!!>,}!!!!!>!!!},!>,<,!!{'!!!o''<>}}}},{{{{{},{{}}},{}}}},{{{}},{},{<'u!!!>!!!!!>},e}{io>,{}}},{{{{}},{<!!\"}>}},{{},{{{{},{{}}}}},{{{},{{}},{<{!!!\"!!!>!ea!!!<>,{}}}}}}}}},{{{{{<!>,<a!>!>!\"}!!>}},<!!!>!!!!!!!\"!\"i,!>,<>},{<!!!!!!<!!!>i!!!>{e!>a'i{!!!><i>},{}},{}}},{{},{{{<!uo{{o!!!e!>},<!\"eo>,{<!!>}},{<u,>,<,'aa{!!!>},<!!!!!!a!!'',i}'!>!>},<!!}ei>},{{<!>},<!>e>}}},{<{!!!>!>!!>}},{{<!!!>,<\"{oo{!!!>,!>},<i!>>,{<i<\"iu!>a'!!!!}!>,<o!!!>ii!!\"!>>}},{{{<'oo\"}!!!>},<ee'!!!>{e!!\"!>,<o>},<iui'!!!>},<oa>},{<o<u!!o<!!!>!!}uu!>},<i>}},{{{}},<{<!>},<i!!!>u<u!>},<!>!>,<,{<,{>}},{{{{{}},<}o!{<}eoe!>'{a!>,<!>},<>},{{{<{!>,<!>!}!!!!}>,{<ue{!>,<!>},<!>},<!!!>o!!'!>,<!}!,>}},<\"!>!>e!>},<\"\">},{<i}!!u!!!!!>,<!!!>!!a'<!>},<!>},<{\"!!!>!!>,<!!!>!!{>},{{{}},<oeae!>,<!\"!!!>'!>,!!!><!}!>},<!>,<u>}},{}},{{{{<\"'\"},'}!>},<\"!,!!!>!>,<!!!!!>!>,<!!a>}},{}},{{<!\"!!,!>},<!!{'<u!!!>{!><!>},<!>ie!>,<!!!>},<>}}}}}},{{{{{<!!!>au>,{<!!!>!>{\"!>,<!>},<{{a'a\"{,o!!!>!!<>}},{},{}},{{<>}}}},{{{<!>!!!>!!!>>,<!ie}!!!>>},{{{<\"ei!!!>,u>},{<<<!!!>,<!!!>ia!>},<!!!!!>\"\">}}},{{{{<a!>,<u{'!i!>},<!o>},{{{<eu!!!>},<>},<!!!!\"!!!>!!!>i,!!!>o\"ao!>,<e'!!i>}}},{<'!!o\">}},{{{<>},<!>a>},{{<!!\"!>,<u!>,<!>,<}>,<!>,<ou{!'{!,}!>,<>}}},{<'<e<{''i!>},<!!!>,<u!>,<!>,<<<\"!!<>,{<!!aoa!!!>!!'!>{!>},<'i!!!>>}}}},{{{{<'e}u\"}a!!!>!!!>,<!!!>},<}!!!>>},{<}e!!!!}a{i>}},<i<a\">},{{<<!>,!>!i!!!>},<!!eu>,{{<!!!>{}!!\"!>},<!>!!!>!!!>\"!!!!>}}}},{{<}!!>},{<i,!>},<!u,!!u>}}},{{{<!>,<!!!>!!!>!!!>,<}!!>},<!>},<uo<!>},<!>},<i!u!!!>!}\"<!!!!!>o,>}}},{},{{{{},<!>,<,eeu!>,<,\"u'\"!>},<\">},{{{<!!!!a!a!>,<!>,<!>},<!>,<!!e!>,<>}},{}},{{{{{}},{{<ea!!e!>oo!>o!!!!!!!>{!!u\"'\">}}},{<o,}!!e!>},<a!!!!u!!'{io>}}}},{{{<>,<'a,}!!!!!<'!!!>},<e!!{!>,{!!\"!>!>},<!!!}>},{{<a>},{<!!}\"!!!>},<!>},<o<o!>},<i!>},<!!!>,<!!!>\"!!<{!!o>}}},{{<!>e}{!{!>,<!>,<{<!!!}!!!>u}e!>e!ua>},{{<\"}'!>,<u!!!>{,!>}}{!!!!!>,<!!{}>}}}},{{{},{{},{<'!!!>}!>},<oa!!o\"!>},<!>,<!'!!!>,<u!>,<o!>!!<!>>}}},{{{},<!>!>,<,<!!o}{>}},{{{<>}},{<!\"ou!,,i!>,<a'!>\"'!><{>},{<,!!,!!!!!>\"!!!>!>},<\"!!!>!>>,{<!>,<!>},<,!>},<!!!>}!!\"!>,<!>},<<<!>u'<!!!>>}}},{{{<}{!>,<<\"!!!>!!{!>,<>},{{},{<\"!>},<{e}>}},{<\"a!>},<e!>},<'{!!!!!>i!>,<!>>,{<!!!>,{,!!!>!!a!>},<!>},<>}}}}}}}}")
(def mitch-data "{{{{{{{<!!\"!!!>},<>},{<o!>},<u!!i!!'!>,<!!!>,e{'e!!!>},<!i>}},{{<\"o!!\"!>,<>},<!io<>},{{},<!!!>!>,<o\"e!<!!!>{,!!!>{a!o,au!>},<>}}},{{{<e!}>},{{<!>,,e!!!>!!,>},{<a!!!>'!!!>!!!!,!!!>!!!>!>},<<{\"!!>}},{{<!>>,<!>},<i!>!<>},{<!!<u,a\"!>},<o{{!!{!!!>i,!>,<i{!u>,{<a!>e}o!>!>e>}}}},{{<i<!>,<!!!>,<ei,!>a>,{}},{<!!!>},<e'>,{}},{{<!!!!u<,'}!>,<\"o<>}}}},{{{{{{<!>,<o!!!auii!!!!!>!!!>,<{>}},<},!!!>!!!!!>>},{<'u<\"{>,{<!!!!e!>,<'a!!i<!>,>}},{}},{{<i}<!u<{!!!}!!e!{!,>}},{<!!e,!>i>,{}}},{{<i!!!>},<{''i!!!>,!e!>},<!>\"a{>,<!!'u!!!>},<>}},{{{},<i!>},<<!>},<\">},{{<!>,<o!!!!e{uee!!}o<ei{i!>,<!!!>,<>},<,!>},<a!>>},{{},{<}i,!'!!<!!!>}>}}}},{{{{{},{},{{<i!>,<!\"!!!>!!!>''>,{}},{{<!>},<u!a!!!>!u!\"'!!{!!!>!!!>!!i!!!>,<,a!!!>i!>},<\">,{}},{<!!!eoo!!!!ai'!!u!!!>!o>,{<,!!!>aai}{}}\"'>}},{{},<i'ia,!!!>o!>,<\"!!u!>>}},{<!!!>{u!!!>,<,<!>},<'<}<'\"!>},<!u>}}},{{{{<}!!a}!>},<'>},{}},{{{{{},{{<i{!'u}}{>,{{{{<}!>,<!!!!uau!{''!!}ua>}}},{}}},{{{<!!},!!\"\"!!!>,<i!'!{!>},<o>},{<a!u!!\"<!>},<\"!,{<<e!!<!!u!>},<!o!!{}>}}}}},<,o}!>,<!!!!'!'a!!{>}},{{{<<>},{{<ui{!!i!>{'!!!>},<'>}}},{<{!!!>},<!a!e!!!>o'i!!<'!>,<o!!e!!\"!>,<!>>},{<{a>}}}},{{{{<\"{!!!>,e!!!>\"a!!}!!!,!>>},<o!!!>>},{{<o!{}!!!>},<!!,!!\",!>!!!>!>,<ee!>,<!>!u>,<!oo\"u}!!ua!>},<!>},<iie>}},{{<!!!>>},<!!e{!!!!!!!>},<}!!{}!!}<,>}}},{}},{{{<!>!>},<e\",!>,<!>,<!>{!!<!>oi>},{<!>!!!>{}o!!!>!>}a!!>}}}},{{{{},{<\"!!u\">}},{{{<\"e!>,<u{<}>},{}},{<!!!>,!!!>!>,<,!}!!!!'ei!!i,>,{<!!a\"ua!!!>>}}},{}},{{<!!a!!!>!!}eu!!}{{a\"\">}},{{<u!>,<!>},<!!!>oi!!!>!>!>},<'e{u!'}!>,<!>},<!e>,{<u!!!>}!u<!a>}},{{{<!><!>},<!!!>ii,>}}},{<!>u{'!!!>{i!o}}e!!!>},<a!!!>,<>}},{}}},{{{{{{<ao!!>},{}}},{{<\"!!<!>},<>},{<>}}},{<{>},{{<!!!>e!>},<u!!,!!ou}i'e\"i>},{{{{}}},{<o!!'!o!!!!!>!ao{<!>>}}}}},{{{{<}}!!!>o!><}o!!{!!!>i!!,>},{{<!!!>'!!!><!>,<>}}},{{{{<o!>!>},<,!!!>o{i{>},{{{{<!>},<a!uo\",!>,<!>},<e!>{,}!>},<!>,<>}},{}},{}}}},{{<a!>},<\"i!!!!!>,<!!!>\"!!oa!!!>!!{!!!!!>!a>,<<{!!!>,<!>\"}!>},<!>,<!\"!!!\"!!ou!>{u!!!>>},{{<<!>,<!!'!!'o\"!!!!o\"}!i>}},{<}!!}!!}<{>,<!!!>,u!>},<o!ae'u!>},<!>},<<u!e>}}},{{{{<!>eui\",o!!!>!>\"i>,{<!!!,!!u!!>}},{{<!<>}},{<'!>,<ia!!!!!>},<ea!!!o!>!!!>!<'!e!>},<>,<>}},{{{{<a!!!>!!!>,<'o>}}}}},{{{<!!!>},<,a'a'!!!>,iu\"'!>,<}>,{}},{{<!>!>,<<!!!!!>>,<!!!>!>>},{{<,!>,<oe!\"!>!!u!',ia'\"!>,<!>,<,>},<<!!!!'!!!}}!!!e!!!>,!>},<}!!!!!>,<>},{<\"ia!!a!!!!}i!>'>,<\"aio!>,<\"e\"e{!!i!!!>o!{!>!!!!\"\">}},{{{{{<\",u!!{!!{!!<!>},<!u!!,!!!!!>!!!!!!!><\"!>},<>},{{<'!\"o,!>},<!>,<\",!!!!uu!!i!!!>!!\"!!!>,<>}}},{{<'!!!!a<<!!!!{u!!,!>},<!>},<o!>},<ouu!!!!!\"!!!>>,<!!!>}'{!!a!!\"!>},<,ao!!!!!!!>!>!!,<!!!>}>},{},{{{<'!!{\"}iu!!e!>!>uo!!}!>,<,!>a>},<<!!!>,!ae!>!>,<a<!!,>}}}},{{{<u!<>},{}},{{{{{{}},<!!!>a!>},<{>}},{<!!<<!>!!!>i!!!>!>},<}{,!!a>,<!>!>\"<,e!ee!>,<}!>}\"!!!>!!!>o>},{{{},{{},{{{},{<<<'!!!>!>u'i,{!!!>!<!!!>a!>,<>}},<!>!!!><!!!!i!!!>}!,\"!!!>!!!>>}}}}},{}}},{{<<eo!!!>!!!!!!!>{{!!!>iou,a'!>,<,>},{}}},{{{}}},{<{!!!>!>,<!!!>},<!!!!}!!!!,a!\"\"}ie!\"a>}}},{<!!!!!>!!'',eu!e!>!!!>!>},<>,{{<e''u!>!>,<a!ui}u!>,<>}}},{{<'>}}},{},{{},{{}},{}}},{}},{{{{{<!!\"\"!!,a<>}},{<',<!!!><!!!!},\"}>}},{{{{<>}}}}}}},{{{<}>,<<u{!>},<!!\"i!aeu!>o\"o}o>}}},{{{{{<u!!ee,e>},{<u!!!>!>,<!>},<o>}},{},{<!>o{!!!!i{!>},<o!>\"!!u}<e\"}!!i\">,<i!!!\"e!>,<!>,<>}},{{{{<u!>},<!!!>'!!!>!!!!!>}{!>}a!>,<u'!>{!!!>'>,<o\"!>,<u>},{<!!uoa>,{{<!!!>,<u}>}}}},{{{{<!>},<!!!><u<>}}}}},{{<!!!<<!!!!,{!!!>!>!!a>},{{<>}}},{<'\"a{a}{!'e!!\"u'u\"!\"o!!!>,<i\">,<!!!>!!!!<u}!>,<}<!!u>}},{{}}},{{{{{<!!!!a!!u<!>},<,e!!!>iu,>,<'a,uu!!'}!!!>},<},a<!!!>e>},<>},{<{'>,{{}}},{<a!>},<!>,<!!,,u!>},<!><,a>,{}}}},{{{{<eu!!!>},<>}}},{{<!!''!>},<}o!!{>},{},{<>}},{{{{}}},{<}!}u!,,!!!!u!!i}!!!><'!!>,<eo>}},{{{{}}},{{{<!'!!\"!>},<{!!!>!i!{e!!>}},{{}}},{<!>ua<<!},!\"!>,<!!<!!!>'e<a>,<!!!>!,!u!>,<}\"<e!!'!!!>},<!!u!<a>}}},{{{{<{!>,<\"!!io!}ei,!!!>o,!>!!}!>,<<'!>,<!!!{>},{}},{{{<!>},<!!\"!!!,i!!oe!!}{!>o\"!>!!!!,a'!>,<>},{{<i!!i!>},<}!!!!!>a}!!!!'}!!\"a>,<!!!>,<e!!!!!>!>,<>}}},{{{},{<}!!eu\"eii>}},{{<!!!>},<>}},{{{<{'!>},<!!!>{>}}}},{<\"o!!!>i,!>},<oo}!!}<!>},<<>,<a!!!!!<>}},{{<,,!>},<e<!>!!!!}i>},<i'!>,<>}},{},{{<,<\"!!!!!!!!!>!'u{>,<{>},{{<>},<{o!>,!!{!!<ooi!!!>,<!>,<!!!}\"e!>,<!!\">}}},{{{{{<au>,{<!>!>,<\"e!},>,{<eo},'!!>}}}},{<e!!>,{<\"!'a{!>{i,!!!>,'!!!>!!!i!i!!!!o!>},<i!!!>>}},{<{!!,!>!>},<\"!>,<uau!!,i!>},<o!>,<\">,{{<',i,!!!>{}oi>},{<ee,!!!>!!!>ai!!!>!>!!'>}}}}},{{{<'!>,<i{!>},<!!i>},{{<a!o!>,<!!!>\"!\"\"'!!\"!>},<e,e'!>},<!!>}},{{<<>},{<u,!>!!>}}},{{},<'\"!>a>}},{{<eo!<'!!'>},{{{<i}<<\"!!!>},<e'!>!!i!!\"e<!!o<u>},{<!>,<o!e\"!!!>io!!,,!!!!!>{!ooo<,a>}},{},{{<!!!>o!!\"e'!!i<!!!><!!<o>}}}},{{{<<e!!!>\"i!!u<'!!a!\"!!!a\"io,!>},<>}},{}}},{{{{{<!!,oe>},{{<u!!!!!>}}!>},<!>},<!>!!!>,<!!>}},{{}}},{{{{<'>},{<uoi<u!!e{>}},{<e!!!!ao}!!!>,<'}o!!\"\"!!!>>}},{<uieoai\"a>}},{{},{{<,!}>},{<!>},<u'!{!>},<{\"a,{{}auo!!{\">}},{{{},{}},{<!!!>,'!>{!!!>!!!!u{!,!>!!!>!!i!!o!a,>,{{},{<!>,<!>,<!>,<\"a\"<,o>}}}}},{{{},{<!e!!!><!!}>}},{{<!>},<o>}}}},{{{<!>,<{i!!'!!!>ii,}>,{<ee!!!>},<o>}},{<!!!!!!!!!>!!{'ao>}},{{{{<!>},<!>\"\",!!!>,'!!!>}oe}},}!>,<>}}},{<!!ie'!!'{i!!i<}'o!!}<>}},{{{<<aeo!!,a!!ui>}},{},{{<'!!<{!o!\"!!!>},<!!u!!!>>}}}},{{{<!!!>!!!>},<!!!>},<!>},<!>i!\">,{{<!!'<!>},<\"u!!!>!!!!!>'>}}},{{{<!>,<}!!!!'!!!!e!>!>},<!!a!uo<aa!!ao,o>,<!!!!e!!!>iu'!!aa!!>},{<'o!!!>{!!!!!>!!}!i!!!>!!!>!!!>!}a}!!\"!i!!!>!!!>>,<\"'<{!>,<!>,<!!<}!!!>!<i!!\"!\"!>,<!>},<<}a>}}},{{<e<>}}},{{{{}},{{<,!>,<}!>},<!!!!a{a>},{<i,a!!!!!>i!!ao!!!>>,<!!!>>}},{{{<>,<eu\"<',!>}!!{!!oa!!!>!u\"'!!!>,<!>,<>},<,ee'}'!!uo!!!>,<}!!'<u{>},{<!!!>!!!>e!!!>},<!>},<\"!>},<!<aa!!!{}\"!>!!,a!>,<!>},<>},{{},{<!o>}}}},{{<!!!>}!>!>,<!>},<<!>,<!>{}<!a!'!!i!aa\"{>,{<!!i!!!>!!ia!>'!oa>}},{{<o!>,<\"!!!e!!<<!>,<!>o!!i>,<!e!>!>,<o<!!!>o!>},<!!!>u!!!>!!>},{},{{{<\"!>,<oao!>,!!!!u!e!!!{}u!!,!!}!!!>>}},{<!!,ei!!!>!}!>}!!ua!>!!!!!>!!!>\"!'!!!\">,<,!!!>,<e!ai!'!>,<,{>}}},{{<a,!!!>,<a!!!>'i!>!!!<!>},<,}!!!!!!o\">,{<!!!>,'e'!!!!!a!!i!u!>},<<'!!!>}e,>}}}},{{{{<{e!a!>},<ui,!!!!{>,<uia!i}aoa<<>}}}}},{},{{{{{<<!!'!!,>},{{<<}\"u!!!!!>o\",!>},<!>},<a>},{}}},{{{<!,'!!<!!!>u!>,<!!!>{!>},<>}},{}}},{{{{}},<!<>},{{{<i!{!>,<!>!>},<}a!>,<a>,{<<!>},<!>},<!!'!>!>!!!>>}},{<>},{<!!!<\"!!<!!!>!!!>,<!>},<<!>},<'>}},{<!{<!>,<a!!ae,!!!>'a!!!>'\"!!!ue!!>,<a<u!>},<{{!!!>o!!!>i{!,>},{{<,!!!>},<'i!>,<u\">},<'!>!>},<{!!{!!!>!>},<o!!ui!>},<!!}>}}}},{{<,\"<e{>},{<!>,<!u!>},<>,<u<!!}o>}},{{{}}},{{{{<a!>},<!!!!!>aeoo\"!>,<>},<e,!a!!i\"ee}!>!>,<>},{},{}}}}}},{{{{{{{<u!>!!',!!!>},<i!>aia!!!!'!>,<\">,<!!!>!>,<!!!>!!ie!>o,<>},{<'!!e\"!!!\"!,\">,{{{<<!!uu>}},<o<i!!!>,>}}},{<!>ueo\">,<i!>},<o<>}}},{{{<!!!!!!!>!!!!!>,!!!>u'!iaa<uu}>}},{<!!'o{!>!>!<'!>},<!>},<!!!>!{o'!!!>>},{<e!u!>,<!!!>!\"!!e}!>},<,i<aea>,{<\"!!!>!!!>!>},<}>}}},{{{{{{}}},<,!!u!>i}u!>,<!!!><!>,<i{>},{{<!>!ai!u>,<!>,!>},<<!!!>i!>},<\"!!u!uu!!{>},{},{<}!!,!!!>i{o\"a!!'ioi>,{}}}}},{{{},{<i,{!!!!\"!{o!>,<ou!!!!'\"!!o>}},{{{<i,!>!!!>,!>,<a!>},<!!a!!!!!>,<<{!!!!>},{<!'!>>}}},{<>}}}},{{{}},{{<,>,{{<!\"a!>,!>,<'a\"!>>},{}}},{{{{<,,e}}i<!!!>{ia'o!>},<a<>,{}}}}}},{{{<\"!!!>\"\">},{{<!>},<<\"a!>,<<{!>},<!!,e,!!!{>}}},{<a\",a!!!i!>},<>,{{<oe!!!>!<eo'e!'!!i,i{!!!!!!!>,<!>,<!!{>}}},{{<!o,!!oi!>,<!!'\"{!\"!!u>},<'{!!!>!>,<,u}!>!>},<!!>}}},{{{{<!>,<!>!!!>!!!>o!!ae!!!!!!!!!>{!>},<!!!>a'au,>},{{{<,!!!>,<!>},<'>}},{}},{<eea!><,>,{<!!!!!>!{!u!>,<u'{!!}!!!!!>u>}}}},{{{{{{{{<!>}\"e!>},<!!'u}>,{<u!o!a<e!!\"o!!!!!!\"!!}a>}}}},{},{<u}u\"!!!!<i!!i}>}},{{<'{!!'!!!>!ii!!o!!!>a!>},<!iu<{a>},<>}},{{<!!<!!!>a}e!>,<!!!!e,,e!<>},<',e!u!!u>}},{<>,<e,!>,<!!uui!>,<>}},{{{},{<a!'!!',,\"o,>}},{<o,!!a>},{<!>},<{!!!!ai!>,<!>,<u!!i!>,<!!<!!!>i}!>e>}},{{<>,{<,'!uu!!!>,!o!!!>u{!!!!!ea,e,>}}},{{{{}},{{<{!>,o!>!>},<,<,!!!><\"}''oa!!!>!>>},{{<{!!uou!!<i>}}}},{{<!!!>,<!'a!!<>},{<!i!!!!!>>}},{{<<\"}!>},<\"{o!>},<'!>ie!!a!!a\"o!>},<!!!>>,{{{<!!i!>,{!!!!!>!!e!!!!i!>,<>}}}},{<aa!!,u,e>,{<!>!>,<<!!!>!<u,>}},{{},{<}io{!,!!>}}}}},{{{{<\"\"'!!!>!!!'{'u!i<>},{<a,e!!o!!!!\">}},{{{<u}a!>},<!>,<!!a!e,<!!ei!>,<,a!!!>,<\">}}}},{{{}},{{{<,<ei!!!>u',\"!!o'!!!>>}},<!>},<\"e,<!!!>!}!o!>},<!!iuo{!>,<u!>},<>}}}}}}},{{{},{{},<!>},<ia!!!>,'!u>}},{{<au'i!!u!!!o!!>,{}},{{<!>!>,<!!e!>e{!!}!!!>\"i!!!<>},<>},{{<!>{,!!,{!!!>\"!!!ea!{u!>o<o>}}}},{{{{{}},<!!!!!!!e!>,<!>,<{<>},{{<o{a{{u!!\">}}},{{},{{<!!!>,<{!!uu!!!>{>,{}},<!!<e!i!!!{!!!>!!\"<,<!>,<!>},<>}},{{{{<!!!!!>'oo!!!>,o>,{<!!!!!>!>,<,!>},<'!>,<ioa>,{{<!!<>},<'i!>a'i!>,<}!!'!>!!\">}}},{{{{}},{<!!!>>}},{},{{<\"u!!u!\"!>,<u>},<u!!!>!>e<<u<!>},<a<!i\",o!{!>,<,>}},{{<!>,<!!!>}!!!>{oiaou!!}eu!!i\">},{{{},<!>},<>},<\"a'}a!>{ao!!!>!!!>!>!>,<!!!>i!!'eo>}}},{{<!!io>}},{<!}e!\">}}},{{{<!a!!i!!e!!!!!>o!>},<!,aa,i\"o!>,<e,>},<a!!{<!!!>!!u!>},<!o{!!!>!>,<!>,<{e>},{{<>},<o!oo>},{{{<,!>,,,o'!o>,{}},{{},{}},{{<!iueieo!!!>!>,<}!>},<'!>},<{!>,<ii>}}},{{{}}},{{<o<!>},<!!,i!>!><!,e!>uo\"e}'<>},{{<,!!'!!!>!!eo!>},<o!>,<!!'oe!!!'ea>}}}}}}}},{{{{}},{{{{{<oeo,!>},<!!}{!o<!>},<!>!>,<oo!>!!!!>}},{{},{{<>,{<!!!>a{,'\"!!a>}},{<}!u\"\"<}ei!!<'e{>,{<i<i!>,<u>}},{{<,!!a,!!!{,}',u\"a!!!>{<iaa>},{{<!!{a'!!!a!>},<u!>,<!>},<!!iiii!!!>,<\"!>,<}!>,<ae>},<}\"!>!!!>{!!i!'aa!!''>}}}}},{{<}!>,<',aa<!!!!<!!>,{<'!!!>'a!!!>!>,<e<!!a,,<\"!!>}},{{<\"!!!!!>,!>},<!>>},<{{!>},<!>,<{!!ee!i>},{}},{<!>!>,<!!!>},<,,!>,<!!'!}!ueeueoaao{u>,<'i}}{!>},<\">}},{<>}},{{},{{{{<u>}},<!>},<!!i'{!>,<!>,<<u{{!>\"!>,<!!!o!>,<!!\"e!>},<>},{}},{{{<,<!!!>!{!>},<<!!!>'!>},<o>,{<,!a<u!>}!!!!!>!!!>>}}},{{<}!>},<!>},<u'!>e<eo,!!!>!\"!!ao!ua>}},{{<a!}'!>},<}'oa!oa!>},<!,a!>u!>a'e>},{{{<!!!!e!>{>},{}},<o>}}}}},{{{<iue!>},<>,<!><,u!!!!!>ae<{{>}},{{<!!!!,!>!>!!!!!>!!'!<!!oo!>,<!>,<!!i!!!>>},<,,!!}!}!>o\">},{}},{{{<i!!eio{{!>,<}>},{<'uou!a{,'i!!!>!>o{>}},{{<\"!>},<!!!!!!!>,>}}}}},{{{{{<'!><!>,<au!!!io!!!>!!!>},<!>,<!!!>!>},<!!!>}!!>},{<\"!>},<!i!>},<,'!!{i!a!!!!!>a\"!!!!a'u!!>}},{<},,!>},<e!!!>\"!>},<<u>,{<>}}}},{{<,<!!!>}<!oi!>}'!>,<'i!>>,{<!{i!!!>uo!!oie>}}},{{{<u'{>}}}},{{{{{{<a!!>}},<a!!\"'!!i,,!!uo!><e!!!>ui>},{{<i{o!!!>a!!!>u!!{ai>,<!>!!!i\"!>},<a{}!>'!!!!''<ae!>a!!!>},<>}},{{<ea'e!>!ao!!!>>,<i!!!>!>!!!!!><u!>}!>a>}}},{{},{},{{<!!ue!>},<'>}}},{{{{{<!<<<,\"o!>,<a<!>},<,>},{<u!!!!!\"!!!!!!\"!>},<!>!!<!!!>,<!a'!!}!!>}},{{<!>},<!>},<!!i{!!!>!>o!!\"u!!o>},{{},{}}},{{{<\"e\"io!!i!>,<i!!!!o\"',>},{{{<!>},<!>},<e!>!>},<!>},<!!,!!}<,<>}}}}}},{{<!!!>,<!!!'a!>,<,\"!o!!!>!>'>},{<}e>}}}},{{{{{},<{o!>,<o{,\"i,!!e!!e!>},<!!a}!>},<>},{<!>!>},<'!>},<i!>,<u!i'!!!>}!!!>!!,oo{>,<u!>},<,{i!>!>,<'u!!!>,<i>}},<\"!>,<!!,,'!!!!i>},{{<u!>i\">},{<'u'''!!!>e!>!!u'!>,<!a!\"!!ua>,<\"!}<u'eo!a!>,<\"}!,}a\"!>},<>}},{{<!>}e!!'!!!>>},{<!!{!>},<>}}}},{{{{{{{}},{<>}},{}},{{{{<!i{!{!!!>\"a!!o!!!>'eo!>},<!>!o!>},<>,<a!\"!>},<!!}!u!!<!!!!,a'<i!>,<!!\"!{o>},<iu{!>,<!\"!u<>},{<,i!>,<,}!>},<!><{!!'!>},<>,<!>!u!!!>!!!!\",!>,<!{}i!!!>e!!e>},{{},<!>},<!>},<'!!'!!!>!>},<}<!!\"!!!>'!>,<{>}},{},{{{<!!e}au\",u!!!>}!!u,}!!!>'!!!!!>'!!!>>,<!>,<oa,!}\"u!>!!o!!a>},{{<!>},<!!{'o!>oo!>!>!!'e!!u,>}}},{{}},{<!>,<\"!!uu!>!!eu>}},{{{<!>},<u!o\"'!!!>!!ue\"ea!}}>,{{<!>'>}}},{{<!>},<!>},<i!!o!>},<ia}ee!!!!ao!>,<!>,<ua>,{<!!!!!>!!!>u,<!>,<e!!ea<>}}},{<'<!>ou'!ao,>,{<a!>,<!!!!i>}}},{<!>,<\"!o!>,<,e!>,<<\"!>,<\",<a>},{}}},{{{<>}},{{},{}}},{{{<!>e!o>},{},{<{ua!>!>,<!}!!,!!!>i'<!!u!!{!>,<>,<!!!>>}},{{{{<!!!!!!!!u!!!>i!a!>!!!!i!!{<!!!!}!>,<!!oo<\"a!!!!!>>},{<!!!>!!aau'!>},<!!a!!{!>},<a>}},{{},{<!>'a}!>,<!!!{!!!>\"!,>}}},{{{{{<\"<<!>},<o{oao{!!!>!}{'!>},<>},<,e,!!!>,<!o!ioiu!!<!>,<e>},{<!u<i,!>\"}!!!>!>>}},<'eoa{'>}},{{<e>},{<>},{<}!>!!o!ue,o{\"!!e'!>!!<!!!>>,{<>}}}},{{{{<!>},<!!a!>,<!!!>!!>},<!>\"e!a<a\"{!>,<!i}<a!>,<}!>>},{<!!e>,{<o{}!i!!<{!!!!{!o'<!>},<!>},<o>}},{{<!!o!>!!!>!>>}}},{{{},{<e,o!!!>!>\"{'u!{e!>},<!o!>},<!!'!!e>}},{{<!!!>\"!}!!!>o!ao'e!}!>!>>}},{<e'!>},<u}!>},<!>},<{<''!!!>u!i'!!!>!>},<!>i>,{{},<!>},<eua,{!!!!\"!>},<u!>},<!>,<!,\"oi>}}},{{<i,{\"}!>,<e,e\"!!!>}}i!{!!!!!>,<>,{}},{{<e!!!>!>,<,!>,<a}u!>!>i!>},<!!a{>},{<u}{}}!!!!!>!!!>{<ae!>,<oo!>,<a{>}},{<\"<'<!!'\"o!!!!i!!i!>},<!>,<!o!!e!>},<!<!!!a>,<!>u!!'!!!>!>,<{{uui!>,<\"!!\"!!>}}},{{{<e!>},<!!\"i!!{ee!!,euu\"<!>,<u!!!>!!u,>},{{<!!!!!><'!,!>ee!>},<<!>,<oa!>,<!!!>>}},{{<u!!!!!>{{i!>,<{oi!><<>},{{<'<o\"!!eo!>!!!>},<>}}}},{{{<!>!'!>,<!!!>e!>!!!u,>,{<!>\"u!!a{!>,<>}},{<e!>},<e!u\",{{ei!>!>,<!!!\"ui,>,{<!!!><!!!!!><}!!\"eo!!!\">}}},{{{<{,!!i!!!!!aa!>,<!>,<>},<ei!>,<oo}!!!><!>,<,!>},<o<!!!>!!!>!u!!!>,>},{{{{<i<,}ii>},<oa!>,<\"eu!!'!!!>!!!!o!!!!!>,<!!!>>},{{{<,>},<'oa!!!!u}e!!}}!>,<ea{\"!>!!,>}}},{{<u!!\"<'>},{<!>},<}!!>}},{{<!>,<>},{<!e!!e!!o{u!>i!>,<',}e\"'>}}},{<!!!>e!!}e{}'}!!>,{}}}},{{{{{<aaae\"'!!\"<u!>},<>}},{<!>u!!au!>,<!!<<'>,<<,o!!!!!>iie>},{{{<uo{}!>,<!>},<>,{<!ie!!o<<!!!!!>!!!!!!>}},<o!!!u!!!>i}<!!!>},<{!>,<!u!!!>,<e'!!{ieu>}}}}},{{{<!!{a!>i{u<}i<!!\"!!!>!!,>},{{{}},<{a!e!>o!<!>\"o>}},{{{<'!!u!!u>},{{},{<!><!e'e!!\"!>>}}},{{<!!!!}{a!!!>!!au{i>},<{e!>!>},<!>},<}o>},{{<!<!>,<}e!e'>}}}}}}},{{{{<e'!i!><!>,<!!'!!<a!>,<,!!!>>}},{<!!<!>},<'iu>,{<e{!u!!!>},<<>}}},{{{<<{,!!,!!u!!}}!!u!!!>i>},{<ae!!!>'o{o\"{!!!<,!!}u!!!>!u!!>}},{<}'!!!>!>\"!!'},}i!>,!>,<'\">}}}},{{{},{{},{<eeuo!>},<>}},{{<'\"!!<e!>,<>,<a'!>,<!!!>},<!!aa!!!>eu!!!>,<i!!!>>},{}}},{{{<i!>!!o!!'>,<!>!aa'!>},<',{>},{}}},{{{{},<{!!!>,<!>,>}}},{{{{<!!!>a'!!u!>,<a}}!>,<!}!>!>,<>},<<e!>,<!>},<!,}}\"!<!!!!!>!\"u>}},{{}}}}},{{{{<!}!!\"o!>},<!!'i}!>},<!>'\"ui{a{>},{<!>},<e!!!>oe!!!><<<,<',!ee!!!!o{>}},{{<!!o'!>,<!!!e}i!}>,<!>o!!'<oa>},{{}}}},{{{<!!\"'e{u}>},{{},{<ue'!>!!!!!!}!,'{i,,!,}!>,<!!!>!>,<>}}},{{},{{{<<e!>,<}a!>,<>}},{<!\"!!!>!>!}{ii!>},<{\"e!>},<'aooe>,<!>!>,<!!<i\"!>,<!>a!!!!oa,o>},{<!!!>},<ei!>,<>,<!>},<''i!>!>,<u!!!!}!>>}}},{{},{{<a!!!>!ia!!o!!!>},<!!!>},<!'!!!>ia>,<o{!>oa!!!>}'\"!!a}{!>},<!!!!!>!>,<'}>}}},{{{<\"!>,a,!!!>ui!!!!\">},<{<!!e!!!>i!!a,!!!>'>},{<!>},<!\"e\"}ue!>,<!!}}!!a!>},<!!'}!>,<!<\"u>,<<\"!!!>,'{i\"u!>,<ou,eo>}}}},{{{{{},{{{<!>},<!{!>!!ou}!>,<i!iu!>},<<!!uo<>},<<!u,}a!>!{>},<{!!u<!>,<<!>e'!!!{<e!u!!!>!!a!>,<,>},{}},{}},{{{}},{{{{<!>},<u{\"!!!!>},<!>},<e!!e!>},<!>,<io!!iau!>!!!!!>'!u>},<e!>,<!>,<<e!<u,}e\"!>,<!!!>!>!!>},{{<}i!!>},{<!!\"!!,,,!>,<u\"!!!>,<eo}a\"!>,e'},>}},{}},{{{<!!!>,<a>}},{{{{},<e!!\"!!i!!'!>\"!!!>!>,<>},{<<}u!>},<o'!\"!!u!!!>>},{{<}!!!>},<,o!>ai{\"!>e!!!>},<a>},<<iaa<!>}},\"a!>},<eu>}},{{{<!!!!o'}u!!u!!'e!{!!e!>},<{!{}i!>,<u!>,<>}},<ia!!!!!!!>!>},<!!!>'>},{<!>,<<ee>,{<}!!u{ea}!<e\">}}},{<>,<!!!!o!!!>}<oa\"i!>>}},{{},{{{{<<!!{!!\"!>,<}!!<!\"i!>,<,a,i>},{<{!'<{a!>\"!>},<ue<>}},{<!!!>,<,u!>!!'i!'!>},<,,>,{<,!,!u!>\"!>},<{!>},<}a}'!,>}}},{{<!>!>},<!>{!!!>e!!e!>},<!!<eo!!o'!!!!!>!>,<>},<o>},{{{<!>},<u!!!>!!!>'<{<!>!!'e!>},<a!!!>u}oo>}},{<ee'a,'{!!!!!o!ooi!uu>,{<au!uu,!!}\"!>,<ie<>}}}}}},{{{<}e<!>,<o!au!>},<}!!!>!!!>a}u!>},<!!!>,'}>},{{{<i!>!!!>,<!>!,!>,!eu<a}>},<!'!!!!'!!!>{,>},<u}i!>>}},{}},{}},{{{{},{<,i!!!>!!}!!!>u!!!>!>\">}}},{<!{<!!!>,!>,<!>!>},<i!>},<}!!!i>,<>}},{{{<!>,<!>},<',i}}>},{{<{i!>>}},{{<ei!>,<!>!>,<a!!!>!{!>},<>,{<ae\"'>}},{{<!!!>!>},<!>},<!!ia!!\"'\"!!o!!!>!>,<}'!><!>},<\"!!!>>,<<!!i!>,<!>e'!!!>!>},<uoui!!}u>},{}},{<o!>!!!>!>,<a}eii>}}},{{{{{}}},{{<!'!>},<au,!!!>\">}},{<{oi}!>!>ai!>\">,{<!>},<\">}}},{{{<e!!{!>},<>},{}}}}}}}},{{{{<e<!!!>!!\"o!>},<>},{{{<u!!,,!>},<o!!!!,!!!>},<aii>}},<}{!{a!>uo!>>}},{{{{}},{<e'{e>}},{{<!>!!uo\"o!!i'ae!>},<!!!>,!>,<i!!'>,<!>!!!>u>},{{},{}}},{{{{<!!!>'!>,<,i!!!>>,<!\"e>},{}},{{{<o!!!>},<!!!>!>,<!{a!>e{,!>,<!<o{!>},<!!{>},{{{<''<!!!o!>,<!>i{!!!>}!>},<\"a!!!a!>,<!!!!!\"'a>}},{{<,!!!>,<!!<'}!>,<!!!>{\"\"uu!oo!!e,!>,<'!!a>},{<,\",!>,<>}},{<!!i!>,<!!!!!'!>!!!>\"!!,<o!!{!><!>},<}!o>,{<,!>!'!>{uo!!!>>}}}},{{<o!!}!>,<\"ooi>},{{<iiu,!!o!>,<aa!e<'>,<!!!>,<u!i{u!!!>},<!!!!!>,<!>},<o>},<!e,}'oe'i!>!>e>}}},{{<!><'!>,<i<i'!!!!'<!>},<aoa>},{{<!!!>>}},{{},{<e!!{'{>}}},{{{{}}},{{<e<{i!>},<,!!!>\"!>'a!!''>,{<,!>},<!>,!!\"!>!!!!!!!>\"e!!o!!!>a<!!{!u!>,<>}},{{},{<!!\"!,!!!i!!!>!!o!>,,{!<!!!>\"a\"u!\">}}}}},{{{<a<>}},{{{<!><{!>},<oo!>},<}}!a{!!!!,!>>},{<!!!\"'!!!>ueu!>,<!>,<!>},<e!!!><>}}}},{{{{<'a!>},<!!!>u!!!>!!!>},<!!'\"}a>},<!!'{>}},{{{},{<!>!!!>!!,u<i!>!>},<,'!>},<i,>}},{{<,{a{\"\"!>,<!e!!!>!!,!>}'<}>},{<o!>oa!>},<aa!!oe{!>\">}}}}},{{{<{,u}u<}\"!>},<!e>}}}}},{{{{{},{{{{<!>,<>},{}},{{<<>}},{{<o!e!!'<}!!!>iae!>,<>}}},{<>}}},{{},{{{<a'!>},<>},<!>!!!>o!!o!>,<>},{<<a!>},<>}}},{{{{<!>},<!!e,i!!!>,<u<!>},<o<'<!<!!o{!eo>}},{{<oo!>a\"o!!!>u!>},<!a'!!!!!!'!i>},<!!\"{\"!!!><>}},{{<!>,<>},{{<!>!!!>ea!>},<'<{io>},<!!!>!>,<!!!!i{!!!>!}!>!!!>,\",a<a{!e}>}}}},{{{{{{{{<!>,<!!''!>},<{!!{!!!>!!\"!>},<a!,<u>},{{{{<>},<,<o!!!>\">},{{{{<u!uu!!<!!!!}>},<!!!>,'a,{!!!!iie,!!!!>},{<}o'o!<!!!>u!!,<''!!!!>,{<}'\"o,u!!!><u!!!>},<!!!>!}!!!>!!<\">}}},{{}},{<!!!>\"!>},<!>,<e{oi,>,{<!>!!!>!>},<!!,,!!}u!>!!!!!>,<\"!!!>,<,!>,<ie}!>,<i{>}}}}},{{<u}a!>},<!!i!\"<\">},{{{{<{'{!<!>,<!!!>>}},{}}}}},{{<a!!!>>}}},{<!>,<!>,<!!!>\"!>,<i!!u,}{>,<'}!!!\"{!>},<!>},<!!!!i!>},<}a!>\"\"!>,<!!!!!>u>},{<!>,!>,<ie<a!!!>u\"!>,<>}},{{{}},{<}!!a!e!!!>,!!!!!>>,{<!>{,,!,!!o{}''!>},<!>,<!{\"'oo!>>}},{{{{}},<!>},<}ai\"!>},<!!{!,!{}''o!!{!!!>,>},{},{}}}},{{<!}a{i>},{{<}!!!>,<!>,!!!>\"!\"ieia}!>},<'!>,<i>,{<!>,!}!!!!o{a''!>!!!>>}},{<u!!a!'!!}i!!u'!!,,,!!!>{o,>,{<ae!>},<\"u,!!!>},<i!!!!!>},<!>},<!!a!!>}}}}}},{{{<!!,i!!!!ie>,{<!>},<!>o!!!>!'}<oe!!\",!!iu!!!>>,{<!!<!>a','\"!a!!!>i!e{o!>!!'!>,<>}}},{{{},{<<<>,{{{<ai!!!>!!i{e}eia\"!>},<'!>'!e>},{<<,!!>}}}}},{{{},{<,i<}<!!\"!>}>}}}}}},{{},{{<'>},<!!!!!>!>},<}>},{{{<e!>e{<}!>,<<o>}},{<!>,<e<o!>!\"\"!!!>au!>},<o!!!>{!!a}e{!!!>>}}},{{},{{<!!o!>},<i>,<!o!!oae\"!!<!!>}},{}}},{{{{}},{<!>},<{,{{!',a>,<<,!>,<}!>},<!!e!>!!uu\",i<i<u!!\">}},{{{{<!!aoa!>},<e{}!>},<!,!!u}aa>},{}},{{{<!!!>i'!oa!a!!a}'}!!!>e}>},<<!>,<u'!!!!{!!\"<!>,<!!!>}}{u!>,<<\"!!>}},{{},{<i>}}},{{<',!!!>!!!>!>,<>,<i!>aeoao<<!>{!>,<>},{{<,u!!!!e!>>},{{{<u!>},<!>},<!>!>},<!!}{,i<!>!!!>\"\"o<>}},{{<}>},<!>,<}!!!>},<!>,<i,{!>,<\"uo!e!!<!!!>}!>,<>}}}},{{{<,!',u!<,!!\"ie\">}}}},{{{{<!!!><!!<ae<!>>},{}},{{{{{<ui!>!>,<!>{,e!!ee!>,<e!i>,<!!!!!>{aio!!},>},<!!<\"!!!!!!a<ou,>},{<!!,!!!!!o!>!>,<!!e!!!>,!>,<!!aaii!>'<!!!>!>>,<,!{!!!!!>\"io>}}}}},{{<<'!u!>!!'{!!,!!!!i!>}!>!!a,!!!>,<a>,<!!!>!!!>\"!!!>'}!!<<>},{{<oi<!,<!>},<<e!!>},{<\"a}!>>},{<o!>,<<\"i<!!!!!>e'e}i>,{}}},{{<oei!!,!!!>},<,}{!!o>}}},{{},{}}}}},{{<u!!!>oo>,<'e<\"!!>},{{<!!!>{>}},{{{{<}o!!!!\"{i'!!!!i>},{<u!'}<!!i!!i,i!!!>!a!!e\">}}},{<!>},<!>,<'u>}}},{{{{<{{i!>},<>}}},{{<o!!a<>,<!!}!!{!!!>,<{!!!>,<!!u!>,<!!!>,<!>>},{<{o!!<a\"<!>,!!!>,<!>!!,auo}!!!>!!}!!\">,<!!<,\">}},{{<{!>ei'ie!>},<}!!{e!>},<!>},<!!!><o>,<ie,},!>},<{!!<!!!>e\">},{<!>\"!!>,{}},{<{i{u!>},<o!>},<!>},<>,<{!!!!!>!!i!!!!!>!!\"{!>},<<<'o>}}}},{{{{{<ei!>},<!!!>!!!!ia{u!!a}}i\"!>},<ii>}},{{}},{<!i''!!!>!!}!!'!!i!a\"!!>,<i}!!\"aa!!!>!>},<!>!ii!!!>u,}>}}},{{{<u!!!>{'e{ai\"!!}!>},<<!!!!!>e!!!!!>!>,<\">,{<!!!!!'}!>,<'!!!>}\"<'!!!!!>o!!!>i<\"<>,{<e!>{!!!>}!>,<}>}}},{{<u>},{<i!!e!!e!!!>},<!!\"e'{>,{<!!e!<>}}}},{{<u>}},{{},{<!>},<!!!!,'!>\"ie!>},<'u>,{<!>\"e!><{}!>,<!>},<!>},<!!!>}u\"i<!!aa{>}},{{}}}},{{<!a!\"u'\"!!{!>,<!!,!>oe!>,<>},{{<u!!!>!!!>i!!!>},<a,!>!>,<{!!,i!>},<!>},<>,{<{!>,<{!!!>,<{<o>}},{{<i\"!'ai\"!!oa!>,<e!!\"!>},<!!!>!>!!\"!!!>!>!!{>,{<!\"!a!!!>!>!a!!u>}},{{{<e!!\"<u'!!!!!i!!'<!!!>,ai!!}!!!>!>},<!!!>,<>},<!>,<ii,!>}!>},<>}},{<!!!>},<>,{<au!>}!!,u>}}},{{{<!!!>!>},<!>,<!>,<!o!>,<!!!!i!a!!\"i>}},{<i!!i!!!>>},{{<u!!ai!oau'a,'{u>},<!!\"!!!!>}}}}},{{{{{<a!>u\"}\"\"!ei<}o<!>,<>,<'>},{{{<>}},<!>,<!>},<}!{,!>,<!!{!{!!u<!!!>!oo>},{{}}},{<u!!!>!!'u,!!o\"!>,<}i\">},{{{<!>,<\",'!>},<\"{ai!!',!>a>}},<i!!!>},<i!>},<ei!{!!<{!>},<'!>,<{!!!'{o<ue>}},{{{<io!>!!!>},<},io!>,<}!!a}o!>!!!>,!!!'>},{{<!!!>!!!>\"o>},<'!!}>},{{{<!>\">}},{<!!!>e!>,<'{!>}'!<u>,{{}}}}},{{{{{<,!>},<!,'e'!>,<i!\"<i!>aue'}>}},<!u'!!a!>\"!>},<u!>,<!\"<!>,<i!>},<!>},<!!oa>},<!>},<o{!>},<>}}},{{},{{<!>},<!>u\"},!><<a!i!!u>},{<u,a!!<e<{>},{<!>},<!>,<}<u!!!>'>,{<u<}!>},<e!><u!!!!!>!>!>},<>}}}}},{{{{<!!ae>},<>},{{{<!>},<!>},<e'!!u!>,<!!!>!!!>{',iou>}},{{<\"{{!!!>},<'}i!!a!!!>!>,<i!<>},{{<>},<!!!o>}}},{{}}},{{{<!>},<!!!>u!!,!!!!!><>}},{{<}!!\"!>},<!>},<!!a!!!>a!!!>!!!>a!>},<\"iu>},{<\"<<!!{!!!>\"!!a>,{<!>},<!>,<}o!!!!!>\"!>},<!!eua}ie>}}}},{{{<!>!>,<ii!!e!e'{i!!oo!>},<!!!>}{i<u>},<!!<!!}\"!!!>a\"ui}<>},{{<,!>,<iia'o!\"!>!>,<'u!!!}e}e>},<!>},<i!>},<eu!!!>!>!ao!!!>'o!>,<!i{!>,e>},{{{<!!a\"!!<!>,o'>}},{{{<i!>>}},{{<<<!!!o!!,,o<ai>},<!>,<e,!!!>,'>}}}}},{{{<',!>u<}!!u'!>},<ai!!'>},{}},{{<<u!!!>!!!>{!!!>,!>,<!>},<!}!!!>!!!>>},{{<}\",!>},<!>,!',!>!!<>}}},{{{{<{>},<!!!!<{!!!>>}},{{},{<,<uu'{\">}}}},{{{{{<!!!>},<!!}>},<!>i!>!!!!!>!!\"!>},<}!!!{!',o>},{<!!!>a!!!!!>},<!><o'{!>}!!<\"!>},<!>},<!a>}},{{<!u'}!!}!!!<,a\"a!>,<u!!\">}}},{{{<i!>},<!!'}>,<<\"u!>!>!>},<!!!>e!!!>u}>},{<!>},<\"!>,<o!>},<!!u<}>},{<e,oi'!\">,{{<}\"!!!>},<e!!!>a!!!!!><e!!!!!!!>}!'i!o>},{<o!!\"eu<u,!!e!!!!!!!e!\"a!',!!!<ee{!!\"o>}}}},{{{{<!>,<\">},{}},{{}},{{{},{<!!>}},{{<{a!!!>,aa!!!>!>},<!>,<}}!!!>!>},<!!'!!!\"au>},<!!!>!}!!!>,<a'!>o'}!u!>,<',!!oe!!\"!!!!>},{{{{<!!a<}!!\",,!iua!>},<!>\",a'>,<!e>}},<{!!!>!i!!!!''a!>},<!!!>!!u,e,'>},<!>oi!\"!>,<!>},<,o\"e\"o\"!>,<!>>}}},{{<i\"'!!}\"}!!\"u{!{,'u!!>,{<'i!!ea>}},{{<>},<!>,<!}!o!>,<\"}}!>!>o>},{{<o'!!!!{>}}},{{{<o,'!!!>\"<!>},<!!\"ie,{'{!>},<,a>}},{{}}},{{{<o'!!}a!!>,{<u!>{u{uu!'!>,<i!!!!e!>!>},<<!!!>,<a,a>}},{{<e!!!!\"'!>},<o!><>},<!!i!!!>!!!!!><o>},{{{<\"u!!a!>},<}!!!>{!>,<>},<,{!!a!!>},<e<!>o<,!!!>i!!!>!!!>},<}i!>},<!>\"\"!!>}},{{{{{{<{>}},{{<oi,'!>},<>},{{<!!!e!!'e!e!!e,!,!>!!!!!>>}}},{{<!!!>!!!!!!!>,<<a,aa!>},<i>,{{<'!!!>!}!!'a>}}},{<'!>,<e>}}},{{<!>>},<o!>},<'e!!,!>,<!>a<!{>}},{{<!{!!'!!!>},<u!,u{,!!i!e!!'!'!>!!!>oi>,<!u!!!>!!!!!>,<!!\"!>!!!!e,!!<!>,<!!!>i>}},{}},{}},{{},{<!<}<e!>,<!!!>>,{<!>},<!>},<!!!>!>,<'<{',e>}},{<!>u'}!!!>ui!!}\">,<!!e!<!>,<u!ie!!!>!>>}}}}},{{},{{{{},{{<>},{}}}},{{{<\"}!>!!!>>}},{{{<<''!>,<u<\"!o!!!>>},{}},{{<!!!>'\"<!>},<!!!>,<!>,<i!!!>,!!!>!>},<>,{}},{<,{e!!!!!>},<>,<a'!>},<!!}!!!>>},{<>,{}}}}},{{{<<{>}}}},{{{<!>}i{!>},<!>!!!>},<''!>,<u!!u>},<{i'\"!!!>!!!!!>!>!!!>!!i>}},{{{},{{<\"!>,<!!!!!!!>,{{!!ue}!>>},{<!!}!>,<{!>'!>},<o{<!>},<!!!>\",,!!u!!\"o>}}}}}},{{{<!>,<a'i!>,<>,<!!{,<!>},<}e>},{{},{<,!!e>}},{<!!!>,<!>,<'e},!!!>}!>ei{}}!!'{!'>,<,<o,!,iu\"}ue>}},{{<a!>\"eo{!>,<,!>,<!!!!a!>,<'aai!>!>},<i'>},{{{<i!!!\"{i!>,<!>,<!>},<>},{}},{{{{{<!ao!,a}!\"!!!ee!>}!!!>>},<a,!>,<,!>},<a!>,<<\"!!'\">}}},{<!!'!!i!>!>,<>,{}}}},{<o!>},<!'{!>!o!>},<}!!}a!!!>>}}}},{{{{},<o{iu}\"e!!!>,!!\"o!>},<!!!>\"!!a!>},<<!!<,>},{<,>,{<!>},<!!'<\"i!!}!>},<!u<o!!!!!>,<>,{<u<,!!a\"<!>,<!!!o!!aa}i}e}>,{}}}}},{{{{},{<!,u>}},{{<!!i!>!>,<!>},<,!>!>,<e!!u>,{<!'a!!!>,<!!!!,o!{!!i>}},{{{<!!\"o!!!>i{\"!>o!!!!!>>}},<<!!uu!>},<'ou<aeeaie!},i>},{{{<!!'a>},{<!>,<!!!>eae!>,<ou!!u}>,<>}},{<,i\"u}!!'i'!!!>{!>},<!!{o!ii!>\">}}}},{{<!>'ua\"'>}},{{{},{{<!>!!!>a<'>},{<i!>,<!>,<!!!>,<!>},<a,,>,{<>}}}},{<,u!>aa{aeo!e,<>,{<!!>}}}}}},{{},{{{<''>,<}a!>},<ao!>},<{!!\"!!}e}u!!a!>},<{!!u{>},{<ueo>,<}!<>}},{{<aeu!!i}!o!>},<!!!>i'}\"{,<o>,{<ii!!!>},<>}}},{{{{<!>,<!!'o\"o!!!>i{,i>}},{<<\"o,o}!!!aa\"e!!!>o>,<{!>,<ua{a>}},{{{{{},<'ui!!!>,<!!i>}},{<e<}!e!!u>},{<!!!a!!!>oo!!,!!!>,<o>}},{{<'uo}o!!<e!!!>},<u,\"a>}},{{},{{},{<!>>}}}}}}}}\n")

(defn find-score [col]
  (loop [check (seq col)
         group-stack []
         depth 0
         in-garbage false
         score 0
         cnt-garbage 0]
    (if (empty? check)
      [score cnt-garbage]
      (let [character (first check)]
        (cond
          (= character \!)
          (recur (drop 1 (rest check))
                 group-stack
                 depth
                 in-garbage
                 score
                 cnt-garbage)

          (= character \<)
          (recur (rest check)
                 group-stack
                 depth
                 true
                 score
                 (if in-garbage (inc cnt-garbage) cnt-garbage))

          (= character \>)
          (recur (rest check)
                 group-stack
                 depth
                 false
                 score
                 cnt-garbage)

          (and (= character \{) (not in-garbage))
          (recur (rest check)
                 (conj group-stack character)
                 (inc depth)
                 in-garbage
                 score
                 cnt-garbage)

          (and (= character \}) (not in-garbage))
          (recur (rest check)
                 (butlast group-stack)
                 (dec depth)
                 in-garbage
                 (+ score depth)
                 cnt-garbage)

          :else
          (recur (rest check)
                 group-stack
                 depth
                 in-garbage
                 score
                 (if in-garbage (inc cnt-garbage) cnt-garbage)))))))

(defn test-scores []
  (map
    (fn [[col answer]] (= (first (find-score col)) answer))
    [["{}" 1]
     ["{{{}}}" 6]
     ["{{},{}}" 5]
     ["{{{},{},{{}}}}" 16]
     ["{<a>,<a>,<a>,<a>}" 1]
     ["{{<ab>},{<ab>},{<ab>},{<ab>}}" 9]
     ["{{<!!>},{<!!>},{<!!>},{<!!>}}" 9]
     ["{{<a!>},{<a!>},{<a!>},{<ab>}}" 3]]))