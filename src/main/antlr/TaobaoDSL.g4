grammar TaobaoDSL;

program: (dialogueScenario | productCatalog)* EOF;

// ========== 商品目录 ==========
productCatalog:
    'catalog' ID '{' productDefinition+ '}';

productDefinition:
    'product' ID '{' attribute+ '}';

attribute:
    'type' '=' productType ';'
    | 'season' '=' seasonType ';'
    | 'price' '=' INT ';'
    | 'stock' '=' INT ';'
    | 'description' '=' STRING ';';

productType: 'MENS' | 'WOMENS' | 'KIDS' | 'UNISEX';
seasonType: 'WINTER' | 'SUMMER' | 'ALL_SEASON';

// ========== 对话场景 ==========
dialogueScenario:
    'scenario' ID '{' statement* intentRule* '}';

// 语句定义
statement:
    varDeclaration
    | assignment
    | printStatement
    | waitStatement
    | recommendStatement
    | checkStockStatement
    | showCatalogStatement;

// 变量声明和赋值
varDeclaration: type ID ('=' expression)? ';';
type: 'string' | 'int' | 'bool';
assignment: ID '=' expression ';';

// 基本语句
printStatement: 'print' '(' expression ')' ';';
waitStatement: 'wait' '(' STRING ')' ';';

// 商品相关语句
recommendStatement:
    'recommend' '('
    ( recommendOption (',' recommendOption)* )?
    ')' ';';

recommendOption:
    'for' STRING          # recommendFor
    | 'season' seasonType  # recommendSeason
    | 'maxPrice' INT       # recommendMaxPrice;

checkStockStatement:
    'checkStock' '(' ID (',' INT)? ')' ';';

showCatalogStatement:
    'showCatalog' '(' ('filter' '=' (productType | seasonType))? ')' ';';

// 意图规则
intentRule:
    'on' 'intent' '(' STRING ')' '{' statement* '}';

// ========== 表达式 ==========
expression:
    additiveExpression;

additiveExpression:
    multiplicativeExpression
    ( ( '+' | '-' ) multiplicativeExpression )*;

multiplicativeExpression:
    primaryExpression
    ( ( '*' | '/' ) primaryExpression )*;

primaryExpression:
    '(' expression ')'                            # parenExpr
    | ID                                          # idExpr
    | literal                                     # literalExpr
    | 'getPrice' '(' ID ')'                       # getPriceExpr
    | 'getStock' '(' ID ')'                       # getStockExpr;

literal:
    INT       # intLiteral
    | STRING  # stringLiteral
    | BOOL    # boolLiteral;

// ========== 词法规则 ==========
INT: [0-9]+;
STRING: '"' .*? '"';
BOOL: 'true' | 'false';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;