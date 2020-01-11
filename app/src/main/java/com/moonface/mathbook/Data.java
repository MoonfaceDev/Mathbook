package com.moonface.mathbook;

class Data {
    static Section[] sections;

    static {
        sections = new Section[]{
                new Section("אלגברה", "פעולות חשבון, משוואות, מערכות משוואות, חזקות ושורשים, משוואות ריבועיות, אי שוויונים...", R.drawable.ic_algebra, new Topic[]{
                        new Topic("סדר פעולות חשבון", R.drawable.ic_order_of_operations, new Item[]{
                                new Text("בתרגילי שרשרת, שבהם מופיעה יותר מפעולה אחת, הגדירו סדר לפעולות החשבון - פעולות מסוימות מבוצעות לפני פעולות אחרות. סדר הפעולות הוא:" +
                                        "\n \u2022 סוגריים" +
                                        "\n \u2022 חזקות ושורשים" +
                                        "\n \u2022 כפל וחילוק" +
                                        "\n \u2022 חיבור וחיסור" +
                                        "\n אם יש כמה פעולות מאותה רמה, מבצעים אותן משמאל לימין."),
                                new Text("דוגמא:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$2\\times(5+7)-6\\div3 =$$" +
                                        "\n$$2\\times12-6\\div3 =$$" +
                                        "\n$$24-2 =$$" +
                                        "\n$$22$$")
                        }),
                        new Topic("מספרים מכוונים", R.drawable.ic_negative_numbers, new Item[]{
                                new Text(" עד כה אנחנו מכירים את המספרים הטבעיים (המספרים השלמים שגדולים או שווים ל0). כעת נוסיף להם את המספרים השליליים ונגדיר קבוצה חדשה של מספרים - המספרים השלמים."),
                                new Text("ערך מוחלט").setTextStyle(Text.TextStyle.bold),
                                new Text("ערך מוחלט של מספר הוא גודל המספר ללא הסימן. מסמנים ערך מוחלט על ידי שני קווים אנכיים מצידיו של המספר."),
                                new Formula("$$|n|=n\\qquad(n>0)$$" +
                                        "\n$$|n|=-n\\qquad(n<0)$$"),
                                new Text("פעולות במספרים מכוונים").setTextStyle(Text.TextStyle.bold),
                                new Text("חיבור:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$(a<0,\\space b<0)$$" +
                                        "\n$$a+b=-(|a|+|b|)$$"),
                                new Formula("$$(a<0,\\space b>0)$$" +
                                        "\n$$a+b=-(|a|-|b|)$$"),
                                new Formula("$$(a>0,\\space b<0)$$" +
                                        "\n$$a+b=|a|-|b|$$"),
                                new Text("חיסור:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$(a<0,\\space b<0)$$" +
                                        "\n$$a-b=a+|b|$$"),
                                new Formula("$$(a<0,\\space b>0)$$" +
                                        "\n$$a-b=-(|a|+b)$$"),
                                new Formula("$$(a>0,\\space b<0)$$" +
                                        "\n$$a-b=a+|b|$$"),
                                new Text("כפל:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$(a<0,\\space b<0)$$" +
                                        "\n$$a \\times b=|a| \\times |b|$$"),
                                new Formula("$$(a<0,\\space b>0)$$" +
                                        "\n$$a \\times b=-(|a| \\times b)$$"),
                                new Formula("$$(a>0,\\space b<0)$$" +
                                        "\n$$a \\times b=-(a \\times |b|)$$"),
                                new Text("חילוק:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$(a<0,\\space b<0)$$" +
                                        "\n$$a \\div b=|a| \\div |b|$$"),
                                new Formula("$$(a<0,\\space b>0)$$" +
                                        "\n$$a \\div b=-(|a| \\div b)$$"),
                                new Formula("$$(a>0,\\space b<0)$$" +
                                        "\n$$a \\div b=-(a \\div |b|)$$"),
                                new Text("דוגמאות:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$-5+(-6) = -11$$"),
                                new Formula("$$7+(-3) = 4$$"),
                                new Formula("$$-7+3 = -4$$"),
                                new Formula("$$-4-(-9) = 5$$"),
                                new Formula("$$1-(-2) = 3$$"),
                                new Formula("$$-1-2 = -3$$"),
                                new Formula("$$-6\\times(-3) = 18$$"),
                                new Formula("$$-6\\div(-3) = 2$$"),
                                new Formula("$$-4\\times 2 = -8$$"),
                                new Formula("$$-4\\div 2 = -2$$")
                        }),
                        new Topic("שברים", R.drawable.ic_fraction, new Item[]{
                                new Text("שבר הוא דרך לייצוג של מנה. לשבר יש שני חלקים: מונה (המחולק, למעלה) ומכנה (המחלק, למטה). בין המונה והמכנה נמצא קו השבר."),
                                new Text("חיבור וחיסור שברים:").setTextStyle(Text.TextStyle.bold),
                                new Formula("$$\\frac{a}{c}\\pm\\frac{b}{c}=\\frac{a\\pm b}{c}$$"),
                                new Formula("$$\\frac{a}{b}\\pm\\frac{c}{d}=\\frac{a\\times d}{b\\times d}\\pm\\frac{c\\times b}{b\\times d}=\\frac{a\\times d\\pm c\\times b}{b\\times d}$$"),
                                new Text("כפל שברים:").setTextStyle(Text.TextStyle.bold),
                                new Formula("$$\\frac{a}{b}\\times\\frac{c}{d}=\\frac{a \\times c}{b \\times d}$$"),
                                new Text("חילוק שברים:").setTextStyle(Text.TextStyle.bold),
                                new Formula("$$\\frac{a}{b}\\div\\frac{c}{d}=\\frac{a}{b}\\times\\frac{d}{c}=\\frac{a\\times d}{b \\times c}$$"),
                                new Text("צמצום:").setTextStyle(Text.TextStyle.bold),
                                new Text("אם המונה והמכנה הם מכפלה (או שניתן להביא אותם למכפלה), ומופיע בהם גורם משותף, ניתן לחלק בו:"),
                                new Formula("$$\\frac{a\\times b}{b\\times c}=\\frac{a}{c}$$"),
                                new Text("דוגמאות:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$\\frac{3}{4}-\\frac{2}{4}=\\frac{1}{4}$$"),
                                new Formula("$$\\frac{1}{2}+\\frac{1}{3}=\\frac{3}{6}+\\frac{2}{6}=\\frac{5}{6}$$"),
                                new Formula("$$\\frac{2}{3}\\times \\frac{5}{2}=\\frac{10}{6}=\\frac{5}{3}=1\\frac{2}{3}$$"),
                                new Formula("$$\\frac{5}{7}\\div\\frac{1}{2}=\\frac{5}{7}\\times\\frac{2}{1}=\\frac{10}{7}=1\\frac{3}{7}$$"),
                                new Formula("$$\\frac{6}{3}=\\frac{2}{1}=2$$")
                        }),
                        new Topic("פתיחת סוגריים", R.drawable.ic_parenthesis_opening, new Item[]{
                                new Text("ראינו כבר שעל פי סדר פעולות חשבון, מחשבים בראש ובראשונה ביטוי הכתוב בתוך סוגריים. אך לפעמים, אם הביטוי כולל נעלם, אנחנו לא יכולים לחשב אותו בלי להיפטר מהסוגריים. ישנם כמה מקרים בהם נרצה להיפטר מהסוגריים, ההבדל ביניהם הוא מה בא לפני הסוגריים:"),
                                new Text("חיבור:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$...+(a+b+c)=...+a+b+c$$"),
                                new Text("חיסור:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$...-(a+b+c)=...-a-b-c$$"),
                                new Text("מכפלה בגורם:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$...n(a+b+c)=na+nb+nc$$"),
                                new Text("חלוקה בגורם:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$\\frac{na+nb}{n}=a+b$$"),
                                new Text("מכפלת סוגריים").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$(a+b)(c+d)=ac+ad+bc+bd$$"),
                                new Text("דוגמאות:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$x+(2x-5)=3x-5$$"),
                                new Formula("$$3-(4x-9)+2x=$$" +
                                        "\n$$3-4x+9+2x=$$" +
                                        "$$12-2x$$"),
                                new Formula("$$6(x-2)+8=6x-12+8=6x-4$$"),
                                new Formula("$$\\frac{8x-4}{4}=2x-1$$"),
                                new Formula("$$(x+4)(3x-7)=$$" +
                                        "\n$$3x^2-7x+12x-28=$$" +
                                        "\n$$3x^2+5x-28$$")
                        }),
                        new Topic("משוואות עם נעלם אחד", R.drawable.ic_equation, new Item[]{
                                new Text("לכל משוואה יש שני אגפים - אגף ימין ואגף שמאל כאשר ביניהם יש שוויון (=). המטרה שלנו תהיה למצוא את ערכו של המשתנה, הנעלם (לרוב נקרא x). ניתן לבצע פעולות חשבון על האגפים כל עוד הן מתבצעות על שני האגפים, והשוויון נשמר. נשתמש בפעולות אלו כדי לפתור משוואות."),
                                new Text("דוגמאות:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$3x=6$$" +
                                        "\n$$x=2$$"),
                                new Divider(),
                                new Formula("$$x-8=2$$" +
                                        "\n$$x=10$$"),
                                new Divider(),
                                new Formula("$$5x+12=7$$" +
                                        "\n$$5x=-5$$" +
                                        "\n$$x=-1$$"),
                                new Divider(),
                                new Formula("$$\\frac{x+4}{2}+3x=6-2x$$" +
                                        "\n$$2(\\frac{x+4}{2}+3x)=2(6-2x)$$" +
                                        "\n$$x+4+6x=12-4x$$" +
                                        "\n$$11x=8$$" +
                                        "\n$$x=\\frac{8}{11}$$")
                        }),
                        new Topic("פרופורציות", R.drawable.ic_proportion, new Item[]{
                                new Text("פרופורציה מוגדרת כשוויון בין שני יחסים (מנות). יש מספר תכונות שנכונות לכל פרופורציה."),
                                new Text("אם:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$\\frac{a}{b}=\\frac{c}{d}$$"),
                                new Text("אז:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$ad=bc$$"),
                                new Formula("$$\\frac{b}{a}=\\frac{d}{c}$$"),
                                new Formula("$$\\frac{a}{c}=\\frac{b}{d}$$"),
                                new Formula("$$\\frac{a+b}{b}=\\frac{c+d}{d}$$"),
                                new Formula("$$\\frac{a-b}{b}=\\frac{c-d}{d}$$")
                        }),
                        new Topic("מערכת משוואות עם שני נעלמים", R.drawable.ic_equation_system, new Item[]{
                                new Text("מערכת משוואות עם שני נעלמים כוללת שתי משוואות שמקשרות בין שני נעלמים (לרוב x,y), כך שניתן למצוא נקודה (ערכי x וy) או קבוצת נקודות שעבורן המשוואות מתקיימות. ניתן לפתור מערכת משוואות על ידי בידוד אחד מהנעלמים באחת המשוואות והצבתו במשוואה השנייה. במצב כזה תתקבל משוואה עם נעלם אחד, שניתן לפתור ולחלץ ממנה את ערך הנעלם. את הערך שהתקבל ניתן להציב במשוואה השנייה ולחלץ את ערכו של הנעלם השני."),
                                new Text("דוגמא:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$\\begin{cases}" +
                                        "x+y=4\\\\" +
                                        "x-y=10" +
                                        "\\end{cases}$$\n" +
                                        "$$\\begin{cases}" +
                                        "y=4-x\\\\" +
                                        "x-y=10" +
                                        "\\end{cases}$$\n" +
                                        "$$x-(4-x)=10$$" +
                                        "\n$$x-4+x=10$$" +
                                        "\n$$2x=14$$" +
                                        "\n$$x=7$$" +
                                        "\n$$y=4-7$$" +
                                        "\n$$y=-3$$" +
                                        "\n$$(7,-3)$$"
                                )
                        }),
                        new Topic("חוקי חזקות", R.drawable.ic_power_rules, new Item[]{
                                new Text("אם n,m טבעיים, מתקיים:"),
                                new Formula("$$a^n \\times a^m=a^{n+m}$$"),
                                new Formula("$$\\frac{a^n}{a^m}=a^{n-m}$$"),
                                new Formula("$$(a^n)^m=a^{n \\times m}$$"),
                                new Formula("$$(a \\times b)^n=a^n \\times b^n$$"),
                                new Formula("$$(\\frac{a}{b})^n=\\frac{a^n}{b^n}$$"),
                                new Formula("$$a^{-n}=\\frac{1}{a^n}$$"),
                                new Formula("$$a^{\\frac{n}{m}}=\\sqrt[m]{a^n}$$"),
                                new Text("הערה:").setTextStyle(Text.TextStyle.underline),
                                new Text("מכיוון שראינו שגם שורשים הם חזקות, כל חוקי החזקות נכונים גם לגבי שורשים.")
                        }),
                        new Topic("הוצאת גורם משותף", R.drawable.ic_shared_factor, new Item[]{
                                new Text("אם נרצה להפוך ביטוי של חיבור וחיסור למכפלה, הוצאת גורם משותף יכולה לעזור בכך. ניתן להתייחס אל פעולה זו כפעולה הפוכה לפתיחת סוגריים."),
                                new Formula("$$ab+ac=a(b+c)$$"),
                                new Text("פירוק לפי קבוצות").setTextStyle(Text.TextStyle.underline),
                                new Text("אם אין גורם משותף לכל האיברים אך לקבוצות שלהם, עדיין ניתן להפוך אותם למכפלה."),
                                new Formula("$$ax+ay+bx+by=$$" +
                                        "\n$$a(x+y)+b(x+y)=$$" +
                                        "\n$$(a+b)(x+y)$$")
                        }),
                        new Topic("נוסחאות כפל מקוצר", R.drawable.ic_short_product_formulas, new Item[]{
                                new Text("על ידי פתיחת סוגריים, ניתן להגיע ל4 הנוסחאות הבאות:"),
                                new Formula("$$a^2-b^2=(a-b)(a+b)$$"),
                                new Formula("$$a^3 \\pm b^3=(a \\pm b)(a^2 \\mp ab+b^2)$$"),
                                new Formula("$$(a \\pm b)^2=a^2 \\pm 2ab + b^2$$"),
                                new Formula("$$(a \\pm b)^3=a^3 \\pm 3a^2b+3ab^2 \\pm b^3$$")
                        }),
                        new Topic("טרינום", R.drawable.ic_trinom, new Item[]{
                                new Text("טרינום הוא פולינום מהצורה:"),
                                new Formula("$$ax^2+bx+c$$"),
                                new Text("כדי להפוך את פולינום זה למכפלה, נבצע את השלבים הבאים:" +
                                        "\n \u2022 נרשום את כל המספרים השלמים שמכפלתם שווה לac." +
                                        "\n \u2022 מתוך הרשימה נבחר את שני המספרים n וm שסכומם שווה לb." +
                                        "\n \u2022 עכשיו, נוכל לכתוב את הטרינום כך:"),
                                new Formula("$$ax^2+nx+mx+c$$"),
                                new Text("\n \u2022 במצב אליו הגענו יהיה ניתן לבצע פירוק לפי קבוצות ולהגיע למכפלה ששווה לביטוי ההתחלתי."),
                                new Text("דוגמא:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$2x^2+13x+15$$" +
                                        "\n$$a=2,\\space b=13,\\space c=15$$" +
                                        "\n$$30$$" +
                                        "\n$$\\begin{array}{cc}" +
                                        "1 & 30 \\\\" +
                                        "2 & 15 \\\\" +
                                        "\\bold{3} & \\bold{10} \\\\" +
                                        "5 & 6" +
                                        "\\end{array}$$" +
                                        "\n$$2x^2+10x+3x+15=$$" +
                                        "\n$$2x(x+5)+3(x+5)=$$" +
                                        "\n$$(2x+3)(x+5)$$"),
                                new Text("הערה:").setTextStyle(Text.TextStyle.underline),
                                new Text("אם a=1, והמספרים שהתקבלו בטרינום הם n וm. הפירוק יהיה:"),
                                new Formula("$$(x+n)(x+m)$$")
                        }),
                        new Topic("משוואה ריבועית", R.drawable.ic_quadratic_equation, new Item[]{
                                new Text("משוואה ריבועית היא משוואה מהצורה:"),
                                new Formula("$$ax^2+bx+c=0,\\space a \\neq 0$$"),
                                new Text("לרוב נפתור משוואה ריבועית על ידי שימוש בנוסחת השורשים:"),
                                new Formula("$$x=\\frac{-b \\pm \\sqrt{b^2-4ac}}{2a}$$"),
                                new Text("ניתן גם לפתור משוואה ריבועית על ידי פירוק (לפי נוסחת הכפל המקוצר של דו איבר בריבוע או טרינום), כך שמתקבלת מכפלת סוגריים וניתן לדעת מתי המשוואה מתאפסת."),
                                new Text("דוגמא:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$x^2+6x-16=0$$" +
                                        "\n$$a=1,\\space b=6,\\space c=-16$$"),
                                new Text("על ידי נוסחת השורשים:"),
                                new Formula("$$x=\\frac{-6\\pm \\sqrt{6^2-4\\times 1 \\times (-16)}}{2\\times 1}$$" +
                                        "\n$$x=\\frac{-6\\pm \\sqrt{36+64}}{2}$$" +
                                        "\n$$x=\\frac{-6\\pm \\sqrt{100}}{2}$$" +
                                        "\n$$x=\\frac{-6\\pm 10}{2}$$" +
                                        "\n$$x_1=\\frac{-6+10}{2}=\\frac{4}{2}=2$$" +
                                        "\n$$x_2=\\frac{-6-10}{2}=\\frac{-16}{2}=-8$$"),
                                new Text("על ידי טרינום:"),
                                new Formula("$$-16$$" +
                                        "\n$$\\begin{array}{cc}" +
                                        "-1 & 16 \\\\" +
                                        "\\bold{-2} & \\bold{8} \\\\" +
                                        "-4 & 4" +
                                        "\\end{array}$$" +
                                        "\n$$(x-2)(x+8)=0$$" +
                                        "\n$$x_1=2$$" +
                                        "\n$$x_2=-8$$")
                        }),
                        new Topic("משוואה עם פרמטרים", R.drawable.ic_parametric_equation, new Item[]{
                                new Text("משוואה עם פרמטרים היא משוואה בה בנוסף למשתנה (הנעלם שאנו רוצים למצוא), נמצא פרמטר. פתרון של משוואה עם פרמטר הוא לא בהכרח מספר, אלא ביטוי המכיל את הפרמטר. כדי לפתור משוואה כזו, יש לבודד את המשתנה (לרוב x)."),
                                new Text("דוגמאות:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$2ax-16a=4x$$" +
                                        "\n$$2ax-4x=16a$$" +
                                        "\n$$x(2a-4)=16a$$" +
                                        "\n$$x=\\frac{16a}{2a-4}$$" +
                                        "\n$$x=\\frac{8a}{a-2},\\space a \\neq 2$$"),
                                new Divider(),
                                new Formula("$$6x^2-12ax+3x-6a=0$$" +
                                        "\n$$6x^2+(3-12a)x-6a=0$$" +
                                        "\n$$x=\\frac{-(3-12a)\\pm \\sqrt{(3-12a)^2+144a}}{12}$$" +
                                        "\n$$x=\\frac{12a-3\\pm \\sqrt{9-72a+144a^2+144a}}{12}$$" +
                                        "\n$$x=\\frac{12a-3\\pm \\sqrt{144a^2+72a+9}}{12}$$" +
                                        "\n$$x=\\frac{12a-3\\pm \\sqrt{(12a+3)^2}}{12}$$" +
                                        "\n$$x=\\frac{12a-3\\pm (12a+3)}{12}$$" +
                                        "\n$$x_1=\\frac{12a-3+12a+3}{12}=\\frac{24a}{12}=2a$$" +
                                        "\n$$x_2=\\frac{12a-3-12a-3}{12}=-\\frac{6}{12}=-\\frac{1}{2}$$")
                        }),
                        new Topic("אי שוויונים", R.drawable.ic_inequation, new Item[]{
                                new Text("אי שוויון ממעלה ראשונה").setTextStyle(Text.TextStyle.bold),
                                new Text("אי שוויון ממעלה ראשונה ייפתר כמו משוואה ממעלה ראשונה, למעט העובדה שאם מכפילים או מחלקים את אי השוויון במספר שלילי, הסימן מתהפך (גדול הופך לקטן וקטן לגדול)."),
                                new Text("דוגמא:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$10-6x>-2$$" +
                                        "\n$$-6x>-12$$" +
                                        "\n$$x<2$$"),
                                new Text("מערכת וגם").setTextStyle(Text.TextStyle.bold),
                                new Text("מערכת וגם היא מערכת עם שני אי שוויונים. התשובה היא התחום בו שניהם מתקיימים. כדי לפתור מערכת וגם, קודם פותרים את שני אי השוויונים, ואז משרטטים אותם על ציר המספרים ומוצאים תחום חיתוך."),
                                new Text("דוגמא:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$x+4<6  \\quad \\text{and} \\quad x-3>-5$$" +
                                        "\n$$x<2 \\quad \\text{and} \\quad x>-2$$"),
                                new Image(R.drawable.inequalities_img3, Item.MATCH_PARENT, 300),
                                new Text("תשובה:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$-2 < x < 2$$"),
                                new Text("מערכת או").setTextStyle(Text.TextStyle.bold),
                                new Text("מערכת או היא מערכת עם שני אי שוויונים. התשובה היא התחום בו לפחות אחד מהם מתקיים. כדי לפתור מערכת או, קודם פותרים את שני אי השוויונים, ואז משרטטים אותם על ציר המספרים ומוצאים תחום איחוד."),
                                new Text("דוגמא:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$x+4<6 \\quad \\text{or} \\quad x-3>-5$$" +
                                        "\n$$x<2 \\quad \\text{or} \\quad x>-2$$"),
                                new Image(R.drawable.inequalities_img4, Item.MATCH_PARENT, 300),
                                new Text("תשובה:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$x \\in \\mathbb{R}$$"),
                                new Text("אי שוויון ממעלה שנייה").setTextStyle(Text.TextStyle.bold),
                                new Text("אי שוויון ממעלה שנייה נפתור בשלבים הבאים:" +
                                        "\n\u2022 מעבירים הכל לאגף אחד כך שבאגף השני נשאר אפס." +
                                        "\n\u2022 מוצאים ערכים שעבורם הביטוי שווה לאפס (משוואה ריבועית)." +
                                        "\n\u2022 משרטטים סקיצה של הפרבולה. חשוב שהפרבולה תהיה ישרה או הפוכה בהתאם למשוואה ונקודות החיתוך שלה עם ציר x (שנמצאו בשלב הקודם)." +
                                        "\n\u2022 עונים על השאלה על פי הגרף."),
                                new Text("דוגמא:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$x^2-5x+2<-4$$" +
                                        "\n$$x^2-5x+6<0$$"),
                                new Divider(),
                                new Formula("$$x^2-5x+6=0$$" +
                                        "\n$$x=\\frac{5 \\pm \\sqrt{25-24}}{2}$$" +
                                        "\n$$x=\\frac{5 \\pm 1}{2}$$" +
                                        "\n$$x_1=2$$" +
                                        "\n$$x_2=3$$"),
                                new Image(R.drawable.inequalities_img1, Item.MATCH_PARENT, 400),
                                new Text("תשובה:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$2 < x < 3$$"),
                                new Text("אי שוויון ממעלה שלישית או יותר").setTextStyle(Text.TextStyle.bold),
                                new Text("אי שוויון ממעלה שלישית או יותר נפתור בשלבים הבאים:" +
                                        "\n\u2022 מעבירים הכל לאגף אחד כך שבאגף השני נשאר אפס (לרוב התרגיל יהיה מכפלת סוגריים ששוה לאפס ולכן אין צורך בשלב זה)." +
                                        "\n\u2022 מוצאים ערכים עבורם הביטוי שווה לאפס." +
                                        "\n\u2022 מסמנים את הערכים שהתקבלו על ציר המספרים." +
                                        "\n\u2022 בוחרים מספר בכל אחד מהתחומים (בין נקודות בהן הביטוי מתאפס ובקצוות) ומציבים באי שוויון המפושט (אחרי השלב הראשון). אם התוצאה חיובית, מסמנים + מעל התחום. אם התוצאה שלילית, מסמנים - מתחת לתחום." +
                                        "\n\u2022 עונים על השאלה בהתאם לסימן שבתרגיל. אם הביטוי גדול מ0, רושמים את התחומים שמעליהם מופיע +. אם הביטוי קטן מ0, רושמים את התחומים שמתחתיהם רשום -."),
                                new Text("דוגמא:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$(x-1)(x+4)(3x-9) \\ge 0$$" +
                                        "\n$$(x-1)(x+4)(x-3) \\ge 0$$"),
                                new Divider(),
                                new Formula("$$(x-1)(x+4)(x-3)=0$$" +
                                        "\n$$x_1=1$$" +
                                        "\n$$x_2=-4$$" +
                                        "\n$$x_3=3$$"),
                                new Image(R.drawable.inequalities_img2, Item.MATCH_PARENT, 400),
                                new Text("תשובה:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$-4 \\le x \\le 1 \\quad \\text{or} \\quad x \\ge 3$$"),
                                new Text("אי שוויון עם נעלם במכנה").setTextStyle(Text.TextStyle.bold),
                                new Text("אי שוויון עם נעלם במכנה נפתור בשלבים הבאים:" +
                                        "\n\u2022 מעבירים הכל לאגף אחד כך שהביטוי יכלול שבר אחד ובאגף השני יישאר אפס (אסור להכפיל במכנה כי אם הוא שלילי יש להפוך סימן)." +
                                        "\n\u2022 מוצאים את הערכים עבורם המונה או המכנה מתאפסים." +
                                        "\n\u2022 מסמנים את הערכים שהתקבלו על ציר המספרים." +
                                        "\n\u2022 בוחרים מספר בכל אחד מהתחומים (בין נקודות בהן הביטוי מתאפס ובקצוות) ומציבים באי שוויון המפושט (אחרי השלב הראשון). אם התוצאה חיובית, מסמנים + מעל התחום. אם התוצאה שלילית, מסמנים - מתחת לתחום." +
                                        "\n\u2022 עונים על השאלה בהתאם לסימן שבתרגיל. אם הביטוי גדול מ0, רושמים את התחומים שמעליהם מופיע +. אם הביטוי קטן מ0, רושמים את התחומים שמתחתיהם רשום -."),
                                new Text("דוגמא:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$\\frac{3}{x-2}>\\frac{4}{x}$$" +
                                        "\n$$\\frac{3}{x-2}-\\frac{4}{x}>0$$" +
                                        "\n$$\\frac{3x}{x(x-2)}-\\frac{4(x-2)}{x(x-2)}>0$$" +
                                        "\n$$\\frac{3x-4(x-2)}{x(x-2)}>0$$" +
                                        "\n$$\\frac{3x-4x+8}{x(x-2)}>0$$" +
                                        "\n$$\\frac{8-x}{x(x-2)}>0$$"),
                                new Divider(),
                                new Text("מונה מתאפס:").setAlignment(Text.Alignment.center),
                                new Formula("$$x=8$$"),
                                new Text("מכנה מתאפס:").setAlignment(Text.Alignment.center),
                                new Formula("$$x=0,\\space x=2$$"),
                                new Image(R.drawable.inequalities_img5, Item.MATCH_PARENT, 400),
                                new Text("תשובה:").setTextStyle(Text.TextStyle.underline),
                                new Formula("$$x < 0 \\quad \\text{or} \\quad 2 < x < 8$$"),
                                new Text("הערות:").setTextStyle(Text.TextStyle.bold),
                                new Text("* כשפותרים אי שוויון ממעלה שלישית או יותר או אי שוויון עם נעלם במכנה, ניתן לבדוק מה הסימן רק באחד התחומים כי הסימן יתחלף בכל תחום, למעט מקרים בהם יש פתרון שחוזר על עצמו (דו איבר בריבוע או פתרון משותף במונה ובמכנה). במקרים אלו משני צידי הנקודה יהיה אותו הסימן." +
                                        "\n* אם באי השוויון הסימן הוא גדול שווה או קטן שווה, התשובה תכלול גם את הנקודות שבקצה התחום אם הן נמצאות בתחום ההגדרה.")
                        })
                }),
                new Section("גיאומטריה במישור", "משולשים, מרובעים, מעגלים, שטחים והיקפים, יחסים ופרופורציות...", R.drawable.ic_geometry, new Topic[]{
                        new Topic("חפיפת משולשים", R.drawable.ic_congruent_triangles, new Item[]{
                            new Text("e")
                        }),
                        new Topic("קטעים מיוחדים במשולש", R.drawable.ic_special_segments, new Item[]{

                        }),
                        new Topic("משולש שווה שוקיים", R.drawable.ic_isosceles_triangle, new Item[]{

                        }),
                        new Topic("משולש שווה צלעות", R.drawable.ic_equilateral_triangle, new Item[]{

                        }),
                        new Topic("משולש ישר זווית", R.drawable.ic_right_triangle, new Item[]{

                        }),
                        new Topic("סכום זוויות במצולע", R.drawable.ic_sum_of_angles, new Item[]{

                        }),
                        new Topic("קטע אמצעים במשולש", R.drawable.ic_midsegment, new Item[]{

                        }),
                        new Topic("מפגש תיכונים במשולש", R.drawable.ic_triangle_centroid, new Item[]{

                        }),
                        new Topic("משפט תאלס", R.drawable.ic_thales_theorem, new Item[]{

                        }),
                        new Topic("דמיון משולשים", R.drawable.ic_similar_triangles, new Item[]{

                        }),
                        new Topic("משפט חוצה זווית", R.drawable.ic_angle_bisector_theorem, new Item[]{

                        }),
                        new Topic("משפחת המקביליות", R.drawable.ic_parallelograms_family, new Item[]{

                        }),
                        new Topic("טרפז", R.drawable.ic_trapazoid, new Item[]{

                        }),
                        new Topic("המעגל", R.drawable.ic_circle, new Item[]{

                        }),
                        new Topic("זוויות במעגל", R.drawable.ic_circle_angles, new Item[]{

                        }),
                        new Topic("משיק למעגל", R.drawable.ic_circle_tangent, new Item[]{

                        }),
                        new Topic("מעגל חוסם וחסום", R.drawable.ic_circumscribed_and_inscribed_circle, new Item[]{

                        }),
                        new Topic("פרופורציות במעגל", R.drawable.ic_circle_proportions, new Item[]{

                        }),
                        new Topic("שטחים והיקפים", R.drawable.ic_areas_and_perimeters, new Item[]{

                        })
                }),
                new Section("פונקציות", "פונקציה קווית, שיפוע, משוואת פונקציה, גרפים, פרבולות...", R.drawable.ic_functions, new Topic[]{

                }),
                new Section("חשבון דיפרנציאלי ואינטגרלי", "נגזרות,  חקירת פונקציות, פולינומים, פונקציות רציונליות, אינטגרלים...", R.drawable.ic_calculus, new Topic[]{

                }),
                new Section("טריגונומטריה במישור", "משולש ישר זווית, משפט הסינוסים, משפט הקוסינוסים, מעגל היחידה, משוואות טריגונומטריות...", R.drawable.ic_trigonometry, new Topic[]{

                }),
                new Section("סדרות", "סדרה חשבונית, סדרה הנדסית, איבר כללי, סכום, נוסחת נסיגה...", R.drawable.ic_sequences, new Topic[]{

                }),
                new Section("הסתברות", "חוקי ההסתברות, מאורעות תלויים, מאורעות בלתי תלויים, הסתברות מותנית...", R.drawable.ic_probability, new Topic[]{

                }),
                new Section("וקטורים", "פעולות על וקטורים, וקטורים במרחב...", R.drawable.ic_vectors, new Topic[]{

                }),
                new Section("מספרים מרוכבים", "פעולות חשבון במספרים מרוכבים, ייצוג טריגונומטרי, משמעויות גיאומטריות...", R.drawable.ic_complex_numbers, new Topic[]{

                }),
                new Section("גיאומטריה אנליטית", "מעגלים, פרבולות, אליפסות...", R.drawable.ic_analytic_geometry)
        };

    }
}
