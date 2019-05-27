//clean Census data

clear

import excel "C:\Users\Dell\Desktop\IntraHealth\CENSUS\RAW\Central_Region_parish.xlsx" , sheet("1.Population and HH Composition")firstrow

//Rename column / variable names

rename PopulationSizebyParish PopulationSizeMale
rename F PopulationSizeFemale
rename G SexRatio
rename H TotalPopulation
rename HeadshipofHouseholdsbySex MaleHeaded
rename FemaleHeaded MaleHeadedPercent
rename K FemaleHeaded
rename L FemaleHeadedPercent
rename L FemaleHeadedPercent
rename HouseholdHeadshipbyspecifica headship10_17
rename N headship10_17percent
rename O headship18_30
rename P headship18_30percent
rename Q headship60
rename R headship60percent

rename U hhdpopnBroadAges0_17percent
rename V hhdpopnBroadAges18_30
rename W hhdpopnBroadAges18_30percent
rename X hhdpopnBroadAges31_59
rename Y hhdpopnBroadAges31_59percent
rename Z hhdpopnBroadAges60
rename AA hhdpopnBroadAges60percent
rename AB Totalhhpopn
rename PopulationDistributionbySpeci pdnlessthan1yr
rename pdnlessthan1yr popdnlessthan1yr
rename AD popdnlessthan1yrpercent
rename AE popdnlessthan0_4
rename AF popdnlessthan0_4percent
rename AG popdnlessthan0_8
rename AH popdnlessthan0_8percent
rename AI popdnlessthan2_8
rename AJ popdnlessthan2_8percent
rename AK popdnlessthan2_17
rename AL popdnlessthan2_17percent
rename AM popdnlessthan6_12
rename AN popdnlessthan6_12percent
rename AO popdnlessthan6_15
rename AP popdnlessthan6_15percent
rename AQ popdnlessthan10_15
rename AR popdnlessthan10_15percent
rename AS popdnlessthan10_17
rename AT popdnlessthan10_17percent
rename AU popdnlessthan15_24
rename AV popdnlessthan15_24percent
rename AW popdnlessthan16_24
rename AX popdnlessthan16_24percent
rename AY popdnlessthan15_29
rename AZ popdnlessthan15_29percent
rename BA popdn2yrabaove
rename popdn2yrabaove popdn2yrsabove
rename BB popdn2yrsabovepercent
rename BC popdn10yrsabove
rename BD popdn10yrsabovepercent
rename BE popdn15yrsabove
rename BF popdn15yrsabovepercent
rename BG popdn18yrsabove
rename BH popdn18yrsabovepercent
rename B1 popdn20yrsabove
rename BJ popdn20yrsabovepercent
rename BK popdn65yrsabove
rename BL popdn65yrsabovepercent

//Drop first two rows

drop in 1/2

//destring variables supposed to be numeric

destring PopulationSizeMale, replace
destring PopulationSizeFemale, replace
destring SexRatio, replace
destring TotalPopulation, replace
destring MaleHeaded, replace
destring MaleHeadedPercent, replace
destring FemaleHeaded, replace
destring FemaleHeadedPercent, replace
destring FemaleHeadedPercent, replace
destring headship10_17, replace
destring headship10_17percent, replace

destring headship18_30, replace

destring headship18_30percent, replace

destring headship60, replace

destring headship60percent, replace

destring Totalhhds, replace

destring hhdpopnBroadAges0_17, replace


destring hhdpopnBroadAges0_17percent, replace
destring hhdpopnBroadAges18_30, replace
destring hhdpopnBroadAges18_30percent, replace
destring hhdpopnBroadAges31_59, replace
destring hhdpopnBroadAges31_59percent, replace
destring hhdpopnBroadAges60, replace
destring hhdpopnBroadAges60percent, replace
destring Totalhhpopn, replace
*destring pdnlessthan1yr, replace
destring popdnlessthan1yr, replace
destring popdnlessthan1yrpercent, replace
destring popdnlessthan0_4, replace
destring popdnlessthan0_4percent, replace
destring popdnlessthan0_8, replace
destring popdnlessthan0_8percent, replace
destring popdnlessthan2_8, replace
destring popdnlessthan2_8percent, replace
destring popdnlessthan2_17, replace
destring popdnlessthan2_17percent, replace
destring popdnlessthan6_12, replace
destring popdnlessthan6_12percent, replace
destring popdnlessthan6_15, replace
destring popdnlessthan6_15percent, replace
destring popdnlessthan10_15, replace
destring popdnlessthan10_15percent, replace
destring popdnlessthan10_17, replace
destring popdnlessthan10_17percent, replace
destring popdnlessthan15_24, replace
destring popdnlessthan15_24percent, replace
destring popdnlessthan16_24, replace
destring popdnlessthan16_24percent, replace
destring popdnlessthan15_29, replace
destring popdnlessthan15_29percent, replace
destring popdn2yrsabove, replace
destring popdn2yrsabovepercent, replace
destring popdn10yrsabove, replace
destring popdn10yrsabovepercent, replace
destring popdn15yrsabove, replace
destring popdn15yrsabovepercent, replace
destring popdn18yrsabove, replace
destring popdn18yrsabovepercent, replace
destring popdn20yrsabove, replace
destring popdn20yrsabovepercent, replace
destring popdn65yrsabove, replace
destring popdn65yrsabovepercent, replace

save "C:\Users\Dell\Desktop\IntraHealth\CENSUS\RAW\censuscentralpopn.dta"


