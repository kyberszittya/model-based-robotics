package hu.sze.aut.robotlabor.scene.description.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.sze.aut.robotlabor.scene.description.services.SceneDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSceneDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'scene'", "'{'", "'models'", "'}'", "'externalmodel'", "'path'", "'placement'", "'sphere'", "'radius'", "'physicparameters'", "'material'", "'box'", "'width'", "'height'", "'depth'", "'cylinder'", "'floor'", "'wall'", "'position'", "'rotation'", "'x'", "'y'", "'z'", "'roll'", "'pitch'", "'yaw'", "'-'", "'.'", "'E'", "'e'", "'mass'", "'color'", "'red'", "'green'", "'blue'", "'alpha'", "'texture'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSceneDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSceneDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSceneDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSceneDsl.g"; }



     	private SceneDslGrammarAccess grammarAccess;

        public InternalSceneDslParser(TokenStream input, SceneDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RootElement";
       	}

       	@Override
       	protected SceneDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRootElement"
    // InternalSceneDsl.g:64:1: entryRuleRootElement returns [EObject current=null] : iv_ruleRootElement= ruleRootElement EOF ;
    public final EObject entryRuleRootElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootElement = null;


        try {
            // InternalSceneDsl.g:64:52: (iv_ruleRootElement= ruleRootElement EOF )
            // InternalSceneDsl.g:65:2: iv_ruleRootElement= ruleRootElement EOF
            {
             newCompositeNode(grammarAccess.getRootElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRootElement=ruleRootElement();

            state._fsp--;

             current =iv_ruleRootElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRootElement"


    // $ANTLR start "ruleRootElement"
    // InternalSceneDsl.g:71:1: ruleRootElement returns [EObject current=null] : (this_Scene_0= ruleScene | this_Model_1= ruleModel ) ;
    public final EObject ruleRootElement() throws RecognitionException {
        EObject current = null;

        EObject this_Scene_0 = null;

        EObject this_Model_1 = null;



        	enterRule();

        try {
            // InternalSceneDsl.g:77:2: ( (this_Scene_0= ruleScene | this_Model_1= ruleModel ) )
            // InternalSceneDsl.g:78:2: (this_Scene_0= ruleScene | this_Model_1= ruleModel )
            {
            // InternalSceneDsl.g:78:2: (this_Scene_0= ruleScene | this_Model_1= ruleModel )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==15||LA1_0==18||LA1_0==22||(LA1_0>=26 && LA1_0<=28)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSceneDsl.g:79:3: this_Scene_0= ruleScene
                    {

                    			newCompositeNode(grammarAccess.getRootElementAccess().getSceneParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Scene_0=ruleScene();

                    state._fsp--;


                    			current = this_Scene_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSceneDsl.g:88:3: this_Model_1= ruleModel
                    {

                    			newCompositeNode(grammarAccess.getRootElementAccess().getModelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Model_1=ruleModel();

                    state._fsp--;


                    			current = this_Model_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRootElement"


    // $ANTLR start "entryRuleModel"
    // InternalSceneDsl.g:100:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSceneDsl.g:100:46: (iv_ruleModel= ruleModel EOF )
            // InternalSceneDsl.g:101:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSceneDsl.g:107:1: ruleModel returns [EObject current=null] : (this_ExternalModel_0= ruleExternalModel | this_Sphere_1= ruleSphere | this_Box_2= ruleBox | this_Cylinder_3= ruleCylinder | this_Floor_4= ruleFloor | this_WallElement_5= ruleWallElement ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalModel_0 = null;

        EObject this_Sphere_1 = null;

        EObject this_Box_2 = null;

        EObject this_Cylinder_3 = null;

        EObject this_Floor_4 = null;

        EObject this_WallElement_5 = null;



        	enterRule();

        try {
            // InternalSceneDsl.g:113:2: ( (this_ExternalModel_0= ruleExternalModel | this_Sphere_1= ruleSphere | this_Box_2= ruleBox | this_Cylinder_3= ruleCylinder | this_Floor_4= ruleFloor | this_WallElement_5= ruleWallElement ) )
            // InternalSceneDsl.g:114:2: (this_ExternalModel_0= ruleExternalModel | this_Sphere_1= ruleSphere | this_Box_2= ruleBox | this_Cylinder_3= ruleCylinder | this_Floor_4= ruleFloor | this_WallElement_5= ruleWallElement )
            {
            // InternalSceneDsl.g:114:2: (this_ExternalModel_0= ruleExternalModel | this_Sphere_1= ruleSphere | this_Box_2= ruleBox | this_Cylinder_3= ruleCylinder | this_Floor_4= ruleFloor | this_WallElement_5= ruleWallElement )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            case 26:
                {
                alt2=4;
                }
                break;
            case 27:
                {
                alt2=5;
                }
                break;
            case 28:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSceneDsl.g:115:3: this_ExternalModel_0= ruleExternalModel
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getExternalModelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalModel_0=ruleExternalModel();

                    state._fsp--;


                    			current = this_ExternalModel_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSceneDsl.g:124:3: this_Sphere_1= ruleSphere
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getSphereParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sphere_1=ruleSphere();

                    state._fsp--;


                    			current = this_Sphere_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSceneDsl.g:133:3: this_Box_2= ruleBox
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getBoxParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Box_2=ruleBox();

                    state._fsp--;


                    			current = this_Box_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSceneDsl.g:142:3: this_Cylinder_3= ruleCylinder
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getCylinderParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cylinder_3=ruleCylinder();

                    state._fsp--;


                    			current = this_Cylinder_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSceneDsl.g:151:3: this_Floor_4= ruleFloor
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getFloorParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Floor_4=ruleFloor();

                    state._fsp--;


                    			current = this_Floor_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSceneDsl.g:160:3: this_WallElement_5= ruleWallElement
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getWallElementParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_WallElement_5=ruleWallElement();

                    state._fsp--;


                    			current = this_WallElement_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMaterial"
    // InternalSceneDsl.g:172:1: entryRuleMaterial returns [EObject current=null] : iv_ruleMaterial= ruleMaterial EOF ;
    public final EObject entryRuleMaterial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterial = null;


        try {
            // InternalSceneDsl.g:172:49: (iv_ruleMaterial= ruleMaterial EOF )
            // InternalSceneDsl.g:173:2: iv_ruleMaterial= ruleMaterial EOF
            {
             newCompositeNode(grammarAccess.getMaterialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaterial=ruleMaterial();

            state._fsp--;

             current =iv_ruleMaterial; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaterial"


    // $ANTLR start "ruleMaterial"
    // InternalSceneDsl.g:179:1: ruleMaterial returns [EObject current=null] : (this_Color_0= ruleColor | this_Texture_1= ruleTexture ) ;
    public final EObject ruleMaterial() throws RecognitionException {
        EObject current = null;

        EObject this_Color_0 = null;

        EObject this_Texture_1 = null;



        	enterRule();

        try {
            // InternalSceneDsl.g:185:2: ( (this_Color_0= ruleColor | this_Texture_1= ruleTexture ) )
            // InternalSceneDsl.g:186:2: (this_Color_0= ruleColor | this_Texture_1= ruleTexture )
            {
            // InternalSceneDsl.g:186:2: (this_Color_0= ruleColor | this_Texture_1= ruleTexture )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==42) ) {
                alt3=1;
            }
            else if ( (LA3_0==47) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSceneDsl.g:187:3: this_Color_0= ruleColor
                    {

                    			newCompositeNode(grammarAccess.getMaterialAccess().getColorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Color_0=ruleColor();

                    state._fsp--;


                    			current = this_Color_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSceneDsl.g:196:3: this_Texture_1= ruleTexture
                    {

                    			newCompositeNode(grammarAccess.getMaterialAccess().getTextureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Texture_1=ruleTexture();

                    state._fsp--;


                    			current = this_Texture_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaterial"


    // $ANTLR start "entryRuleEString"
    // InternalSceneDsl.g:208:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSceneDsl.g:208:47: (iv_ruleEString= ruleEString EOF )
            // InternalSceneDsl.g:209:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSceneDsl.g:215:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSceneDsl.g:221:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSceneDsl.g:222:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSceneDsl.g:222:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSceneDsl.g:223:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSceneDsl.g:231:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleScene"
    // InternalSceneDsl.g:242:1: entryRuleScene returns [EObject current=null] : iv_ruleScene= ruleScene EOF ;
    public final EObject entryRuleScene() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScene = null;


        try {
            // InternalSceneDsl.g:242:46: (iv_ruleScene= ruleScene EOF )
            // InternalSceneDsl.g:243:2: iv_ruleScene= ruleScene EOF
            {
             newCompositeNode(grammarAccess.getSceneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScene=ruleScene();

            state._fsp--;

             current =iv_ruleScene; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScene"


    // $ANTLR start "ruleScene"
    // InternalSceneDsl.g:249:1: ruleScene returns [EObject current=null] : ( () otherlv_1= 'scene' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'models' otherlv_5= '{' ( (lv_model_6_0= ruleModel ) ) ( (lv_model_7_0= ruleModel ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleScene() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_model_6_0 = null;

        EObject lv_model_7_0 = null;



        	enterRule();

        try {
            // InternalSceneDsl.g:255:2: ( ( () otherlv_1= 'scene' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'models' otherlv_5= '{' ( (lv_model_6_0= ruleModel ) ) ( (lv_model_7_0= ruleModel ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalSceneDsl.g:256:2: ( () otherlv_1= 'scene' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'models' otherlv_5= '{' ( (lv_model_6_0= ruleModel ) ) ( (lv_model_7_0= ruleModel ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalSceneDsl.g:256:2: ( () otherlv_1= 'scene' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'models' otherlv_5= '{' ( (lv_model_6_0= ruleModel ) ) ( (lv_model_7_0= ruleModel ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalSceneDsl.g:257:3: () otherlv_1= 'scene' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'models' otherlv_5= '{' ( (lv_model_6_0= ruleModel ) ) ( (lv_model_7_0= ruleModel ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalSceneDsl.g:257:3: ()
            // InternalSceneDsl.g:258:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSceneAccess().getSceneAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSceneAccess().getSceneKeyword_1());
            		
            // InternalSceneDsl.g:268:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSceneDsl.g:269:4: (lv_name_2_0= ruleEString )
            {
            // InternalSceneDsl.g:269:4: (lv_name_2_0= ruleEString )
            // InternalSceneDsl.g:270:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSceneAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSceneRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.robotlabor.scene.description.SceneDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSceneAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSceneDsl.g:291:3: (otherlv_4= 'models' otherlv_5= '{' ( (lv_model_6_0= ruleModel ) ) ( (lv_model_7_0= ruleModel ) )* otherlv_8= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSceneDsl.g:292:4: otherlv_4= 'models' otherlv_5= '{' ( (lv_model_6_0= ruleModel ) ) ( (lv_model_7_0= ruleModel ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getSceneAccess().getModelsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getSceneAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSceneDsl.g:300:4: ( (lv_model_6_0= ruleModel ) )
                    // InternalSceneDsl.g:301:5: (lv_model_6_0= ruleModel )
                    {
                    // InternalSceneDsl.g:301:5: (lv_model_6_0= ruleModel )
                    // InternalSceneDsl.g:302:6: lv_model_6_0= ruleModel
                    {

                    						newCompositeNode(grammarAccess.getSceneAccess().getModelModelParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_model_6_0=ruleModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSceneRule());
                    						}
                    						add(
                    							current,
                    							"model",
                    							lv_model_6_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.Model");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSceneDsl.g:319:4: ( (lv_model_7_0= ruleModel ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15||LA5_0==18||LA5_0==22||(LA5_0>=26 && LA5_0<=28)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSceneDsl.g:320:5: (lv_model_7_0= ruleModel )
                    	    {
                    	    // InternalSceneDsl.g:320:5: (lv_model_7_0= ruleModel )
                    	    // InternalSceneDsl.g:321:6: lv_model_7_0= ruleModel
                    	    {

                    	    						newCompositeNode(grammarAccess.getSceneAccess().getModelModelParserRuleCall_4_3_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_model_7_0=ruleModel();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSceneRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"model",
                    	    							lv_model_7_0,
                    	    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.Model");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getSceneAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSceneAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScene"


    // $ANTLR start "entryRuleExternalModel"
    // InternalSceneDsl.g:351:1: entryRuleExternalModel returns [EObject current=null] : iv_ruleExternalModel= ruleExternalModel EOF ;
    public final EObject entryRuleExternalModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalModel = null;


        try {
            // InternalSceneDsl.g:351:54: (iv_ruleExternalModel= ruleExternalModel EOF )
            // InternalSceneDsl.g:352:2: iv_ruleExternalModel= ruleExternalModel EOF
            {
             newCompositeNode(grammarAccess.getExternalModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalModel=ruleExternalModel();

            state._fsp--;

             current =iv_ruleExternalModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalModel"


    // $ANTLR start "ruleExternalModel"
    // InternalSceneDsl.g:358:1: ruleExternalModel returns [EObject current=null] : ( () otherlv_1= 'externalmodel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'path' ( (lv_path_5_0= ruleEString ) ) )? (otherlv_6= 'placement' ( (lv_placement_7_0= rulePlacement ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleExternalModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_path_5_0 = null;

        EObject lv_placement_7_0 = null;



        	enterRule();

        try {
            // InternalSceneDsl.g:364:2: ( ( () otherlv_1= 'externalmodel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'path' ( (lv_path_5_0= ruleEString ) ) )? (otherlv_6= 'placement' ( (lv_placement_7_0= rulePlacement ) ) )? otherlv_8= '}' ) )
            // InternalSceneDsl.g:365:2: ( () otherlv_1= 'externalmodel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'path' ( (lv_path_5_0= ruleEString ) ) )? (otherlv_6= 'placement' ( (lv_placement_7_0= rulePlacement ) ) )? otherlv_8= '}' )
            {
            // InternalSceneDsl.g:365:2: ( () otherlv_1= 'externalmodel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'path' ( (lv_path_5_0= ruleEString ) ) )? (otherlv_6= 'placement' ( (lv_placement_7_0= rulePlacement ) ) )? otherlv_8= '}' )
            // InternalSceneDsl.g:366:3: () otherlv_1= 'externalmodel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'path' ( (lv_path_5_0= ruleEString ) ) )? (otherlv_6= 'placement' ( (lv_placement_7_0= rulePlacement ) ) )? otherlv_8= '}'
            {
            // InternalSceneDsl.g:366:3: ()
            // InternalSceneDsl.g:367:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalModelAccess().getExternalModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalModelAccess().getExternalmodelKeyword_1());
            		
            // InternalSceneDsl.g:377:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSceneDsl.g:378:4: (lv_name_2_0= ruleEString )
            {
            // InternalSceneDsl.g:378:4: (lv_name_2_0= ruleEString )
            // InternalSceneDsl.g:379:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.robotlabor.scene.description.SceneDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSceneDsl.g:400:3: (otherlv_4= 'path' ( (lv_path_5_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSceneDsl.g:401:4: otherlv_4= 'path' ( (lv_path_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getExternalModelAccess().getPathKeyword_4_0());
                    			
                    // InternalSceneDsl.g:405:4: ( (lv_path_5_0= ruleEString ) )
                    // InternalSceneDsl.g:406:5: (lv_path_5_0= ruleEString )
                    {
                    // InternalSceneDsl.g:406:5: (lv_path_5_0= ruleEString )
                    // InternalSceneDsl.g:407:6: lv_path_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExternalModelAccess().getPathEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_path_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalModelRule());
                    						}
                    						set(
                    							current,
                    							"path",
                    							lv_path_5_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:425:3: (otherlv_6= 'placement' ( (lv_placement_7_0= rulePlacement ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSceneDsl.g:426:4: otherlv_6= 'placement' ( (lv_placement_7_0= rulePlacement ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getExternalModelAccess().getPlacementKeyword_5_0());
                    			
                    // InternalSceneDsl.g:430:4: ( (lv_placement_7_0= rulePlacement ) )
                    // InternalSceneDsl.g:431:5: (lv_placement_7_0= rulePlacement )
                    {
                    // InternalSceneDsl.g:431:5: (lv_placement_7_0= rulePlacement )
                    // InternalSceneDsl.g:432:6: lv_placement_7_0= rulePlacement
                    {

                    						newCompositeNode(grammarAccess.getExternalModelAccess().getPlacementPlacementParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_placement_7_0=rulePlacement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalModelRule());
                    						}
                    						set(
                    							current,
                    							"placement",
                    							lv_placement_7_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.Placement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getExternalModelAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalModel"


    // $ANTLR start "entryRuleSphere"
    // InternalSceneDsl.g:458:1: entryRuleSphere returns [EObject current=null] : iv_ruleSphere= ruleSphere EOF ;
    public final EObject entryRuleSphere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphere = null;


        try {
            // InternalSceneDsl.g:458:47: (iv_ruleSphere= ruleSphere EOF )
            // InternalSceneDsl.g:459:2: iv_ruleSphere= ruleSphere EOF
            {
             newCompositeNode(grammarAccess.getSphereRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSphere=ruleSphere();

            state._fsp--;

             current =iv_ruleSphere; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSphere"


    // $ANTLR start "ruleSphere"
    // InternalSceneDsl.g:465:1: ruleSphere returns [EObject current=null] : ( () otherlv_1= 'sphere' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'radius' ( (lv_radius_5_0= ruleEDouble ) ) )? (otherlv_6= 'placement' ( (lv_placement_7_0= rulePlacement ) ) )? (otherlv_8= 'physicparameters' ( (lv_physicparameters_9_0= rulePhysicParameters ) ) )? (otherlv_10= 'material' ( (lv_material_11_0= ruleMaterial ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleSphere() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_radius_5_0 = null;

        EObject lv_placement_7_0 = null;

        EObject lv_physicparameters_9_0 = null;

        EObject lv_material_11_0 = null;



        	enterRule();

        try {
            // InternalSceneDsl.g:471:2: ( ( () otherlv_1= 'sphere' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'radius' ( (lv_radius_5_0= ruleEDouble ) ) )? (otherlv_6= 'placement' ( (lv_placement_7_0= rulePlacement ) ) )? (otherlv_8= 'physicparameters' ( (lv_physicparameters_9_0= rulePhysicParameters ) ) )? (otherlv_10= 'material' ( (lv_material_11_0= ruleMaterial ) ) )? otherlv_12= '}' ) )
            // InternalSceneDsl.g:472:2: ( () otherlv_1= 'sphere' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'radius' ( (lv_radius_5_0= ruleEDouble ) ) )? (otherlv_6= 'placement' ( (lv_placement_7_0= rulePlacement ) ) )? (otherlv_8= 'physicparameters' ( (lv_physicparameters_9_0= rulePhysicParameters ) ) )? (otherlv_10= 'material' ( (lv_material_11_0= ruleMaterial ) ) )? otherlv_12= '}' )
            {
            // InternalSceneDsl.g:472:2: ( () otherlv_1= 'sphere' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'radius' ( (lv_radius_5_0= ruleEDouble ) ) )? (otherlv_6= 'placement' ( (lv_placement_7_0= rulePlacement ) ) )? (otherlv_8= 'physicparameters' ( (lv_physicparameters_9_0= rulePhysicParameters ) ) )? (otherlv_10= 'material' ( (lv_material_11_0= ruleMaterial ) ) )? otherlv_12= '}' )
            // InternalSceneDsl.g:473:3: () otherlv_1= 'sphere' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'radius' ( (lv_radius_5_0= ruleEDouble ) ) )? (otherlv_6= 'placement' ( (lv_placement_7_0= rulePlacement ) ) )? (otherlv_8= 'physicparameters' ( (lv_physicparameters_9_0= rulePhysicParameters ) ) )? (otherlv_10= 'material' ( (lv_material_11_0= ruleMaterial ) ) )? otherlv_12= '}'
            {
            // InternalSceneDsl.g:473:3: ()
            // InternalSceneDsl.g:474:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSphereAccess().getSphereAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSphereAccess().getSphereKeyword_1());
            		
            // InternalSceneDsl.g:484:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSceneDsl.g:485:4: (lv_name_2_0= ruleEString )
            {
            // InternalSceneDsl.g:485:4: (lv_name_2_0= ruleEString )
            // InternalSceneDsl.g:486:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSphereAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSphereRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.robotlabor.scene.description.SceneDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getSphereAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSceneDsl.g:507:3: (otherlv_4= 'radius' ( (lv_radius_5_0= ruleEDouble ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSceneDsl.g:508:4: otherlv_4= 'radius' ( (lv_radius_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getSphereAccess().getRadiusKeyword_4_0());
                    			
                    // InternalSceneDsl.g:512:4: ( (lv_radius_5_0= ruleEDouble ) )
                    // InternalSceneDsl.g:513:5: (lv_radius_5_0= ruleEDouble )
                    {
                    // InternalSceneDsl.g:513:5: (lv_radius_5_0= ruleEDouble )
                    // InternalSceneDsl.g:514:6: lv_radius_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getSphereAccess().getRadiusEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_radius_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSphereRule());
                    						}
                    						set(
                    							current,
                    							"radius",
                    							lv_radius_5_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:532:3: (otherlv_6= 'placement' ( (lv_placement_7_0= rulePlacement ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSceneDsl.g:533:4: otherlv_6= 'placement' ( (lv_placement_7_0= rulePlacement ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getSphereAccess().getPlacementKeyword_5_0());
                    			
                    // InternalSceneDsl.g:537:4: ( (lv_placement_7_0= rulePlacement ) )
                    // InternalSceneDsl.g:538:5: (lv_placement_7_0= rulePlacement )
                    {
                    // InternalSceneDsl.g:538:5: (lv_placement_7_0= rulePlacement )
                    // InternalSceneDsl.g:539:6: lv_placement_7_0= rulePlacement
                    {

                    						newCompositeNode(grammarAccess.getSphereAccess().getPlacementPlacementParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_placement_7_0=rulePlacement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSphereRule());
                    						}
                    						set(
                    							current,
                    							"placement",
                    							lv_placement_7_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.Placement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:557:3: (otherlv_8= 'physicparameters' ( (lv_physicparameters_9_0= rulePhysicParameters ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSceneDsl.g:558:4: otherlv_8= 'physicparameters' ( (lv_physicparameters_9_0= rulePhysicParameters ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getSphereAccess().getPhysicparametersKeyword_6_0());
                    			
                    // InternalSceneDsl.g:562:4: ( (lv_physicparameters_9_0= rulePhysicParameters ) )
                    // InternalSceneDsl.g:563:5: (lv_physicparameters_9_0= rulePhysicParameters )
                    {
                    // InternalSceneDsl.g:563:5: (lv_physicparameters_9_0= rulePhysicParameters )
                    // InternalSceneDsl.g:564:6: lv_physicparameters_9_0= rulePhysicParameters
                    {

                    						newCompositeNode(grammarAccess.getSphereAccess().getPhysicparametersPhysicParametersParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_physicparameters_9_0=rulePhysicParameters();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSphereRule());
                    						}
                    						set(
                    							current,
                    							"physicparameters",
                    							lv_physicparameters_9_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.PhysicParameters");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:582:3: (otherlv_10= 'material' ( (lv_material_11_0= ruleMaterial ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSceneDsl.g:583:4: otherlv_10= 'material' ( (lv_material_11_0= ruleMaterial ) )
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getSphereAccess().getMaterialKeyword_7_0());
                    			
                    // InternalSceneDsl.g:587:4: ( (lv_material_11_0= ruleMaterial ) )
                    // InternalSceneDsl.g:588:5: (lv_material_11_0= ruleMaterial )
                    {
                    // InternalSceneDsl.g:588:5: (lv_material_11_0= ruleMaterial )
                    // InternalSceneDsl.g:589:6: lv_material_11_0= ruleMaterial
                    {

                    						newCompositeNode(grammarAccess.getSphereAccess().getMaterialMaterialParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_material_11_0=ruleMaterial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSphereRule());
                    						}
                    						set(
                    							current,
                    							"material",
                    							lv_material_11_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.Material");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getSphereAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSphere"


    // $ANTLR start "entryRuleBox"
    // InternalSceneDsl.g:615:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalSceneDsl.g:615:44: (iv_ruleBox= ruleBox EOF )
            // InternalSceneDsl.g:616:2: iv_ruleBox= ruleBox EOF
            {
             newCompositeNode(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBox=ruleBox();

            state._fsp--;

             current =iv_ruleBox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalSceneDsl.g:622:1: ruleBox returns [EObject current=null] : ( () otherlv_1= 'box' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'width' ( (lv_width_5_0= ruleEDouble ) ) )? (otherlv_6= 'height' ( (lv_height_7_0= ruleEDouble ) ) )? (otherlv_8= 'depth' ( (lv_depth_9_0= ruleEDouble ) ) )? (otherlv_10= 'placement' ( (lv_placement_11_0= rulePlacement ) ) )? (otherlv_12= 'physicparameters' ( (lv_physicparameters_13_0= rulePhysicParameters ) ) )? (otherlv_14= 'material' ( (lv_material_15_0= ruleMaterial ) ) )? otherlv_16= '}' ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_width_5_0 = null;

        AntlrDatatypeRuleToken lv_height_7_0 = null;

        AntlrDatatypeRuleToken lv_depth_9_0 = null;

        EObject lv_placement_11_0 = null;

        EObject lv_physicparameters_13_0 = null;

        EObject lv_material_15_0 = null;



        	enterRule();

        try {
            // InternalSceneDsl.g:628:2: ( ( () otherlv_1= 'box' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'width' ( (lv_width_5_0= ruleEDouble ) ) )? (otherlv_6= 'height' ( (lv_height_7_0= ruleEDouble ) ) )? (otherlv_8= 'depth' ( (lv_depth_9_0= ruleEDouble ) ) )? (otherlv_10= 'placement' ( (lv_placement_11_0= rulePlacement ) ) )? (otherlv_12= 'physicparameters' ( (lv_physicparameters_13_0= rulePhysicParameters ) ) )? (otherlv_14= 'material' ( (lv_material_15_0= ruleMaterial ) ) )? otherlv_16= '}' ) )
            // InternalSceneDsl.g:629:2: ( () otherlv_1= 'box' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'width' ( (lv_width_5_0= ruleEDouble ) ) )? (otherlv_6= 'height' ( (lv_height_7_0= ruleEDouble ) ) )? (otherlv_8= 'depth' ( (lv_depth_9_0= ruleEDouble ) ) )? (otherlv_10= 'placement' ( (lv_placement_11_0= rulePlacement ) ) )? (otherlv_12= 'physicparameters' ( (lv_physicparameters_13_0= rulePhysicParameters ) ) )? (otherlv_14= 'material' ( (lv_material_15_0= ruleMaterial ) ) )? otherlv_16= '}' )
            {
            // InternalSceneDsl.g:629:2: ( () otherlv_1= 'box' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'width' ( (lv_width_5_0= ruleEDouble ) ) )? (otherlv_6= 'height' ( (lv_height_7_0= ruleEDouble ) ) )? (otherlv_8= 'depth' ( (lv_depth_9_0= ruleEDouble ) ) )? (otherlv_10= 'placement' ( (lv_placement_11_0= rulePlacement ) ) )? (otherlv_12= 'physicparameters' ( (lv_physicparameters_13_0= rulePhysicParameters ) ) )? (otherlv_14= 'material' ( (lv_material_15_0= ruleMaterial ) ) )? otherlv_16= '}' )
            // InternalSceneDsl.g:630:3: () otherlv_1= 'box' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'width' ( (lv_width_5_0= ruleEDouble ) ) )? (otherlv_6= 'height' ( (lv_height_7_0= ruleEDouble ) ) )? (otherlv_8= 'depth' ( (lv_depth_9_0= ruleEDouble ) ) )? (otherlv_10= 'placement' ( (lv_placement_11_0= rulePlacement ) ) )? (otherlv_12= 'physicparameters' ( (lv_physicparameters_13_0= rulePhysicParameters ) ) )? (otherlv_14= 'material' ( (lv_material_15_0= ruleMaterial ) ) )? otherlv_16= '}'
            {
            // InternalSceneDsl.g:630:3: ()
            // InternalSceneDsl.g:631:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoxAccess().getBoxAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBoxAccess().getBoxKeyword_1());
            		
            // InternalSceneDsl.g:641:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSceneDsl.g:642:4: (lv_name_2_0= ruleEString )
            {
            // InternalSceneDsl.g:642:4: (lv_name_2_0= ruleEString )
            // InternalSceneDsl.g:643:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBoxAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoxRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.robotlabor.scene.description.SceneDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSceneDsl.g:664:3: (otherlv_4= 'width' ( (lv_width_5_0= ruleEDouble ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSceneDsl.g:665:4: otherlv_4= 'width' ( (lv_width_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getBoxAccess().getWidthKeyword_4_0());
                    			
                    // InternalSceneDsl.g:669:4: ( (lv_width_5_0= ruleEDouble ) )
                    // InternalSceneDsl.g:670:5: (lv_width_5_0= ruleEDouble )
                    {
                    // InternalSceneDsl.g:670:5: (lv_width_5_0= ruleEDouble )
                    // InternalSceneDsl.g:671:6: lv_width_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getBoxAccess().getWidthEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_width_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoxRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_5_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:689:3: (otherlv_6= 'height' ( (lv_height_7_0= ruleEDouble ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSceneDsl.g:690:4: otherlv_6= 'height' ( (lv_height_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getBoxAccess().getHeightKeyword_5_0());
                    			
                    // InternalSceneDsl.g:694:4: ( (lv_height_7_0= ruleEDouble ) )
                    // InternalSceneDsl.g:695:5: (lv_height_7_0= ruleEDouble )
                    {
                    // InternalSceneDsl.g:695:5: (lv_height_7_0= ruleEDouble )
                    // InternalSceneDsl.g:696:6: lv_height_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getBoxAccess().getHeightEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_height_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoxRule());
                    						}
                    						set(
                    							current,
                    							"height",
                    							lv_height_7_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:714:3: (otherlv_8= 'depth' ( (lv_depth_9_0= ruleEDouble ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSceneDsl.g:715:4: otherlv_8= 'depth' ( (lv_depth_9_0= ruleEDouble ) )
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getBoxAccess().getDepthKeyword_6_0());
                    			
                    // InternalSceneDsl.g:719:4: ( (lv_depth_9_0= ruleEDouble ) )
                    // InternalSceneDsl.g:720:5: (lv_depth_9_0= ruleEDouble )
                    {
                    // InternalSceneDsl.g:720:5: (lv_depth_9_0= ruleEDouble )
                    // InternalSceneDsl.g:721:6: lv_depth_9_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getBoxAccess().getDepthEDoubleParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_depth_9_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoxRule());
                    						}
                    						set(
                    							current,
                    							"depth",
                    							lv_depth_9_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:739:3: (otherlv_10= 'placement' ( (lv_placement_11_0= rulePlacement ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSceneDsl.g:740:4: otherlv_10= 'placement' ( (lv_placement_11_0= rulePlacement ) )
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getBoxAccess().getPlacementKeyword_7_0());
                    			
                    // InternalSceneDsl.g:744:4: ( (lv_placement_11_0= rulePlacement ) )
                    // InternalSceneDsl.g:745:5: (lv_placement_11_0= rulePlacement )
                    {
                    // InternalSceneDsl.g:745:5: (lv_placement_11_0= rulePlacement )
                    // InternalSceneDsl.g:746:6: lv_placement_11_0= rulePlacement
                    {

                    						newCompositeNode(grammarAccess.getBoxAccess().getPlacementPlacementParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_placement_11_0=rulePlacement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoxRule());
                    						}
                    						set(
                    							current,
                    							"placement",
                    							lv_placement_11_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.Placement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:764:3: (otherlv_12= 'physicparameters' ( (lv_physicparameters_13_0= rulePhysicParameters ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSceneDsl.g:765:4: otherlv_12= 'physicparameters' ( (lv_physicparameters_13_0= rulePhysicParameters ) )
                    {
                    otherlv_12=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getBoxAccess().getPhysicparametersKeyword_8_0());
                    			
                    // InternalSceneDsl.g:769:4: ( (lv_physicparameters_13_0= rulePhysicParameters ) )
                    // InternalSceneDsl.g:770:5: (lv_physicparameters_13_0= rulePhysicParameters )
                    {
                    // InternalSceneDsl.g:770:5: (lv_physicparameters_13_0= rulePhysicParameters )
                    // InternalSceneDsl.g:771:6: lv_physicparameters_13_0= rulePhysicParameters
                    {

                    						newCompositeNode(grammarAccess.getBoxAccess().getPhysicparametersPhysicParametersParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_physicparameters_13_0=rulePhysicParameters();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoxRule());
                    						}
                    						set(
                    							current,
                    							"physicparameters",
                    							lv_physicparameters_13_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.PhysicParameters");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:789:3: (otherlv_14= 'material' ( (lv_material_15_0= ruleMaterial ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSceneDsl.g:790:4: otherlv_14= 'material' ( (lv_material_15_0= ruleMaterial ) )
                    {
                    otherlv_14=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_14, grammarAccess.getBoxAccess().getMaterialKeyword_9_0());
                    			
                    // InternalSceneDsl.g:794:4: ( (lv_material_15_0= ruleMaterial ) )
                    // InternalSceneDsl.g:795:5: (lv_material_15_0= ruleMaterial )
                    {
                    // InternalSceneDsl.g:795:5: (lv_material_15_0= ruleMaterial )
                    // InternalSceneDsl.g:796:6: lv_material_15_0= ruleMaterial
                    {

                    						newCompositeNode(grammarAccess.getBoxAccess().getMaterialMaterialParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_material_15_0=ruleMaterial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoxRule());
                    						}
                    						set(
                    							current,
                    							"material",
                    							lv_material_15_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.Material");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleCylinder"
    // InternalSceneDsl.g:822:1: entryRuleCylinder returns [EObject current=null] : iv_ruleCylinder= ruleCylinder EOF ;
    public final EObject entryRuleCylinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinder = null;


        try {
            // InternalSceneDsl.g:822:49: (iv_ruleCylinder= ruleCylinder EOF )
            // InternalSceneDsl.g:823:2: iv_ruleCylinder= ruleCylinder EOF
            {
             newCompositeNode(grammarAccess.getCylinderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCylinder=ruleCylinder();

            state._fsp--;

             current =iv_ruleCylinder; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCylinder"


    // $ANTLR start "ruleCylinder"
    // InternalSceneDsl.g:829:1: ruleCylinder returns [EObject current=null] : ( () otherlv_1= 'cylinder' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'radius' ( (lv_radius_5_0= ruleEDouble ) ) )? (otherlv_6= 'height' ( (lv_height_7_0= ruleEDouble ) ) )? (otherlv_8= 'placement' ( (lv_placement_9_0= rulePlacement ) ) )? (otherlv_10= 'physicparameters' ( (lv_physicparameters_11_0= rulePhysicParameters ) ) )? (otherlv_12= 'material' ( (lv_material_13_0= ruleMaterial ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleCylinder() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_radius_5_0 = null;

        AntlrDatatypeRuleToken lv_height_7_0 = null;

        EObject lv_placement_9_0 = null;

        EObject lv_physicparameters_11_0 = null;

        EObject lv_material_13_0 = null;



        	enterRule();

        try {
            // InternalSceneDsl.g:835:2: ( ( () otherlv_1= 'cylinder' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'radius' ( (lv_radius_5_0= ruleEDouble ) ) )? (otherlv_6= 'height' ( (lv_height_7_0= ruleEDouble ) ) )? (otherlv_8= 'placement' ( (lv_placement_9_0= rulePlacement ) ) )? (otherlv_10= 'physicparameters' ( (lv_physicparameters_11_0= rulePhysicParameters ) ) )? (otherlv_12= 'material' ( (lv_material_13_0= ruleMaterial ) ) )? otherlv_14= '}' ) )
            // InternalSceneDsl.g:836:2: ( () otherlv_1= 'cylinder' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'radius' ( (lv_radius_5_0= ruleEDouble ) ) )? (otherlv_6= 'height' ( (lv_height_7_0= ruleEDouble ) ) )? (otherlv_8= 'placement' ( (lv_placement_9_0= rulePlacement ) ) )? (otherlv_10= 'physicparameters' ( (lv_physicparameters_11_0= rulePhysicParameters ) ) )? (otherlv_12= 'material' ( (lv_material_13_0= ruleMaterial ) ) )? otherlv_14= '}' )
            {
            // InternalSceneDsl.g:836:2: ( () otherlv_1= 'cylinder' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'radius' ( (lv_radius_5_0= ruleEDouble ) ) )? (otherlv_6= 'height' ( (lv_height_7_0= ruleEDouble ) ) )? (otherlv_8= 'placement' ( (lv_placement_9_0= rulePlacement ) ) )? (otherlv_10= 'physicparameters' ( (lv_physicparameters_11_0= rulePhysicParameters ) ) )? (otherlv_12= 'material' ( (lv_material_13_0= ruleMaterial ) ) )? otherlv_14= '}' )
            // InternalSceneDsl.g:837:3: () otherlv_1= 'cylinder' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'radius' ( (lv_radius_5_0= ruleEDouble ) ) )? (otherlv_6= 'height' ( (lv_height_7_0= ruleEDouble ) ) )? (otherlv_8= 'placement' ( (lv_placement_9_0= rulePlacement ) ) )? (otherlv_10= 'physicparameters' ( (lv_physicparameters_11_0= rulePhysicParameters ) ) )? (otherlv_12= 'material' ( (lv_material_13_0= ruleMaterial ) ) )? otherlv_14= '}'
            {
            // InternalSceneDsl.g:837:3: ()
            // InternalSceneDsl.g:838:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCylinderAccess().getCylinderAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCylinderAccess().getCylinderKeyword_1());
            		
            // InternalSceneDsl.g:848:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSceneDsl.g:849:4: (lv_name_2_0= ruleEString )
            {
            // InternalSceneDsl.g:849:4: (lv_name_2_0= ruleEString )
            // InternalSceneDsl.g:850:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCylinderRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.robotlabor.scene.description.SceneDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getCylinderAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSceneDsl.g:871:3: (otherlv_4= 'radius' ( (lv_radius_5_0= ruleEDouble ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSceneDsl.g:872:4: otherlv_4= 'radius' ( (lv_radius_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getCylinderAccess().getRadiusKeyword_4_0());
                    			
                    // InternalSceneDsl.g:876:4: ( (lv_radius_5_0= ruleEDouble ) )
                    // InternalSceneDsl.g:877:5: (lv_radius_5_0= ruleEDouble )
                    {
                    // InternalSceneDsl.g:877:5: (lv_radius_5_0= ruleEDouble )
                    // InternalSceneDsl.g:878:6: lv_radius_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getCylinderAccess().getRadiusEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_radius_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCylinderRule());
                    						}
                    						set(
                    							current,
                    							"radius",
                    							lv_radius_5_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:896:3: (otherlv_6= 'height' ( (lv_height_7_0= ruleEDouble ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSceneDsl.g:897:4: otherlv_6= 'height' ( (lv_height_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getCylinderAccess().getHeightKeyword_5_0());
                    			
                    // InternalSceneDsl.g:901:4: ( (lv_height_7_0= ruleEDouble ) )
                    // InternalSceneDsl.g:902:5: (lv_height_7_0= ruleEDouble )
                    {
                    // InternalSceneDsl.g:902:5: (lv_height_7_0= ruleEDouble )
                    // InternalSceneDsl.g:903:6: lv_height_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getCylinderAccess().getHeightEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_height_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCylinderRule());
                    						}
                    						set(
                    							current,
                    							"height",
                    							lv_height_7_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:921:3: (otherlv_8= 'placement' ( (lv_placement_9_0= rulePlacement ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSceneDsl.g:922:4: otherlv_8= 'placement' ( (lv_placement_9_0= rulePlacement ) )
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getCylinderAccess().getPlacementKeyword_6_0());
                    			
                    // InternalSceneDsl.g:926:4: ( (lv_placement_9_0= rulePlacement ) )
                    // InternalSceneDsl.g:927:5: (lv_placement_9_0= rulePlacement )
                    {
                    // InternalSceneDsl.g:927:5: (lv_placement_9_0= rulePlacement )
                    // InternalSceneDsl.g:928:6: lv_placement_9_0= rulePlacement
                    {

                    						newCompositeNode(grammarAccess.getCylinderAccess().getPlacementPlacementParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_placement_9_0=rulePlacement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCylinderRule());
                    						}
                    						set(
                    							current,
                    							"placement",
                    							lv_placement_9_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.Placement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:946:3: (otherlv_10= 'physicparameters' ( (lv_physicparameters_11_0= rulePhysicParameters ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSceneDsl.g:947:4: otherlv_10= 'physicparameters' ( (lv_physicparameters_11_0= rulePhysicParameters ) )
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getCylinderAccess().getPhysicparametersKeyword_7_0());
                    			
                    // InternalSceneDsl.g:951:4: ( (lv_physicparameters_11_0= rulePhysicParameters ) )
                    // InternalSceneDsl.g:952:5: (lv_physicparameters_11_0= rulePhysicParameters )
                    {
                    // InternalSceneDsl.g:952:5: (lv_physicparameters_11_0= rulePhysicParameters )
                    // InternalSceneDsl.g:953:6: lv_physicparameters_11_0= rulePhysicParameters
                    {

                    						newCompositeNode(grammarAccess.getCylinderAccess().getPhysicparametersPhysicParametersParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_physicparameters_11_0=rulePhysicParameters();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCylinderRule());
                    						}
                    						set(
                    							current,
                    							"physicparameters",
                    							lv_physicparameters_11_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.PhysicParameters");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:971:3: (otherlv_12= 'material' ( (lv_material_13_0= ruleMaterial ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSceneDsl.g:972:4: otherlv_12= 'material' ( (lv_material_13_0= ruleMaterial ) )
                    {
                    otherlv_12=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getCylinderAccess().getMaterialKeyword_8_0());
                    			
                    // InternalSceneDsl.g:976:4: ( (lv_material_13_0= ruleMaterial ) )
                    // InternalSceneDsl.g:977:5: (lv_material_13_0= ruleMaterial )
                    {
                    // InternalSceneDsl.g:977:5: (lv_material_13_0= ruleMaterial )
                    // InternalSceneDsl.g:978:6: lv_material_13_0= ruleMaterial
                    {

                    						newCompositeNode(grammarAccess.getCylinderAccess().getMaterialMaterialParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_material_13_0=ruleMaterial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCylinderRule());
                    						}
                    						set(
                    							current,
                    							"material",
                    							lv_material_13_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.Material");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getCylinderAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCylinder"


    // $ANTLR start "entryRuleFloor"
    // InternalSceneDsl.g:1004:1: entryRuleFloor returns [EObject current=null] : iv_ruleFloor= ruleFloor EOF ;
    public final EObject entryRuleFloor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloor = null;


        try {
            // InternalSceneDsl.g:1004:46: (iv_ruleFloor= ruleFloor EOF )
            // InternalSceneDsl.g:1005:2: iv_ruleFloor= ruleFloor EOF
            {
             newCompositeNode(grammarAccess.getFloorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloor=ruleFloor();

            state._fsp--;

             current =iv_ruleFloor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloor"


    // $ANTLR start "ruleFloor"
    // InternalSceneDsl.g:1011:1: ruleFloor returns [EObject current=null] : ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'placement' ( (lv_placement_5_0= rulePlacement ) ) )? (otherlv_6= 'physicparameters' ( (lv_physicparameters_7_0= rulePhysicParameters ) ) )? (otherlv_8= 'material' ( (lv_material_9_0= ruleMaterial ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleFloor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_placement_5_0 = null;

        EObject lv_physicparameters_7_0 = null;

        EObject lv_material_9_0 = null;



        	enterRule();

        try {
            // InternalSceneDsl.g:1017:2: ( ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'placement' ( (lv_placement_5_0= rulePlacement ) ) )? (otherlv_6= 'physicparameters' ( (lv_physicparameters_7_0= rulePhysicParameters ) ) )? (otherlv_8= 'material' ( (lv_material_9_0= ruleMaterial ) ) )? otherlv_10= '}' ) )
            // InternalSceneDsl.g:1018:2: ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'placement' ( (lv_placement_5_0= rulePlacement ) ) )? (otherlv_6= 'physicparameters' ( (lv_physicparameters_7_0= rulePhysicParameters ) ) )? (otherlv_8= 'material' ( (lv_material_9_0= ruleMaterial ) ) )? otherlv_10= '}' )
            {
            // InternalSceneDsl.g:1018:2: ( () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'placement' ( (lv_placement_5_0= rulePlacement ) ) )? (otherlv_6= 'physicparameters' ( (lv_physicparameters_7_0= rulePhysicParameters ) ) )? (otherlv_8= 'material' ( (lv_material_9_0= ruleMaterial ) ) )? otherlv_10= '}' )
            // InternalSceneDsl.g:1019:3: () otherlv_1= 'floor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'placement' ( (lv_placement_5_0= rulePlacement ) ) )? (otherlv_6= 'physicparameters' ( (lv_physicparameters_7_0= rulePhysicParameters ) ) )? (otherlv_8= 'material' ( (lv_material_9_0= ruleMaterial ) ) )? otherlv_10= '}'
            {
            // InternalSceneDsl.g:1019:3: ()
            // InternalSceneDsl.g:1020:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloorAccess().getFloorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFloorAccess().getFloorKeyword_1());
            		
            // InternalSceneDsl.g:1030:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSceneDsl.g:1031:4: (lv_name_2_0= ruleEString )
            {
            // InternalSceneDsl.g:1031:4: (lv_name_2_0= ruleEString )
            // InternalSceneDsl.g:1032:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFloorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFloorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.robotlabor.scene.description.SceneDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSceneDsl.g:1053:3: (otherlv_4= 'placement' ( (lv_placement_5_0= rulePlacement ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSceneDsl.g:1054:4: otherlv_4= 'placement' ( (lv_placement_5_0= rulePlacement ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getFloorAccess().getPlacementKeyword_4_0());
                    			
                    // InternalSceneDsl.g:1058:4: ( (lv_placement_5_0= rulePlacement ) )
                    // InternalSceneDsl.g:1059:5: (lv_placement_5_0= rulePlacement )
                    {
                    // InternalSceneDsl.g:1059:5: (lv_placement_5_0= rulePlacement )
                    // InternalSceneDsl.g:1060:6: lv_placement_5_0= rulePlacement
                    {

                    						newCompositeNode(grammarAccess.getFloorAccess().getPlacementPlacementParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_placement_5_0=rulePlacement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFloorRule());
                    						}
                    						set(
                    							current,
                    							"placement",
                    							lv_placement_5_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.Placement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:1078:3: (otherlv_6= 'physicparameters' ( (lv_physicparameters_7_0= rulePhysicParameters ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSceneDsl.g:1079:4: otherlv_6= 'physicparameters' ( (lv_physicparameters_7_0= rulePhysicParameters ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getFloorAccess().getPhysicparametersKeyword_5_0());
                    			
                    // InternalSceneDsl.g:1083:4: ( (lv_physicparameters_7_0= rulePhysicParameters ) )
                    // InternalSceneDsl.g:1084:5: (lv_physicparameters_7_0= rulePhysicParameters )
                    {
                    // InternalSceneDsl.g:1084:5: (lv_physicparameters_7_0= rulePhysicParameters )
                    // InternalSceneDsl.g:1085:6: lv_physicparameters_7_0= rulePhysicParameters
                    {

                    						newCompositeNode(grammarAccess.getFloorAccess().getPhysicparametersPhysicParametersParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_physicparameters_7_0=rulePhysicParameters();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFloorRule());
                    						}
                    						set(
                    							current,
                    							"physicparameters",
                    							lv_physicparameters_7_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.PhysicParameters");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:1103:3: (otherlv_8= 'material' ( (lv_material_9_0= ruleMaterial ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==21) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSceneDsl.g:1104:4: otherlv_8= 'material' ( (lv_material_9_0= ruleMaterial ) )
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getFloorAccess().getMaterialKeyword_6_0());
                    			
                    // InternalSceneDsl.g:1108:4: ( (lv_material_9_0= ruleMaterial ) )
                    // InternalSceneDsl.g:1109:5: (lv_material_9_0= ruleMaterial )
                    {
                    // InternalSceneDsl.g:1109:5: (lv_material_9_0= ruleMaterial )
                    // InternalSceneDsl.g:1110:6: lv_material_9_0= ruleMaterial
                    {

                    						newCompositeNode(grammarAccess.getFloorAccess().getMaterialMaterialParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_material_9_0=ruleMaterial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFloorRule());
                    						}
                    						set(
                    							current,
                    							"material",
                    							lv_material_9_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.Material");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloor"


    // $ANTLR start "entryRuleWallElement"
    // InternalSceneDsl.g:1136:1: entryRuleWallElement returns [EObject current=null] : iv_ruleWallElement= ruleWallElement EOF ;
    public final EObject entryRuleWallElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWallElement = null;


        try {
            // InternalSceneDsl.g:1136:52: (iv_ruleWallElement= ruleWallElement EOF )
            // InternalSceneDsl.g:1137:2: iv_ruleWallElement= ruleWallElement EOF
            {
             newCompositeNode(grammarAccess.getWallElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWallElement=ruleWallElement();

            state._fsp--;

             current =iv_ruleWallElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWallElement"


    // $ANTLR start "ruleWallElement"
    // InternalSceneDsl.g:1143:1: ruleWallElement returns [EObject current=null] : ( () otherlv_1= 'wall' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'width' ( (lv_width_5_0= ruleEDouble ) ) )? (otherlv_6= 'height' ( (lv_height_7_0= ruleEDouble ) ) )? (otherlv_8= 'placement' ( (lv_placement_9_0= rulePlacement ) ) )? (otherlv_10= 'physicparameters' ( (lv_physicparameters_11_0= rulePhysicParameters ) ) )? (otherlv_12= 'material' ( (lv_material_13_0= ruleMaterial ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleWallElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_width_5_0 = null;

        AntlrDatatypeRuleToken lv_height_7_0 = null;

        EObject lv_placement_9_0 = null;

        EObject lv_physicparameters_11_0 = null;

        EObject lv_material_13_0 = null;



        	enterRule();

        try {
            // InternalSceneDsl.g:1149:2: ( ( () otherlv_1= 'wall' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'width' ( (lv_width_5_0= ruleEDouble ) ) )? (otherlv_6= 'height' ( (lv_height_7_0= ruleEDouble ) ) )? (otherlv_8= 'placement' ( (lv_placement_9_0= rulePlacement ) ) )? (otherlv_10= 'physicparameters' ( (lv_physicparameters_11_0= rulePhysicParameters ) ) )? (otherlv_12= 'material' ( (lv_material_13_0= ruleMaterial ) ) )? otherlv_14= '}' ) )
            // InternalSceneDsl.g:1150:2: ( () otherlv_1= 'wall' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'width' ( (lv_width_5_0= ruleEDouble ) ) )? (otherlv_6= 'height' ( (lv_height_7_0= ruleEDouble ) ) )? (otherlv_8= 'placement' ( (lv_placement_9_0= rulePlacement ) ) )? (otherlv_10= 'physicparameters' ( (lv_physicparameters_11_0= rulePhysicParameters ) ) )? (otherlv_12= 'material' ( (lv_material_13_0= ruleMaterial ) ) )? otherlv_14= '}' )
            {
            // InternalSceneDsl.g:1150:2: ( () otherlv_1= 'wall' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'width' ( (lv_width_5_0= ruleEDouble ) ) )? (otherlv_6= 'height' ( (lv_height_7_0= ruleEDouble ) ) )? (otherlv_8= 'placement' ( (lv_placement_9_0= rulePlacement ) ) )? (otherlv_10= 'physicparameters' ( (lv_physicparameters_11_0= rulePhysicParameters ) ) )? (otherlv_12= 'material' ( (lv_material_13_0= ruleMaterial ) ) )? otherlv_14= '}' )
            // InternalSceneDsl.g:1151:3: () otherlv_1= 'wall' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'width' ( (lv_width_5_0= ruleEDouble ) ) )? (otherlv_6= 'height' ( (lv_height_7_0= ruleEDouble ) ) )? (otherlv_8= 'placement' ( (lv_placement_9_0= rulePlacement ) ) )? (otherlv_10= 'physicparameters' ( (lv_physicparameters_11_0= rulePhysicParameters ) ) )? (otherlv_12= 'material' ( (lv_material_13_0= ruleMaterial ) ) )? otherlv_14= '}'
            {
            // InternalSceneDsl.g:1151:3: ()
            // InternalSceneDsl.g:1152:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWallElementAccess().getWallElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWallElementAccess().getWallKeyword_1());
            		
            // InternalSceneDsl.g:1162:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSceneDsl.g:1163:4: (lv_name_2_0= ruleEString )
            {
            // InternalSceneDsl.g:1163:4: (lv_name_2_0= ruleEString )
            // InternalSceneDsl.g:1164:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWallElementAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWallElementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.robotlabor.scene.description.SceneDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getWallElementAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSceneDsl.g:1185:3: (otherlv_4= 'width' ( (lv_width_5_0= ruleEDouble ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSceneDsl.g:1186:4: otherlv_4= 'width' ( (lv_width_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getWallElementAccess().getWidthKeyword_4_0());
                    			
                    // InternalSceneDsl.g:1190:4: ( (lv_width_5_0= ruleEDouble ) )
                    // InternalSceneDsl.g:1191:5: (lv_width_5_0= ruleEDouble )
                    {
                    // InternalSceneDsl.g:1191:5: (lv_width_5_0= ruleEDouble )
                    // InternalSceneDsl.g:1192:6: lv_width_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getWallElementAccess().getWidthEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_width_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWallElementRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_5_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:1210:3: (otherlv_6= 'height' ( (lv_height_7_0= ruleEDouble ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSceneDsl.g:1211:4: otherlv_6= 'height' ( (lv_height_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getWallElementAccess().getHeightKeyword_5_0());
                    			
                    // InternalSceneDsl.g:1215:4: ( (lv_height_7_0= ruleEDouble ) )
                    // InternalSceneDsl.g:1216:5: (lv_height_7_0= ruleEDouble )
                    {
                    // InternalSceneDsl.g:1216:5: (lv_height_7_0= ruleEDouble )
                    // InternalSceneDsl.g:1217:6: lv_height_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getWallElementAccess().getHeightEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_height_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWallElementRule());
                    						}
                    						set(
                    							current,
                    							"height",
                    							lv_height_7_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:1235:3: (otherlv_8= 'placement' ( (lv_placement_9_0= rulePlacement ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==17) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSceneDsl.g:1236:4: otherlv_8= 'placement' ( (lv_placement_9_0= rulePlacement ) )
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getWallElementAccess().getPlacementKeyword_6_0());
                    			
                    // InternalSceneDsl.g:1240:4: ( (lv_placement_9_0= rulePlacement ) )
                    // InternalSceneDsl.g:1241:5: (lv_placement_9_0= rulePlacement )
                    {
                    // InternalSceneDsl.g:1241:5: (lv_placement_9_0= rulePlacement )
                    // InternalSceneDsl.g:1242:6: lv_placement_9_0= rulePlacement
                    {

                    						newCompositeNode(grammarAccess.getWallElementAccess().getPlacementPlacementParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_placement_9_0=rulePlacement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWallElementRule());
                    						}
                    						set(
                    							current,
                    							"placement",
                    							lv_placement_9_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.Placement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:1260:3: (otherlv_10= 'physicparameters' ( (lv_physicparameters_11_0= rulePhysicParameters ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSceneDsl.g:1261:4: otherlv_10= 'physicparameters' ( (lv_physicparameters_11_0= rulePhysicParameters ) )
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getWallElementAccess().getPhysicparametersKeyword_7_0());
                    			
                    // InternalSceneDsl.g:1265:4: ( (lv_physicparameters_11_0= rulePhysicParameters ) )
                    // InternalSceneDsl.g:1266:5: (lv_physicparameters_11_0= rulePhysicParameters )
                    {
                    // InternalSceneDsl.g:1266:5: (lv_physicparameters_11_0= rulePhysicParameters )
                    // InternalSceneDsl.g:1267:6: lv_physicparameters_11_0= rulePhysicParameters
                    {

                    						newCompositeNode(grammarAccess.getWallElementAccess().getPhysicparametersPhysicParametersParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_physicparameters_11_0=rulePhysicParameters();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWallElementRule());
                    						}
                    						set(
                    							current,
                    							"physicparameters",
                    							lv_physicparameters_11_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.PhysicParameters");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:1285:3: (otherlv_12= 'material' ( (lv_material_13_0= ruleMaterial ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==21) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSceneDsl.g:1286:4: otherlv_12= 'material' ( (lv_material_13_0= ruleMaterial ) )
                    {
                    otherlv_12=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getWallElementAccess().getMaterialKeyword_8_0());
                    			
                    // InternalSceneDsl.g:1290:4: ( (lv_material_13_0= ruleMaterial ) )
                    // InternalSceneDsl.g:1291:5: (lv_material_13_0= ruleMaterial )
                    {
                    // InternalSceneDsl.g:1291:5: (lv_material_13_0= ruleMaterial )
                    // InternalSceneDsl.g:1292:6: lv_material_13_0= ruleMaterial
                    {

                    						newCompositeNode(grammarAccess.getWallElementAccess().getMaterialMaterialParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_material_13_0=ruleMaterial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWallElementRule());
                    						}
                    						set(
                    							current,
                    							"material",
                    							lv_material_13_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.Material");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getWallElementAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWallElement"


    // $ANTLR start "entryRulePlacement"
    // InternalSceneDsl.g:1318:1: entryRulePlacement returns [EObject current=null] : iv_rulePlacement= rulePlacement EOF ;
    public final EObject entryRulePlacement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlacement = null;


        try {
            // InternalSceneDsl.g:1318:50: (iv_rulePlacement= rulePlacement EOF )
            // InternalSceneDsl.g:1319:2: iv_rulePlacement= rulePlacement EOF
            {
             newCompositeNode(grammarAccess.getPlacementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlacement=rulePlacement();

            state._fsp--;

             current =iv_rulePlacement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlacement"


    // $ANTLR start "rulePlacement"
    // InternalSceneDsl.g:1325:1: rulePlacement returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'position' ( (lv_position_3_0= ruleVec3 ) ) )? (otherlv_4= 'rotation' ( (lv_rotation_5_0= ruleRotation ) ) )? otherlv_6= '}' ) ;
    public final EObject rulePlacement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_position_3_0 = null;

        EObject lv_rotation_5_0 = null;



        	enterRule();

        try {
            // InternalSceneDsl.g:1331:2: ( ( () otherlv_1= '{' (otherlv_2= 'position' ( (lv_position_3_0= ruleVec3 ) ) )? (otherlv_4= 'rotation' ( (lv_rotation_5_0= ruleRotation ) ) )? otherlv_6= '}' ) )
            // InternalSceneDsl.g:1332:2: ( () otherlv_1= '{' (otherlv_2= 'position' ( (lv_position_3_0= ruleVec3 ) ) )? (otherlv_4= 'rotation' ( (lv_rotation_5_0= ruleRotation ) ) )? otherlv_6= '}' )
            {
            // InternalSceneDsl.g:1332:2: ( () otherlv_1= '{' (otherlv_2= 'position' ( (lv_position_3_0= ruleVec3 ) ) )? (otherlv_4= 'rotation' ( (lv_rotation_5_0= ruleRotation ) ) )? otherlv_6= '}' )
            // InternalSceneDsl.g:1333:3: () otherlv_1= '{' (otherlv_2= 'position' ( (lv_position_3_0= ruleVec3 ) ) )? (otherlv_4= 'rotation' ( (lv_rotation_5_0= ruleRotation ) ) )? otherlv_6= '}'
            {
            // InternalSceneDsl.g:1333:3: ()
            // InternalSceneDsl.g:1334:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPlacementAccess().getPlacementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getPlacementAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSceneDsl.g:1344:3: (otherlv_2= 'position' ( (lv_position_3_0= ruleVec3 ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSceneDsl.g:1345:4: otherlv_2= 'position' ( (lv_position_3_0= ruleVec3 ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getPlacementAccess().getPositionKeyword_2_0());
                    			
                    // InternalSceneDsl.g:1349:4: ( (lv_position_3_0= ruleVec3 ) )
                    // InternalSceneDsl.g:1350:5: (lv_position_3_0= ruleVec3 )
                    {
                    // InternalSceneDsl.g:1350:5: (lv_position_3_0= ruleVec3 )
                    // InternalSceneDsl.g:1351:6: lv_position_3_0= ruleVec3
                    {

                    						newCompositeNode(grammarAccess.getPlacementAccess().getPositionVec3ParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_position_3_0=ruleVec3();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlacementRule());
                    						}
                    						set(
                    							current,
                    							"position",
                    							lv_position_3_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.Vec3");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:1369:3: (otherlv_4= 'rotation' ( (lv_rotation_5_0= ruleRotation ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==30) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSceneDsl.g:1370:4: otherlv_4= 'rotation' ( (lv_rotation_5_0= ruleRotation ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getPlacementAccess().getRotationKeyword_3_0());
                    			
                    // InternalSceneDsl.g:1374:4: ( (lv_rotation_5_0= ruleRotation ) )
                    // InternalSceneDsl.g:1375:5: (lv_rotation_5_0= ruleRotation )
                    {
                    // InternalSceneDsl.g:1375:5: (lv_rotation_5_0= ruleRotation )
                    // InternalSceneDsl.g:1376:6: lv_rotation_5_0= ruleRotation
                    {

                    						newCompositeNode(grammarAccess.getPlacementAccess().getRotationRotationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_rotation_5_0=ruleRotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlacementRule());
                    						}
                    						set(
                    							current,
                    							"rotation",
                    							lv_rotation_5_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.Rotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPlacementAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlacement"


    // $ANTLR start "entryRuleVec3"
    // InternalSceneDsl.g:1402:1: entryRuleVec3 returns [EObject current=null] : iv_ruleVec3= ruleVec3 EOF ;
    public final EObject entryRuleVec3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVec3 = null;


        try {
            // InternalSceneDsl.g:1402:45: (iv_ruleVec3= ruleVec3 EOF )
            // InternalSceneDsl.g:1403:2: iv_ruleVec3= ruleVec3 EOF
            {
             newCompositeNode(grammarAccess.getVec3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVec3=ruleVec3();

            state._fsp--;

             current =iv_ruleVec3; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVec3"


    // $ANTLR start "ruleVec3"
    // InternalSceneDsl.g:1409:1: ruleVec3 returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) )? (otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleVec3() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_x_3_0 = null;

        AntlrDatatypeRuleToken lv_y_5_0 = null;

        AntlrDatatypeRuleToken lv_z_7_0 = null;



        	enterRule();

        try {
            // InternalSceneDsl.g:1415:2: ( ( () otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) )? (otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) )? otherlv_8= '}' ) )
            // InternalSceneDsl.g:1416:2: ( () otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) )? (otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) )? otherlv_8= '}' )
            {
            // InternalSceneDsl.g:1416:2: ( () otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) )? (otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) )? otherlv_8= '}' )
            // InternalSceneDsl.g:1417:3: () otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) )? (otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) )? otherlv_8= '}'
            {
            // InternalSceneDsl.g:1417:3: ()
            // InternalSceneDsl.g:1418:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVec3Access().getVec3Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getVec3Access().getLeftCurlyBracketKeyword_1());
            		
            // InternalSceneDsl.g:1428:3: (otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSceneDsl.g:1429:4: otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getVec3Access().getXKeyword_2_0());
                    			
                    // InternalSceneDsl.g:1433:4: ( (lv_x_3_0= ruleEDouble ) )
                    // InternalSceneDsl.g:1434:5: (lv_x_3_0= ruleEDouble )
                    {
                    // InternalSceneDsl.g:1434:5: (lv_x_3_0= ruleEDouble )
                    // InternalSceneDsl.g:1435:6: lv_x_3_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getVec3Access().getXEDoubleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_x_3_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVec3Rule());
                    						}
                    						set(
                    							current,
                    							"x",
                    							lv_x_3_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:1453:3: (otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==32) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSceneDsl.g:1454:4: otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getVec3Access().getYKeyword_3_0());
                    			
                    // InternalSceneDsl.g:1458:4: ( (lv_y_5_0= ruleEDouble ) )
                    // InternalSceneDsl.g:1459:5: (lv_y_5_0= ruleEDouble )
                    {
                    // InternalSceneDsl.g:1459:5: (lv_y_5_0= ruleEDouble )
                    // InternalSceneDsl.g:1460:6: lv_y_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getVec3Access().getYEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_y_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVec3Rule());
                    						}
                    						set(
                    							current,
                    							"y",
                    							lv_y_5_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:1478:3: (otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==33) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSceneDsl.g:1479:4: otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getVec3Access().getZKeyword_4_0());
                    			
                    // InternalSceneDsl.g:1483:4: ( (lv_z_7_0= ruleEDouble ) )
                    // InternalSceneDsl.g:1484:5: (lv_z_7_0= ruleEDouble )
                    {
                    // InternalSceneDsl.g:1484:5: (lv_z_7_0= ruleEDouble )
                    // InternalSceneDsl.g:1485:6: lv_z_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getVec3Access().getZEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_z_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVec3Rule());
                    						}
                    						set(
                    							current,
                    							"z",
                    							lv_z_7_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getVec3Access().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVec3"


    // $ANTLR start "entryRuleRotation"
    // InternalSceneDsl.g:1511:1: entryRuleRotation returns [EObject current=null] : iv_ruleRotation= ruleRotation EOF ;
    public final EObject entryRuleRotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotation = null;


        try {
            // InternalSceneDsl.g:1511:49: (iv_ruleRotation= ruleRotation EOF )
            // InternalSceneDsl.g:1512:2: iv_ruleRotation= ruleRotation EOF
            {
             newCompositeNode(grammarAccess.getRotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotation=ruleRotation();

            state._fsp--;

             current =iv_ruleRotation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRotation"


    // $ANTLR start "ruleRotation"
    // InternalSceneDsl.g:1518:1: ruleRotation returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'roll' ( (lv_roll_3_0= ruleEDouble ) ) )? (otherlv_4= 'pitch' ( (lv_pitch_5_0= ruleEDouble ) ) )? (otherlv_6= 'yaw' ( (lv_yaw_7_0= ruleEDouble ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleRotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_roll_3_0 = null;

        AntlrDatatypeRuleToken lv_pitch_5_0 = null;

        AntlrDatatypeRuleToken lv_yaw_7_0 = null;



        	enterRule();

        try {
            // InternalSceneDsl.g:1524:2: ( ( () otherlv_1= '{' (otherlv_2= 'roll' ( (lv_roll_3_0= ruleEDouble ) ) )? (otherlv_4= 'pitch' ( (lv_pitch_5_0= ruleEDouble ) ) )? (otherlv_6= 'yaw' ( (lv_yaw_7_0= ruleEDouble ) ) )? otherlv_8= '}' ) )
            // InternalSceneDsl.g:1525:2: ( () otherlv_1= '{' (otherlv_2= 'roll' ( (lv_roll_3_0= ruleEDouble ) ) )? (otherlv_4= 'pitch' ( (lv_pitch_5_0= ruleEDouble ) ) )? (otherlv_6= 'yaw' ( (lv_yaw_7_0= ruleEDouble ) ) )? otherlv_8= '}' )
            {
            // InternalSceneDsl.g:1525:2: ( () otherlv_1= '{' (otherlv_2= 'roll' ( (lv_roll_3_0= ruleEDouble ) ) )? (otherlv_4= 'pitch' ( (lv_pitch_5_0= ruleEDouble ) ) )? (otherlv_6= 'yaw' ( (lv_yaw_7_0= ruleEDouble ) ) )? otherlv_8= '}' )
            // InternalSceneDsl.g:1526:3: () otherlv_1= '{' (otherlv_2= 'roll' ( (lv_roll_3_0= ruleEDouble ) ) )? (otherlv_4= 'pitch' ( (lv_pitch_5_0= ruleEDouble ) ) )? (otherlv_6= 'yaw' ( (lv_yaw_7_0= ruleEDouble ) ) )? otherlv_8= '}'
            {
            // InternalSceneDsl.g:1526:3: ()
            // InternalSceneDsl.g:1527:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRotationAccess().getRotationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getRotationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSceneDsl.g:1537:3: (otherlv_2= 'roll' ( (lv_roll_3_0= ruleEDouble ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSceneDsl.g:1538:4: otherlv_2= 'roll' ( (lv_roll_3_0= ruleEDouble ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getRotationAccess().getRollKeyword_2_0());
                    			
                    // InternalSceneDsl.g:1542:4: ( (lv_roll_3_0= ruleEDouble ) )
                    // InternalSceneDsl.g:1543:5: (lv_roll_3_0= ruleEDouble )
                    {
                    // InternalSceneDsl.g:1543:5: (lv_roll_3_0= ruleEDouble )
                    // InternalSceneDsl.g:1544:6: lv_roll_3_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getRotationAccess().getRollEDoubleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_roll_3_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRotationRule());
                    						}
                    						set(
                    							current,
                    							"roll",
                    							lv_roll_3_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:1562:3: (otherlv_4= 'pitch' ( (lv_pitch_5_0= ruleEDouble ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==35) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSceneDsl.g:1563:4: otherlv_4= 'pitch' ( (lv_pitch_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getRotationAccess().getPitchKeyword_3_0());
                    			
                    // InternalSceneDsl.g:1567:4: ( (lv_pitch_5_0= ruleEDouble ) )
                    // InternalSceneDsl.g:1568:5: (lv_pitch_5_0= ruleEDouble )
                    {
                    // InternalSceneDsl.g:1568:5: (lv_pitch_5_0= ruleEDouble )
                    // InternalSceneDsl.g:1569:6: lv_pitch_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getRotationAccess().getPitchEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_pitch_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRotationRule());
                    						}
                    						set(
                    							current,
                    							"pitch",
                    							lv_pitch_5_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:1587:3: (otherlv_6= 'yaw' ( (lv_yaw_7_0= ruleEDouble ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==36) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSceneDsl.g:1588:4: otherlv_6= 'yaw' ( (lv_yaw_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getRotationAccess().getYawKeyword_4_0());
                    			
                    // InternalSceneDsl.g:1592:4: ( (lv_yaw_7_0= ruleEDouble ) )
                    // InternalSceneDsl.g:1593:5: (lv_yaw_7_0= ruleEDouble )
                    {
                    // InternalSceneDsl.g:1593:5: (lv_yaw_7_0= ruleEDouble )
                    // InternalSceneDsl.g:1594:6: lv_yaw_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getRotationAccess().getYawEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_yaw_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRotationRule());
                    						}
                    						set(
                    							current,
                    							"yaw",
                    							lv_yaw_7_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRotationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRotation"


    // $ANTLR start "entryRuleEDouble"
    // InternalSceneDsl.g:1620:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalSceneDsl.g:1620:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalSceneDsl.g:1621:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalSceneDsl.g:1627:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalSceneDsl.g:1633:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalSceneDsl.g:1634:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalSceneDsl.g:1634:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalSceneDsl.g:1635:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalSceneDsl.g:1635:3: (kw= '-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==37) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSceneDsl.g:1636:4: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_31); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalSceneDsl.g:1642:3: (this_INT_1= RULE_INT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_INT) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSceneDsl.g:1643:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_32); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,38,FOLLOW_33); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_34); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalSceneDsl.g:1663:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=39 && LA44_0<=40)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSceneDsl.g:1664:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalSceneDsl.g:1664:4: (kw= 'E' | kw= 'e' )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==39) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==40) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalSceneDsl.g:1665:5: kw= 'E'
                            {
                            kw=(Token)match(input,39,FOLLOW_35); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSceneDsl.g:1671:5: kw= 'e'
                            {
                            kw=(Token)match(input,40,FOLLOW_35); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalSceneDsl.g:1677:4: (kw= '-' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==37) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalSceneDsl.g:1678:5: kw= '-'
                            {
                            kw=(Token)match(input,37,FOLLOW_33); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRulePhysicParameters"
    // InternalSceneDsl.g:1696:1: entryRulePhysicParameters returns [EObject current=null] : iv_rulePhysicParameters= rulePhysicParameters EOF ;
    public final EObject entryRulePhysicParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhysicParameters = null;


        try {
            // InternalSceneDsl.g:1696:57: (iv_rulePhysicParameters= rulePhysicParameters EOF )
            // InternalSceneDsl.g:1697:2: iv_rulePhysicParameters= rulePhysicParameters EOF
            {
             newCompositeNode(grammarAccess.getPhysicParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhysicParameters=rulePhysicParameters();

            state._fsp--;

             current =iv_rulePhysicParameters; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhysicParameters"


    // $ANTLR start "rulePhysicParameters"
    // InternalSceneDsl.g:1703:1: rulePhysicParameters returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'mass' ( (lv_mass_3_0= ruleEDouble ) ) )? otherlv_4= '}' ) ;
    public final EObject rulePhysicParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_mass_3_0 = null;



        	enterRule();

        try {
            // InternalSceneDsl.g:1709:2: ( ( () otherlv_1= '{' (otherlv_2= 'mass' ( (lv_mass_3_0= ruleEDouble ) ) )? otherlv_4= '}' ) )
            // InternalSceneDsl.g:1710:2: ( () otherlv_1= '{' (otherlv_2= 'mass' ( (lv_mass_3_0= ruleEDouble ) ) )? otherlv_4= '}' )
            {
            // InternalSceneDsl.g:1710:2: ( () otherlv_1= '{' (otherlv_2= 'mass' ( (lv_mass_3_0= ruleEDouble ) ) )? otherlv_4= '}' )
            // InternalSceneDsl.g:1711:3: () otherlv_1= '{' (otherlv_2= 'mass' ( (lv_mass_3_0= ruleEDouble ) ) )? otherlv_4= '}'
            {
            // InternalSceneDsl.g:1711:3: ()
            // InternalSceneDsl.g:1712:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPhysicParametersAccess().getPhysicParametersAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getPhysicParametersAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSceneDsl.g:1722:3: (otherlv_2= 'mass' ( (lv_mass_3_0= ruleEDouble ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==41) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSceneDsl.g:1723:4: otherlv_2= 'mass' ( (lv_mass_3_0= ruleEDouble ) )
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getPhysicParametersAccess().getMassKeyword_2_0());
                    			
                    // InternalSceneDsl.g:1727:4: ( (lv_mass_3_0= ruleEDouble ) )
                    // InternalSceneDsl.g:1728:5: (lv_mass_3_0= ruleEDouble )
                    {
                    // InternalSceneDsl.g:1728:5: (lv_mass_3_0= ruleEDouble )
                    // InternalSceneDsl.g:1729:6: lv_mass_3_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getPhysicParametersAccess().getMassEDoubleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_mass_3_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPhysicParametersRule());
                    						}
                    						set(
                    							current,
                    							"mass",
                    							lv_mass_3_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPhysicParametersAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhysicParameters"


    // $ANTLR start "entryRuleColor"
    // InternalSceneDsl.g:1755:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalSceneDsl.g:1755:46: (iv_ruleColor= ruleColor EOF )
            // InternalSceneDsl.g:1756:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalSceneDsl.g:1762:1: ruleColor returns [EObject current=null] : ( () otherlv_1= 'color' otherlv_2= '{' (otherlv_3= 'red' ( (lv_red_4_0= ruleEDouble ) ) )? (otherlv_5= 'green' ( (lv_green_6_0= ruleEDouble ) ) )? (otherlv_7= 'blue' ( (lv_blue_8_0= ruleEDouble ) ) )? (otherlv_9= 'alpha' ( (lv_alpha_10_0= ruleEDouble ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_red_4_0 = null;

        AntlrDatatypeRuleToken lv_green_6_0 = null;

        AntlrDatatypeRuleToken lv_blue_8_0 = null;

        AntlrDatatypeRuleToken lv_alpha_10_0 = null;



        	enterRule();

        try {
            // InternalSceneDsl.g:1768:2: ( ( () otherlv_1= 'color' otherlv_2= '{' (otherlv_3= 'red' ( (lv_red_4_0= ruleEDouble ) ) )? (otherlv_5= 'green' ( (lv_green_6_0= ruleEDouble ) ) )? (otherlv_7= 'blue' ( (lv_blue_8_0= ruleEDouble ) ) )? (otherlv_9= 'alpha' ( (lv_alpha_10_0= ruleEDouble ) ) )? otherlv_11= '}' ) )
            // InternalSceneDsl.g:1769:2: ( () otherlv_1= 'color' otherlv_2= '{' (otherlv_3= 'red' ( (lv_red_4_0= ruleEDouble ) ) )? (otherlv_5= 'green' ( (lv_green_6_0= ruleEDouble ) ) )? (otherlv_7= 'blue' ( (lv_blue_8_0= ruleEDouble ) ) )? (otherlv_9= 'alpha' ( (lv_alpha_10_0= ruleEDouble ) ) )? otherlv_11= '}' )
            {
            // InternalSceneDsl.g:1769:2: ( () otherlv_1= 'color' otherlv_2= '{' (otherlv_3= 'red' ( (lv_red_4_0= ruleEDouble ) ) )? (otherlv_5= 'green' ( (lv_green_6_0= ruleEDouble ) ) )? (otherlv_7= 'blue' ( (lv_blue_8_0= ruleEDouble ) ) )? (otherlv_9= 'alpha' ( (lv_alpha_10_0= ruleEDouble ) ) )? otherlv_11= '}' )
            // InternalSceneDsl.g:1770:3: () otherlv_1= 'color' otherlv_2= '{' (otherlv_3= 'red' ( (lv_red_4_0= ruleEDouble ) ) )? (otherlv_5= 'green' ( (lv_green_6_0= ruleEDouble ) ) )? (otherlv_7= 'blue' ( (lv_blue_8_0= ruleEDouble ) ) )? (otherlv_9= 'alpha' ( (lv_alpha_10_0= ruleEDouble ) ) )? otherlv_11= '}'
            {
            // InternalSceneDsl.g:1770:3: ()
            // InternalSceneDsl.g:1771:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColorAccess().getColorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getColorAccess().getColorKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getColorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSceneDsl.g:1785:3: (otherlv_3= 'red' ( (lv_red_4_0= ruleEDouble ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==43) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSceneDsl.g:1786:4: otherlv_3= 'red' ( (lv_red_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getColorAccess().getRedKeyword_3_0());
                    			
                    // InternalSceneDsl.g:1790:4: ( (lv_red_4_0= ruleEDouble ) )
                    // InternalSceneDsl.g:1791:5: (lv_red_4_0= ruleEDouble )
                    {
                    // InternalSceneDsl.g:1791:5: (lv_red_4_0= ruleEDouble )
                    // InternalSceneDsl.g:1792:6: lv_red_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getRedEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_red_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorRule());
                    						}
                    						set(
                    							current,
                    							"red",
                    							lv_red_4_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:1810:3: (otherlv_5= 'green' ( (lv_green_6_0= ruleEDouble ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==44) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSceneDsl.g:1811:4: otherlv_5= 'green' ( (lv_green_6_0= ruleEDouble ) )
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getColorAccess().getGreenKeyword_4_0());
                    			
                    // InternalSceneDsl.g:1815:4: ( (lv_green_6_0= ruleEDouble ) )
                    // InternalSceneDsl.g:1816:5: (lv_green_6_0= ruleEDouble )
                    {
                    // InternalSceneDsl.g:1816:5: (lv_green_6_0= ruleEDouble )
                    // InternalSceneDsl.g:1817:6: lv_green_6_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getGreenEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_green_6_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorRule());
                    						}
                    						set(
                    							current,
                    							"green",
                    							lv_green_6_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:1835:3: (otherlv_7= 'blue' ( (lv_blue_8_0= ruleEDouble ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==45) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSceneDsl.g:1836:4: otherlv_7= 'blue' ( (lv_blue_8_0= ruleEDouble ) )
                    {
                    otherlv_7=(Token)match(input,45,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getColorAccess().getBlueKeyword_5_0());
                    			
                    // InternalSceneDsl.g:1840:4: ( (lv_blue_8_0= ruleEDouble ) )
                    // InternalSceneDsl.g:1841:5: (lv_blue_8_0= ruleEDouble )
                    {
                    // InternalSceneDsl.g:1841:5: (lv_blue_8_0= ruleEDouble )
                    // InternalSceneDsl.g:1842:6: lv_blue_8_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getBlueEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_blue_8_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorRule());
                    						}
                    						set(
                    							current,
                    							"blue",
                    							lv_blue_8_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSceneDsl.g:1860:3: (otherlv_9= 'alpha' ( (lv_alpha_10_0= ruleEDouble ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==46) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSceneDsl.g:1861:4: otherlv_9= 'alpha' ( (lv_alpha_10_0= ruleEDouble ) )
                    {
                    otherlv_9=(Token)match(input,46,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getColorAccess().getAlphaKeyword_6_0());
                    			
                    // InternalSceneDsl.g:1865:4: ( (lv_alpha_10_0= ruleEDouble ) )
                    // InternalSceneDsl.g:1866:5: (lv_alpha_10_0= ruleEDouble )
                    {
                    // InternalSceneDsl.g:1866:5: (lv_alpha_10_0= ruleEDouble )
                    // InternalSceneDsl.g:1867:6: lv_alpha_10_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getAlphaEDoubleParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_alpha_10_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorRule());
                    						}
                    						set(
                    							current,
                    							"alpha",
                    							lv_alpha_10_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getColorAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleTexture"
    // InternalSceneDsl.g:1893:1: entryRuleTexture returns [EObject current=null] : iv_ruleTexture= ruleTexture EOF ;
    public final EObject entryRuleTexture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTexture = null;


        try {
            // InternalSceneDsl.g:1893:48: (iv_ruleTexture= ruleTexture EOF )
            // InternalSceneDsl.g:1894:2: iv_ruleTexture= ruleTexture EOF
            {
             newCompositeNode(grammarAccess.getTextureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTexture=ruleTexture();

            state._fsp--;

             current =iv_ruleTexture; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTexture"


    // $ANTLR start "ruleTexture"
    // InternalSceneDsl.g:1900:1: ruleTexture returns [EObject current=null] : ( () otherlv_1= 'texture' otherlv_2= '{' (otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleTexture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_path_4_0 = null;



        	enterRule();

        try {
            // InternalSceneDsl.g:1906:2: ( ( () otherlv_1= 'texture' otherlv_2= '{' (otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalSceneDsl.g:1907:2: ( () otherlv_1= 'texture' otherlv_2= '{' (otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalSceneDsl.g:1907:2: ( () otherlv_1= 'texture' otherlv_2= '{' (otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalSceneDsl.g:1908:3: () otherlv_1= 'texture' otherlv_2= '{' (otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalSceneDsl.g:1908:3: ()
            // InternalSceneDsl.g:1909:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextureAccess().getTextureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTextureAccess().getTextureKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getTextureAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSceneDsl.g:1923:3: (otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==16) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalSceneDsl.g:1924:4: otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTextureAccess().getPathKeyword_3_0());
                    			
                    // InternalSceneDsl.g:1928:4: ( (lv_path_4_0= ruleEString ) )
                    // InternalSceneDsl.g:1929:5: (lv_path_4_0= ruleEString )
                    {
                    // InternalSceneDsl.g:1929:5: (lv_path_4_0= ruleEString )
                    // InternalSceneDsl.g:1930:6: lv_path_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextureAccess().getPathEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_path_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextureRule());
                    						}
                    						set(
                    							current,
                    							"path",
                    							lv_path_4_0,
                    							"hu.sze.aut.robotlabor.scene.description.SceneDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTextureAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTexture"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000001C448000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001C44C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000003A4000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000006000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000324000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000304000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000840000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003B24000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003324000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002324000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000013A4000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001324000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001B24000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000060004000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000380004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000300004000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001C00004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001800004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000004000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000780000004000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000700000004000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000600000004000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000004000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000014000L});

}