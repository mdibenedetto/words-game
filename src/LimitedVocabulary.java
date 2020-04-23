/**
a limited vocabulary with 1024 english words encoded as a 1D array of words

words source: https://gist.github.com/deekayen/4148741
-- from the above list of words have been kept only the words that have at least 3 letters
-- in addition, several words have been added so that there exist words that start with every letter of the english alphabet
*/

public class LimitedVocabulary{
	private String[] words = {
		"able",
		"about",
		"above",
		"act",
		"add",
		"afraid",
		"after",
		"again",
		"against",
		"age",
		"ago",
		"agree",
		"air",
		"all",
		"allow",
		"also",
		"always",
		"among",
		"and",
		"anger",
		"animal",
		"answer",
		"any",
		"appear",
		"apple",
		"are",
		"area",
		"aria",
		"arm",
		"arrange",
		"arrive",
		"art",
		"ask",
		"atom",
		"baby",
		"back",
		"bad",
		"ball",
		"balloon",
		"band",
		"bank",
		"bar",
		"base",
		"basic",
		"bat",
		"bear",
		"beat",
		"beauty",
		"bed",
		"been",
		"before",
		"began",
		"begin",
		"behind",
		"believe",
		"bell",
		"best",
		"better",
		"between",
		"big",
		"bird",
		"bit",
		"black",
		"bliss",
		"block",
		"blood",
		"blow",
		"blue",
		"board",
		"boat",
		"body",
		"bone",
		"book",
		"bookkeeper",
		"bookkeeping",
		"born",
		"both",
		"bottom",
		"bought",
		"box",
		"boy",
		"branch",
		"bread",
		"break",
		"bright",
		"bring",
		"broad",
		"broke",
		"brother",
		"brought",
		"brown",
		"build",
		"burn",
		"busy",
		"but",
		"buy",
		"cabin",
		"call",
		"came",
		"camp",
		"can",
		"capital",
		"captain",
		"car",
		"card",
		"care",
		"carry",
		"case",
		"cat",
		"catch",
		"caught",
		"cause",
		"cell",
		"cent",
		"center",
		"century",
		"certain",
		"chair",
		"chance",
		"change",
		"chaos",
		"character",
		"charge",
		"chart",
		"check",
		"cheerleader",
		"cheese",
		"chick",
		"chief",
		"child",
		"children",
		"choose",
		"chord",
		"circle",
		"city",
		"claim",
		"class",
		"classroom",
		"clean",
		"clear",
		"climb",
		"climbing",
		"clock",
		"close",
		"clothe",
		"cloud",
		"coast",
		"coat",
		"coffee",
		"cold",
		"collect",
		"colony",
		"color",
		"column",
		"come",
		"committee",
		"common",
		"company",
		"compare",
		"complete",
		"condition",
		"connect",
		"consider",
		"consonant",
		"contain",
		"continent",
		"continue",
		"control",
		"cook",
		"cool",
		"copy",
		"corn",
		"corner",
		"correct",
		"cost",
		"cotton",
		"could",
		"count",
		"country",
		"course",
		"cover",
		"cow",
		"crease",
		"create",
		"crop",
		"cross",
		"crowd",
		"cry",
		"current",
		"cut",
		"dad",
		"dance",
		"danger",
		"dark",
		"day",
		"dead",
		"deal",
		"dear",
		"death",
		"decide",
		"decimal",
		"deep",
		"deer",
		"degree",
		"depend",
		"describe",
		"desert",
		"design",
		"determine",
		"develop",
		"dictionary",
		"did",
		"die",
		"differ",
		"difficult",
		"direct",
		"discuss",
		"distant",
		"divide",
		"division",
		"doctor",
		"does",
		"dog",
		"dollar",
		"done",
		"door",
		"double",
		"down",
		"draw",
		"dream",
		"dress",
		"drink",
		"drive",
		"drop",
		"dry",
		"duck",
		"during",
		"each",
		"ear",
		"early",
		"earth",
		"ease",
		"east",
		"eat",
		"edge",
		"effect",
		"egg",
		"eight",
		"either",
		"electric",
		"element",
		"else",
		"end",
		"enemy",
		"energy",
		"engine",
		"enough",
		"enter",
		"equal",
		"equate",
		"especially",
		"even",
		"evening",
		"event",
		"ever",
		"every",
		"exact",
		"example",
		"except",
		"excite",
		"exercise",
		"expect",
		"experience",
		"experiment",
		"eye",
		"face",
		"fact",
		"fair",
		"fall",
		"family",
		"famous",
		"far",
		"farm",
		"fast",
		"fat",
		"father",
		"favor",
		"fear",
		"feed",
		"feel",
		"feeling",
		"feet",
		"fell",
		"felt",
		"few",
		"field",
		"fig",
		"fight",
		"figure",
		"fill",
		"final",
		"find",
		"fine",
		"finger",
		"finish",
		"fire",
		"first",
		"fish",
		"fit",
		"five",
		"flat",
		"floor",
		"flow",
		"flower",
		"fly",
		"follow",
		"food",
		"foot",
		"for",
		"force",
		"forest",
		"form",
		"forward",
		"found",
		"four",
		"fraction",
		"free",
		"freedom",
		"fresh",
		"friend",
		"from",
		"front",
		"fruit",
		"fry",
		"full",
		"fun",
		"game",
		"garden",
		"gas",
		"gather",
		"gave",
		"general",
		"gentle",
		"get",
		"girl",
		"give",
		"glad",
		"glass",
		"gold",
		"gone",
		"good",
		"got",
		"govern",
		"grand",
		"grass",
		"gray",
		"great",
		"green",
		"grew",
		"ground",
		"group",
		"grow",
		"guess",
		"guide",
		"gun",
		"gym",
		"had",
		"hair",
		"half",
		"hand",
		"happen",
		"happy",
		"hard",
		"has",
		"hat",
		"have",
		"head",
		"hear",
		"heard",
		"heart",
		"heat",
		"heavy",
		"held",
		"help",
		"her",
		"here",
		"high",
		"hill",
		"him",
		"his",
		"history",
		"hit",
		"hold",
		"hole",
		"home",
		"hope",
		"horse",
		"hot",
		"hour",
		"house",
		"how",
		"huge",
		"human",
		"hundred",
		"hunt",
		"hurry",
		"hymn",
		"ice",
		"idea",
		"imagine",
		"inch",
		"include",
		"indicate",
		"industry",
		"insect",
		"instant",
		"instrument",
		"interest",
		"invent",
		"iron",
		"island",
		"job",
		"join",
		"joy",
		"jump",
		"just",
		"keep",
		"kept",
		"key",
		"kill",
		"kind",
		"king",
		"knew",
		"know",
		"knowledge",
		"lady",
		"lake",
		"land",
		"language",
		"large",
		"last",
		"late",
		"laugh",
		"law",
		"lay",
		"lead",
		"learn",
		"least",
		"leave",
		"led",
		"left",
		"leg",
		"length",
		"less",
		"let",
		"letter",
		"level",
		"lie",
		"life",
		"lift",
		"light",
		"like",
		"line",
		"liquid",
		"list",
		"listen",
		"little",
		"live",
		"locate",
		"log",
		"lone",
		"long",
		"look",
		"loop",
		"lost",
		"lot",
		"loud",
		"love",
		"low",
		"lynx",
		"lyrics",
		"machine",
		"made",
		"magnet",
		"main",
		"major",
		"make",
		"man",
		"many",
		"map",
		"mark",
		"market",
		"mass",
		"master",
		"match",
		"material",
		"matter",
		"may",
		"mean",
		"meant",
		"measure",
		"meat",
		"meet",
		"melody",
		"men",
		"metal",
		"method",
		"middle",
		"might",
		"mile",
		"milk",
		"million",
		"mind",
		"mine",
		"minute",
		"miracle",
		"miss",
		"mix",
		"modern",
		"molecule",
		"moment",
		"money",
		"month",
		"moon",
		"more",
		"morning",
		"most",
		"mother",
		"motion",
		"mount",
		"mountain",
		"mountaineering",
		"mouth",
		"move",
		"much",
		"multiply",
		"music",
		"must",
		"myth",
		"name",
		"nation",
		"natural",
		"nature",
		"near",
		"necessary",
		"neck",
		"need",
		"neighbor",
		"never",
		"new",
		"next",
		"night",
		"nine",
		"noise",
		"noon",
		"nor",
		"north",
		"nose",
		"not",
		"note",
		"nothing",
		"notice",
		"noun",
		"now",
		"number",
		"numeral",
		"nymph",
		"object",
		"observe",
		"occur",
		"ocean",
		"off",
		"offer",
		"office",
		"often",
		"oil",
		"old",
		"once",
		"one",
		"only",
		"open",
		"opera",
		"operate",
		"opposite",
		"order",
		"organ",
		"original",
		"other",
		"our",
		"out",
		"over",
		"own",
		"oxygen",
		"page",
		"paint",
		"painter",
		"painting",
		"pair",
		"paper",
		"paragraph",
		"parent",
		"part",
		"particular",
		"party",
		"pass",
		"past",
		"path",
		"pattern",
		"pay",
		"people",
		"performance",
		"perhaps",
		"period",
		"person",
		"phrase",
		"pick",
		"picture",
		"piece",
		"pitch",
		"place",
		"plain",
		"plan",
		"plane",
		"planet",
		"plant",
		"play",
		"please",
		"plural",
		"poem",
		"point",
		"poor",
		"populate",
		"port",
		"pose",
		"position",
		"possible",
		"post",
		"pound",
		"power",
		"practice",
		"prepare",
		"present",
		"press",
		"pretty",
		"print",
		"probable",
		"problem",
		"process",
		"produce",
		"product",
		"program",
		"proof",
		"proper",
		"property",
		"protect",
		"prove",
		"provide",
		"pull",
		"push",
		"put",
		"quart",
		"queen",
		"question",
		"quick",
		"quiet",
		"quite",
		"quotient",
		"race",
		"radio",
		"rail",
		"rain",
		"raise",
		"ran",
		"range",
		"rather",
		"reach",
		"read",
		"ready",
		"real",
		"reason",
		"receive",
		"record",
		"red",
		"region",
		"remember",
		"repeat",
		"reply",
		"represent",
		"require",
		"rest",
		"result",
		"rhythm",
		"rich",
		"ride",
		"right",
		"ring",
		"rise",
		"river",
		"road",
		"rock",
		"roll",
		"room",
		"root",
		"rope",
		"rose",
		"round",
		"row",
		"rub",
		"rule",
		"run",
		"safe",
		"said",
		"sail",
		"salt",
		"same",
		"sample",
		"sand",
		"sat",
		"save",
		"saw",
		"say",
		"scale",
		"school",
		"science",
		"score",
		"sea",
		"search",
		"season",
		"seat",
		"second",
		"section",
		"see",
		"seed",
		"seem",
		"segment",
		"select",
		"self",
		"sell",
		"send",
		"sense",
		"sent",
		"sentence",
		"separate",
		"serve",
		"set",
		"settle",
		"seven",
		"several",
		"shall",
		"shape",
		"share",
		"sharp",
		"she",
		"sheet",
		"shell",
		"shine",
		"ship",
		"shoe",
		"shop",
		"shore",
		"short",
		"should",
		"shoulder",
		"shout",
		"show",
		"shy",
		"side",
		"sight",
		"sign",
		"silent",
		"silver",
		"similar",
		"simple",
		"since",
		"sing",
		"single",
		"sister",
		"sit",
		"six",
		"size",
		"skill",
		"skin",
		"sky",
		"slave",
		"sleep",
		"slip",
		"slow",
		"sly",
		"small",
		"smell",
		"smile",
		"snow",
		"soft",
		"soil",
		"soldier",
		"solution",
		"solve",
		"some",
		"son",
		"song",
		"soon",
		"soul",
		"sound",
		"south",
		"space",
		"speak",
		"special",
		"speech",
		"speed",
		"spell",
		"spend",
		"spoke",
		"spot",
		"spread",
		"spring",
		"spy",
		"square",
		"stand",
		"star",
		"start",
		"state",
		"station",
		"stay",
		"stead",
		"steam",
		"steel",
		"step",
		"stick",
		"still",
		"stone",
		"stood",
		"stop",
		"store",
		"story",
		"straight",
		"strange",
		"stream",
		"street",
		"stretch",
		"string",
		"strong",
		"student",
		"study",
		"subject",
		"substance",
		"subtract",
		"success",
		"such",
		"sudden",
		"suffix",
		"sugar",
		"suggest",
		"suit",
		"summer",
		"sun",
		"supply",
		"support",
		"sure",
		"surface",
		"surprise",
		"swim",
		"syllable",
		"symbol",
		"system",
		"table",
		"tail",
		"take",
		"talk",
		"tall",
		"teach",
		"team",
		"teeth",
		"tell",
		"temperature",
		"ten",
		"term",
		"test",
		"than",
		"thank",
		"that",
		"the",
		"their",
		"them",
		"then",
		"there",
		"these",
		"they",
		"thick",
		"thin",
		"thing",
		"think",
		"third",
		"this",
		"those",
		"though",
		"thought",
		"thousand",
		"three",
		"through",
		"throw",
		"thus",
		"tie",
		"time",
		"tiny",
		"tire",
		"together",
		"told",
		"tone",
		"too",
		"took",
		"tool",
		"top",
		"total",
		"touch",
		"toward",
		"town",
		"track",
		"trade",
		"train",
		"travel",
		"tree",
		"triangle",
		"trip",
		"trouble",
		"truck",
		"try",
		"tube",
		"turn",
		"twenty",
		"two",
		"type",
		"under",
		"unit",
		"until",
		"use",
		"usual",
		"valley",
		"value",
		"vary",
		"verb",
		"very",
		"view",
		"village",
		"visit",
		"voice",
		"vowel",
		"wait",
		"walk",
		"wall",
		"want",
		"war",
		"warm",
		"was",
		"wash",
		"watch",
		"water",
		"wave",
		"way",
		"wear",
		"weather",
		"week",
		"weekend",
		"weight",
		"well",
		"went",
		"were",
		"west",
		"what",
		"wheel",
		"when",
		"where",
		"whether",
		"which",
		"while",
		"white",
		"who",
		"whole",
		"whose",
		"why",
		"wide",
		"wife",
		"wild",
		"will",
		"win",
		"wind",
		"window",
		"wing",
		"winter",
		"wire",
		"wish",
		"with",
		"woman",
		"women",
		"wonder",
		"wood",
		"word",
		"work",
		"world",
		"would",
		"write",
		"written",
		"wrong",
		"wrote",
		"wry",
		"xerox",
		"xylophone",
		"yard",
		"year",
		"yellow",
		"yes",
		"yet",
		"you",
		"young",
		"your",
		"zebra",
		"zen",
		"zero",
		"zillion",
		"zinc",
		"zip",
		"zone",
		"zoo",
		"zookeeper",
		"zoologist"
	};  // here ends the 1D array of words

}