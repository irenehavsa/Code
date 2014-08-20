package org.xtext.tesis.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.tesis.services.SALGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSALParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "': CONTEXT='", "'BEGIN'", "'END'", "': TYPE={'", "'};'", "': MODULE='", "'INPUT'", "'OUTPUT'", "'LOCAL'", "'DEFINITION'", "'INITIALIZATION'", "'TRANSITION ['", "']'", "':'", "'['", "'..'", "'TO BE CONTINUED'", "'='", "';'", "'-->'", "'\\'='"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSALParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSALParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSALParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g"; }



     	private SALGrammarAccess grammarAccess;
     	
        public InternalSALParser(TokenStream input, SALGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Context";	
       	}
       	
       	@Override
       	protected SALGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleContext"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:67:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:68:2: (iv_ruleContext= ruleContext EOF )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:69:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_ruleContext_in_entryRuleContext75);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContext85); 

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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:76:1: ruleContext returns [EObject current=null] : ( ( (lv_contextName_0_0= RULE_STRING ) ) otherlv_1= ': CONTEXT=' ( (lv_body_2_0= ruleBody ) ) ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token lv_contextName_0_0=null;
        Token otherlv_1=null;
        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:79:28: ( ( ( (lv_contextName_0_0= RULE_STRING ) ) otherlv_1= ': CONTEXT=' ( (lv_body_2_0= ruleBody ) ) ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:80:1: ( ( (lv_contextName_0_0= RULE_STRING ) ) otherlv_1= ': CONTEXT=' ( (lv_body_2_0= ruleBody ) ) )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:80:1: ( ( (lv_contextName_0_0= RULE_STRING ) ) otherlv_1= ': CONTEXT=' ( (lv_body_2_0= ruleBody ) ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:80:2: ( (lv_contextName_0_0= RULE_STRING ) ) otherlv_1= ': CONTEXT=' ( (lv_body_2_0= ruleBody ) )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:80:2: ( (lv_contextName_0_0= RULE_STRING ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:81:1: (lv_contextName_0_0= RULE_STRING )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:81:1: (lv_contextName_0_0= RULE_STRING )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:82:3: lv_contextName_0_0= RULE_STRING
            {
            lv_contextName_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContext127); 

            			newLeafNode(lv_contextName_0_0, grammarAccess.getContextAccess().getContextNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"contextName",
                    		lv_contextName_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleContext144); 

                	newLeafNode(otherlv_1, grammarAccess.getContextAccess().getCONTEXTKeyword_1());
                
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:102:1: ( (lv_body_2_0= ruleBody ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:103:1: (lv_body_2_0= ruleBody )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:103:1: (lv_body_2_0= ruleBody )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:104:3: lv_body_2_0= ruleBody
            {
             
            	        newCompositeNode(grammarAccess.getContextAccess().getBodyBodyParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBody_in_ruleContext165);
            lv_body_2_0=ruleBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContextRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_2_0, 
                    		"Body");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleBody"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:128:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:129:2: (iv_ruleBody= ruleBody EOF )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:130:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody201);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody211); 

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
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:137:1: ruleBody returns [EObject current=null] : (otherlv_0= 'BEGIN' ( (lv_types_1_0= ruleTypeDeclaration ) ) ( (lv_module_2_0= ruleModuleDeclaration ) ) otherlv_3= 'END' ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_types_1_0 = null;

        EObject lv_module_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:140:28: ( (otherlv_0= 'BEGIN' ( (lv_types_1_0= ruleTypeDeclaration ) ) ( (lv_module_2_0= ruleModuleDeclaration ) ) otherlv_3= 'END' ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:141:1: (otherlv_0= 'BEGIN' ( (lv_types_1_0= ruleTypeDeclaration ) ) ( (lv_module_2_0= ruleModuleDeclaration ) ) otherlv_3= 'END' )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:141:1: (otherlv_0= 'BEGIN' ( (lv_types_1_0= ruleTypeDeclaration ) ) ( (lv_module_2_0= ruleModuleDeclaration ) ) otherlv_3= 'END' )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:141:3: otherlv_0= 'BEGIN' ( (lv_types_1_0= ruleTypeDeclaration ) ) ( (lv_module_2_0= ruleModuleDeclaration ) ) otherlv_3= 'END'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleBody248); 

                	newLeafNode(otherlv_0, grammarAccess.getBodyAccess().getBEGINKeyword_0());
                
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:145:1: ( (lv_types_1_0= ruleTypeDeclaration ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:146:1: (lv_types_1_0= ruleTypeDeclaration )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:146:1: (lv_types_1_0= ruleTypeDeclaration )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:147:3: lv_types_1_0= ruleTypeDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getBodyAccess().getTypesTypeDeclarationParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeDeclaration_in_ruleBody269);
            lv_types_1_0=ruleTypeDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	        }
                   		add(
                   			current, 
                   			"types",
                    		lv_types_1_0, 
                    		"TypeDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:163:2: ( (lv_module_2_0= ruleModuleDeclaration ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:164:1: (lv_module_2_0= ruleModuleDeclaration )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:164:1: (lv_module_2_0= ruleModuleDeclaration )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:165:3: lv_module_2_0= ruleModuleDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getBodyAccess().getModuleModuleDeclarationParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleModuleDeclaration_in_ruleBody290);
            lv_module_2_0=ruleModuleDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	        }
                   		set(
                   			current, 
                   			"module",
                    		lv_module_2_0, 
                    		"ModuleDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleBody302); 

                	newLeafNode(otherlv_3, grammarAccess.getBodyAccess().getENDKeyword_3());
                

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
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleTypeDeclaration"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:193:1: entryRuleTypeDeclaration returns [EObject current=null] : iv_ruleTypeDeclaration= ruleTypeDeclaration EOF ;
    public final EObject entryRuleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclaration = null;


        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:194:2: (iv_ruleTypeDeclaration= ruleTypeDeclaration EOF )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:195:2: iv_ruleTypeDeclaration= ruleTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getTypeDeclarationRule()); 
            pushFollow(FOLLOW_ruleTypeDeclaration_in_entryRuleTypeDeclaration338);
            iv_ruleTypeDeclaration=ruleTypeDeclaration();

            state._fsp--;

             current =iv_ruleTypeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDeclaration348); 

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
    // $ANTLR end "entryRuleTypeDeclaration"


    // $ANTLR start "ruleTypeDeclaration"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:202:1: ruleTypeDeclaration returns [EObject current=null] : ( ( (lv_typeName_0_0= RULE_STRING ) ) otherlv_1= ': TYPE={' ( (lv_typeValues_2_0= RULE_STRING ) ) otherlv_3= '};' ) ;
    public final EObject ruleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_0=null;
        Token otherlv_1=null;
        Token lv_typeValues_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:205:28: ( ( ( (lv_typeName_0_0= RULE_STRING ) ) otherlv_1= ': TYPE={' ( (lv_typeValues_2_0= RULE_STRING ) ) otherlv_3= '};' ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:206:1: ( ( (lv_typeName_0_0= RULE_STRING ) ) otherlv_1= ': TYPE={' ( (lv_typeValues_2_0= RULE_STRING ) ) otherlv_3= '};' )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:206:1: ( ( (lv_typeName_0_0= RULE_STRING ) ) otherlv_1= ': TYPE={' ( (lv_typeValues_2_0= RULE_STRING ) ) otherlv_3= '};' )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:206:2: ( (lv_typeName_0_0= RULE_STRING ) ) otherlv_1= ': TYPE={' ( (lv_typeValues_2_0= RULE_STRING ) ) otherlv_3= '};'
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:206:2: ( (lv_typeName_0_0= RULE_STRING ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:207:1: (lv_typeName_0_0= RULE_STRING )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:207:1: (lv_typeName_0_0= RULE_STRING )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:208:3: lv_typeName_0_0= RULE_STRING
            {
            lv_typeName_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeDeclaration390); 

            			newLeafNode(lv_typeName_0_0, grammarAccess.getTypeDeclarationAccess().getTypeNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"typeName",
                    		lv_typeName_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleTypeDeclaration407); 

                	newLeafNode(otherlv_1, grammarAccess.getTypeDeclarationAccess().getTYPEKeyword_1());
                
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:228:1: ( (lv_typeValues_2_0= RULE_STRING ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:229:1: (lv_typeValues_2_0= RULE_STRING )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:229:1: (lv_typeValues_2_0= RULE_STRING )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:230:3: lv_typeValues_2_0= RULE_STRING
            {
            lv_typeValues_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeDeclaration424); 

            			newLeafNode(lv_typeValues_2_0, grammarAccess.getTypeDeclarationAccess().getTypeValuesSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeDeclarationRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"typeValues",
                    		lv_typeValues_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleTypeDeclaration441); 

                	newLeafNode(otherlv_3, grammarAccess.getTypeDeclarationAccess().getRightCurlyBracketSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleTypeDeclaration"


    // $ANTLR start "entryRuleModuleDeclaration"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:258:1: entryRuleModuleDeclaration returns [EObject current=null] : iv_ruleModuleDeclaration= ruleModuleDeclaration EOF ;
    public final EObject entryRuleModuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleDeclaration = null;


        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:259:2: (iv_ruleModuleDeclaration= ruleModuleDeclaration EOF )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:260:2: iv_ruleModuleDeclaration= ruleModuleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getModuleDeclarationRule()); 
            pushFollow(FOLLOW_ruleModuleDeclaration_in_entryRuleModuleDeclaration477);
            iv_ruleModuleDeclaration=ruleModuleDeclaration();

            state._fsp--;

             current =iv_ruleModuleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleDeclaration487); 

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
    // $ANTLR end "entryRuleModuleDeclaration"


    // $ANTLR start "ruleModuleDeclaration"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:267:1: ruleModuleDeclaration returns [EObject current=null] : ( ( (lv_moduleName_0_0= RULE_STRING ) ) otherlv_1= ': MODULE=' ( (lv_module_2_0= ruleModule ) ) ) ;
    public final EObject ruleModuleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_moduleName_0_0=null;
        Token otherlv_1=null;
        EObject lv_module_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:270:28: ( ( ( (lv_moduleName_0_0= RULE_STRING ) ) otherlv_1= ': MODULE=' ( (lv_module_2_0= ruleModule ) ) ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:271:1: ( ( (lv_moduleName_0_0= RULE_STRING ) ) otherlv_1= ': MODULE=' ( (lv_module_2_0= ruleModule ) ) )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:271:1: ( ( (lv_moduleName_0_0= RULE_STRING ) ) otherlv_1= ': MODULE=' ( (lv_module_2_0= ruleModule ) ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:271:2: ( (lv_moduleName_0_0= RULE_STRING ) ) otherlv_1= ': MODULE=' ( (lv_module_2_0= ruleModule ) )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:271:2: ( (lv_moduleName_0_0= RULE_STRING ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:272:1: (lv_moduleName_0_0= RULE_STRING )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:272:1: (lv_moduleName_0_0= RULE_STRING )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:273:3: lv_moduleName_0_0= RULE_STRING
            {
            lv_moduleName_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModuleDeclaration529); 

            			newLeafNode(lv_moduleName_0_0, grammarAccess.getModuleDeclarationAccess().getModuleNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModuleDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"moduleName",
                    		lv_moduleName_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleModuleDeclaration546); 

                	newLeafNode(otherlv_1, grammarAccess.getModuleDeclarationAccess().getMODULEKeyword_1());
                
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:293:1: ( (lv_module_2_0= ruleModule ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:294:1: (lv_module_2_0= ruleModule )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:294:1: (lv_module_2_0= ruleModule )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:295:3: lv_module_2_0= ruleModule
            {
             
            	        newCompositeNode(grammarAccess.getModuleDeclarationAccess().getModuleModuleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleModule_in_ruleModuleDeclaration567);
            lv_module_2_0=ruleModule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModuleDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"module",
                    		lv_module_2_0, 
                    		"Module");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleModuleDeclaration"


    // $ANTLR start "entryRuleModule"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:319:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:320:2: (iv_ruleModule= ruleModule EOF )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:321:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule603);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule613); 

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:328:1: ruleModule returns [EObject current=null] : (otherlv_0= 'BEGIN' ( (lv_declaration_1_0= ruleDeclarations ) ) otherlv_2= 'END' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_declaration_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:331:28: ( (otherlv_0= 'BEGIN' ( (lv_declaration_1_0= ruleDeclarations ) ) otherlv_2= 'END' ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:332:1: (otherlv_0= 'BEGIN' ( (lv_declaration_1_0= ruleDeclarations ) ) otherlv_2= 'END' )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:332:1: (otherlv_0= 'BEGIN' ( (lv_declaration_1_0= ruleDeclarations ) ) otherlv_2= 'END' )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:332:3: otherlv_0= 'BEGIN' ( (lv_declaration_1_0= ruleDeclarations ) ) otherlv_2= 'END'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleModule650); 

                	newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getBEGINKeyword_0());
                
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:336:1: ( (lv_declaration_1_0= ruleDeclarations ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:337:1: (lv_declaration_1_0= ruleDeclarations )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:337:1: (lv_declaration_1_0= ruleDeclarations )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:338:3: lv_declaration_1_0= ruleDeclarations
            {
             
            	        newCompositeNode(grammarAccess.getModuleAccess().getDeclarationDeclarationsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDeclarations_in_ruleModule671);
            lv_declaration_1_0=ruleDeclarations();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	        }
                   		add(
                   			current, 
                   			"declaration",
                    		lv_declaration_1_0, 
                    		"Declarations");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleModule683); 

                	newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getENDKeyword_2());
                

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleDeclarations"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:366:1: entryRuleDeclarations returns [EObject current=null] : iv_ruleDeclarations= ruleDeclarations EOF ;
    public final EObject entryRuleDeclarations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarations = null;


        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:367:2: (iv_ruleDeclarations= ruleDeclarations EOF )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:368:2: iv_ruleDeclarations= ruleDeclarations EOF
            {
             newCompositeNode(grammarAccess.getDeclarationsRule()); 
            pushFollow(FOLLOW_ruleDeclarations_in_entryRuleDeclarations719);
            iv_ruleDeclarations=ruleDeclarations();

            state._fsp--;

             current =iv_ruleDeclarations; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarations729); 

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
    // $ANTLR end "entryRuleDeclarations"


    // $ANTLR start "ruleDeclarations"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:375:1: ruleDeclarations returns [EObject current=null] : ( (otherlv_0= 'INPUT' ( (lv_variableDeclarations_1_0= ruleVarDecl ) ) ) | (otherlv_2= 'OUTPUT' ( (lv_variableDeclarations_3_0= ruleVarDecl ) ) ) | (otherlv_4= 'LOCAL' ( (lv_variableDeclarations_5_0= ruleVarDecl ) ) ) | (otherlv_6= 'DEFINITION' ( (lv_definitions_7_0= ruleDefinition ) ) ) | (otherlv_8= 'INITIALIZATION' ( (lv_initialisations_9_0= ruleInitialisation ) ) ) | (otherlv_10= 'TRANSITION [' ( (lv_transitions_11_0= ruleTransition ) ) otherlv_12= ']' ) ) ;
    public final EObject ruleDeclarations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_variableDeclarations_1_0 = null;

        EObject lv_variableDeclarations_3_0 = null;

        EObject lv_variableDeclarations_5_0 = null;

        AntlrDatatypeRuleToken lv_definitions_7_0 = null;

        EObject lv_initialisations_9_0 = null;

        EObject lv_transitions_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:378:28: ( ( (otherlv_0= 'INPUT' ( (lv_variableDeclarations_1_0= ruleVarDecl ) ) ) | (otherlv_2= 'OUTPUT' ( (lv_variableDeclarations_3_0= ruleVarDecl ) ) ) | (otherlv_4= 'LOCAL' ( (lv_variableDeclarations_5_0= ruleVarDecl ) ) ) | (otherlv_6= 'DEFINITION' ( (lv_definitions_7_0= ruleDefinition ) ) ) | (otherlv_8= 'INITIALIZATION' ( (lv_initialisations_9_0= ruleInitialisation ) ) ) | (otherlv_10= 'TRANSITION [' ( (lv_transitions_11_0= ruleTransition ) ) otherlv_12= ']' ) ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:379:1: ( (otherlv_0= 'INPUT' ( (lv_variableDeclarations_1_0= ruleVarDecl ) ) ) | (otherlv_2= 'OUTPUT' ( (lv_variableDeclarations_3_0= ruleVarDecl ) ) ) | (otherlv_4= 'LOCAL' ( (lv_variableDeclarations_5_0= ruleVarDecl ) ) ) | (otherlv_6= 'DEFINITION' ( (lv_definitions_7_0= ruleDefinition ) ) ) | (otherlv_8= 'INITIALIZATION' ( (lv_initialisations_9_0= ruleInitialisation ) ) ) | (otherlv_10= 'TRANSITION [' ( (lv_transitions_11_0= ruleTransition ) ) otherlv_12= ']' ) )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:379:1: ( (otherlv_0= 'INPUT' ( (lv_variableDeclarations_1_0= ruleVarDecl ) ) ) | (otherlv_2= 'OUTPUT' ( (lv_variableDeclarations_3_0= ruleVarDecl ) ) ) | (otherlv_4= 'LOCAL' ( (lv_variableDeclarations_5_0= ruleVarDecl ) ) ) | (otherlv_6= 'DEFINITION' ( (lv_definitions_7_0= ruleDefinition ) ) ) | (otherlv_8= 'INITIALIZATION' ( (lv_initialisations_9_0= ruleInitialisation ) ) ) | (otherlv_10= 'TRANSITION [' ( (lv_transitions_11_0= ruleTransition ) ) otherlv_12= ']' ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            case 20:
                {
                alt1=4;
                }
                break;
            case 21:
                {
                alt1=5;
                }
                break;
            case 22:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:379:2: (otherlv_0= 'INPUT' ( (lv_variableDeclarations_1_0= ruleVarDecl ) ) )
                    {
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:379:2: (otherlv_0= 'INPUT' ( (lv_variableDeclarations_1_0= ruleVarDecl ) ) )
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:379:4: otherlv_0= 'INPUT' ( (lv_variableDeclarations_1_0= ruleVarDecl ) )
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleDeclarations767); 

                        	newLeafNode(otherlv_0, grammarAccess.getDeclarationsAccess().getINPUTKeyword_0_0());
                        
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:383:1: ( (lv_variableDeclarations_1_0= ruleVarDecl ) )
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:384:1: (lv_variableDeclarations_1_0= ruleVarDecl )
                    {
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:384:1: (lv_variableDeclarations_1_0= ruleVarDecl )
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:385:3: lv_variableDeclarations_1_0= ruleVarDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationsAccess().getVariableDeclarationsVarDeclParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVarDecl_in_ruleDeclarations788);
                    lv_variableDeclarations_1_0=ruleVarDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeclarationsRule());
                    	        }
                           		add(
                           			current, 
                           			"variableDeclarations",
                            		lv_variableDeclarations_1_0, 
                            		"VarDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:402:6: (otherlv_2= 'OUTPUT' ( (lv_variableDeclarations_3_0= ruleVarDecl ) ) )
                    {
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:402:6: (otherlv_2= 'OUTPUT' ( (lv_variableDeclarations_3_0= ruleVarDecl ) ) )
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:402:8: otherlv_2= 'OUTPUT' ( (lv_variableDeclarations_3_0= ruleVarDecl ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleDeclarations808); 

                        	newLeafNode(otherlv_2, grammarAccess.getDeclarationsAccess().getOUTPUTKeyword_1_0());
                        
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:406:1: ( (lv_variableDeclarations_3_0= ruleVarDecl ) )
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:407:1: (lv_variableDeclarations_3_0= ruleVarDecl )
                    {
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:407:1: (lv_variableDeclarations_3_0= ruleVarDecl )
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:408:3: lv_variableDeclarations_3_0= ruleVarDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationsAccess().getVariableDeclarationsVarDeclParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVarDecl_in_ruleDeclarations829);
                    lv_variableDeclarations_3_0=ruleVarDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeclarationsRule());
                    	        }
                           		add(
                           			current, 
                           			"variableDeclarations",
                            		lv_variableDeclarations_3_0, 
                            		"VarDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:425:6: (otherlv_4= 'LOCAL' ( (lv_variableDeclarations_5_0= ruleVarDecl ) ) )
                    {
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:425:6: (otherlv_4= 'LOCAL' ( (lv_variableDeclarations_5_0= ruleVarDecl ) ) )
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:425:8: otherlv_4= 'LOCAL' ( (lv_variableDeclarations_5_0= ruleVarDecl ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleDeclarations849); 

                        	newLeafNode(otherlv_4, grammarAccess.getDeclarationsAccess().getLOCALKeyword_2_0());
                        
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:429:1: ( (lv_variableDeclarations_5_0= ruleVarDecl ) )
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:430:1: (lv_variableDeclarations_5_0= ruleVarDecl )
                    {
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:430:1: (lv_variableDeclarations_5_0= ruleVarDecl )
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:431:3: lv_variableDeclarations_5_0= ruleVarDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationsAccess().getVariableDeclarationsVarDeclParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVarDecl_in_ruleDeclarations870);
                    lv_variableDeclarations_5_0=ruleVarDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeclarationsRule());
                    	        }
                           		add(
                           			current, 
                           			"variableDeclarations",
                            		lv_variableDeclarations_5_0, 
                            		"VarDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:448:6: (otherlv_6= 'DEFINITION' ( (lv_definitions_7_0= ruleDefinition ) ) )
                    {
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:448:6: (otherlv_6= 'DEFINITION' ( (lv_definitions_7_0= ruleDefinition ) ) )
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:448:8: otherlv_6= 'DEFINITION' ( (lv_definitions_7_0= ruleDefinition ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleDeclarations890); 

                        	newLeafNode(otherlv_6, grammarAccess.getDeclarationsAccess().getDEFINITIONKeyword_3_0());
                        
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:452:1: ( (lv_definitions_7_0= ruleDefinition ) )
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:453:1: (lv_definitions_7_0= ruleDefinition )
                    {
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:453:1: (lv_definitions_7_0= ruleDefinition )
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:454:3: lv_definitions_7_0= ruleDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationsAccess().getDefinitionsDefinitionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDefinition_in_ruleDeclarations911);
                    lv_definitions_7_0=ruleDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeclarationsRule());
                    	        }
                           		add(
                           			current, 
                           			"definitions",
                            		lv_definitions_7_0, 
                            		"Definition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:471:6: (otherlv_8= 'INITIALIZATION' ( (lv_initialisations_9_0= ruleInitialisation ) ) )
                    {
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:471:6: (otherlv_8= 'INITIALIZATION' ( (lv_initialisations_9_0= ruleInitialisation ) ) )
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:471:8: otherlv_8= 'INITIALIZATION' ( (lv_initialisations_9_0= ruleInitialisation ) )
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleDeclarations931); 

                        	newLeafNode(otherlv_8, grammarAccess.getDeclarationsAccess().getINITIALIZATIONKeyword_4_0());
                        
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:475:1: ( (lv_initialisations_9_0= ruleInitialisation ) )
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:476:1: (lv_initialisations_9_0= ruleInitialisation )
                    {
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:476:1: (lv_initialisations_9_0= ruleInitialisation )
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:477:3: lv_initialisations_9_0= ruleInitialisation
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationsAccess().getInitialisationsInitialisationParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInitialisation_in_ruleDeclarations952);
                    lv_initialisations_9_0=ruleInitialisation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeclarationsRule());
                    	        }
                           		add(
                           			current, 
                           			"initialisations",
                            		lv_initialisations_9_0, 
                            		"Initialisation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:494:6: (otherlv_10= 'TRANSITION [' ( (lv_transitions_11_0= ruleTransition ) ) otherlv_12= ']' )
                    {
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:494:6: (otherlv_10= 'TRANSITION [' ( (lv_transitions_11_0= ruleTransition ) ) otherlv_12= ']' )
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:494:8: otherlv_10= 'TRANSITION [' ( (lv_transitions_11_0= ruleTransition ) ) otherlv_12= ']'
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleDeclarations972); 

                        	newLeafNode(otherlv_10, grammarAccess.getDeclarationsAccess().getTRANSITIONKeyword_5_0());
                        
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:498:1: ( (lv_transitions_11_0= ruleTransition ) )
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:499:1: (lv_transitions_11_0= ruleTransition )
                    {
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:499:1: (lv_transitions_11_0= ruleTransition )
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:500:3: lv_transitions_11_0= ruleTransition
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationsAccess().getTransitionsTransitionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTransition_in_ruleDeclarations993);
                    lv_transitions_11_0=ruleTransition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeclarationsRule());
                    	        }
                           		add(
                           			current, 
                           			"transitions",
                            		lv_transitions_11_0, 
                            		"Transition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleDeclarations1005); 

                        	newLeafNode(otherlv_12, grammarAccess.getDeclarationsAccess().getRightSquareBracketKeyword_5_2());
                        

                    }


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
    // $ANTLR end "ruleDeclarations"


    // $ANTLR start "entryRuleVarDecl"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:528:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:529:2: (iv_ruleVarDecl= ruleVarDecl EOF )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:530:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             newCompositeNode(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl1042);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl1052); 

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
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:537:1: ruleVarDecl returns [EObject current=null] : ( ( (lv_variableName_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_valueSet_2_0= ruleValueSet ) ) ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_variableName_0_0=null;
        Token otherlv_1=null;
        EObject lv_valueSet_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:540:28: ( ( ( (lv_variableName_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_valueSet_2_0= ruleValueSet ) ) ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:541:1: ( ( (lv_variableName_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_valueSet_2_0= ruleValueSet ) ) )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:541:1: ( ( (lv_variableName_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_valueSet_2_0= ruleValueSet ) ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:541:2: ( (lv_variableName_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_valueSet_2_0= ruleValueSet ) )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:541:2: ( (lv_variableName_0_0= RULE_STRING ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:542:1: (lv_variableName_0_0= RULE_STRING )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:542:1: (lv_variableName_0_0= RULE_STRING )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:543:3: lv_variableName_0_0= RULE_STRING
            {
            lv_variableName_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVarDecl1094); 

            			newLeafNode(lv_variableName_0_0, grammarAccess.getVarDeclAccess().getVariableNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVarDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variableName",
                    		lv_variableName_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleVarDecl1111); 

                	newLeafNode(otherlv_1, grammarAccess.getVarDeclAccess().getColonKeyword_1());
                
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:563:1: ( (lv_valueSet_2_0= ruleValueSet ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:564:1: (lv_valueSet_2_0= ruleValueSet )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:564:1: (lv_valueSet_2_0= ruleValueSet )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:565:3: lv_valueSet_2_0= ruleValueSet
            {
             
            	        newCompositeNode(grammarAccess.getVarDeclAccess().getValueSetValueSetParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValueSet_in_ruleVarDecl1132);
            lv_valueSet_2_0=ruleValueSet();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVarDeclRule());
            	        }
                   		set(
                   			current, 
                   			"valueSet",
                    		lv_valueSet_2_0, 
                    		"ValueSet");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleValueSet"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:589:1: entryRuleValueSet returns [EObject current=null] : iv_ruleValueSet= ruleValueSet EOF ;
    public final EObject entryRuleValueSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSet = null;


        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:590:2: (iv_ruleValueSet= ruleValueSet EOF )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:591:2: iv_ruleValueSet= ruleValueSet EOF
            {
             newCompositeNode(grammarAccess.getValueSetRule()); 
            pushFollow(FOLLOW_ruleValueSet_in_entryRuleValueSet1168);
            iv_ruleValueSet=ruleValueSet();

            state._fsp--;

             current =iv_ruleValueSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueSet1178); 

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
    // $ANTLR end "entryRuleValueSet"


    // $ANTLR start "ruleValueSet"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:598:1: ruleValueSet returns [EObject current=null] : (this_Scalar_0= ruleScalar | this_Subrange_1= ruleSubrange ) ;
    public final EObject ruleValueSet() throws RecognitionException {
        EObject current = null;

        EObject this_Scalar_0 = null;

        EObject this_Subrange_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:601:28: ( (this_Scalar_0= ruleScalar | this_Subrange_1= ruleSubrange ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:602:1: (this_Scalar_0= ruleScalar | this_Subrange_1= ruleSubrange )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:602:1: (this_Scalar_0= ruleScalar | this_Subrange_1= ruleSubrange )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:603:5: this_Scalar_0= ruleScalar
                    {
                     
                            newCompositeNode(grammarAccess.getValueSetAccess().getScalarParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleScalar_in_ruleValueSet1225);
                    this_Scalar_0=ruleScalar();

                    state._fsp--;

                     
                            current = this_Scalar_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:613:5: this_Subrange_1= ruleSubrange
                    {
                     
                            newCompositeNode(grammarAccess.getValueSetAccess().getSubrangeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSubrange_in_ruleValueSet1252);
                    this_Subrange_1=ruleSubrange();

                    state._fsp--;

                     
                            current = this_Subrange_1; 
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
    // $ANTLR end "ruleValueSet"


    // $ANTLR start "entryRuleScalar"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:629:1: entryRuleScalar returns [EObject current=null] : iv_ruleScalar= ruleScalar EOF ;
    public final EObject entryRuleScalar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalar = null;


        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:630:2: (iv_ruleScalar= ruleScalar EOF )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:631:2: iv_ruleScalar= ruleScalar EOF
            {
             newCompositeNode(grammarAccess.getScalarRule()); 
            pushFollow(FOLLOW_ruleScalar_in_entryRuleScalar1287);
            iv_ruleScalar=ruleScalar();

            state._fsp--;

             current =iv_ruleScalar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalar1297); 

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
    // $ANTLR end "entryRuleScalar"


    // $ANTLR start "ruleScalar"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:638:1: ruleScalar returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleScalar() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:641:28: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:642:1: ( (lv_name_0_0= RULE_STRING ) )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:642:1: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:643:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:643:1: (lv_name_0_0= RULE_STRING )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:644:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScalar1338); 

            			newLeafNode(lv_name_0_0, grammarAccess.getScalarAccess().getNameSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScalarRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleScalar"


    // $ANTLR start "entryRuleSubrange"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:668:1: entryRuleSubrange returns [EObject current=null] : iv_ruleSubrange= ruleSubrange EOF ;
    public final EObject entryRuleSubrange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrange = null;


        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:669:2: (iv_ruleSubrange= ruleSubrange EOF )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:670:2: iv_ruleSubrange= ruleSubrange EOF
            {
             newCompositeNode(grammarAccess.getSubrangeRule()); 
            pushFollow(FOLLOW_ruleSubrange_in_entryRuleSubrange1378);
            iv_ruleSubrange=ruleSubrange();

            state._fsp--;

             current =iv_ruleSubrange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubrange1388); 

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
    // $ANTLR end "entryRuleSubrange"


    // $ANTLR start "ruleSubrange"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:677:1: ruleSubrange returns [EObject current=null] : (otherlv_0= '[' ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_upperBound_3_0= RULE_INT ) ) otherlv_4= ']' ) ;
    public final EObject ruleSubrange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lowerBound_1_0=null;
        Token otherlv_2=null;
        Token lv_upperBound_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:680:28: ( (otherlv_0= '[' ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_upperBound_3_0= RULE_INT ) ) otherlv_4= ']' ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:681:1: (otherlv_0= '[' ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_upperBound_3_0= RULE_INT ) ) otherlv_4= ']' )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:681:1: (otherlv_0= '[' ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_upperBound_3_0= RULE_INT ) ) otherlv_4= ']' )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:681:3: otherlv_0= '[' ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_upperBound_3_0= RULE_INT ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleSubrange1425); 

                	newLeafNode(otherlv_0, grammarAccess.getSubrangeAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:685:1: ( (lv_lowerBound_1_0= RULE_INT ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:686:1: (lv_lowerBound_1_0= RULE_INT )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:686:1: (lv_lowerBound_1_0= RULE_INT )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:687:3: lv_lowerBound_1_0= RULE_INT
            {
            lv_lowerBound_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSubrange1442); 

            			newLeafNode(lv_lowerBound_1_0, grammarAccess.getSubrangeAccess().getLowerBoundINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubrangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lowerBound",
                    		lv_lowerBound_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleSubrange1459); 

                	newLeafNode(otherlv_2, grammarAccess.getSubrangeAccess().getFullStopFullStopKeyword_2());
                
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:707:1: ( (lv_upperBound_3_0= RULE_INT ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:708:1: (lv_upperBound_3_0= RULE_INT )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:708:1: (lv_upperBound_3_0= RULE_INT )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:709:3: lv_upperBound_3_0= RULE_INT
            {
            lv_upperBound_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSubrange1476); 

            			newLeafNode(lv_upperBound_3_0, grammarAccess.getSubrangeAccess().getUpperBoundINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubrangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"upperBound",
                    		lv_upperBound_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleSubrange1493); 

                	newLeafNode(otherlv_4, grammarAccess.getSubrangeAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleSubrange"


    // $ANTLR start "entryRuleDefinition"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:737:1: entryRuleDefinition returns [String current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final String entryRuleDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefinition = null;


        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:738:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:739:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition1530);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition1541); 

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:746:1: ruleDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'TO BE CONTINUED' ;
    public final AntlrDatatypeRuleToken ruleDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:749:28: (kw= 'TO BE CONTINUED' )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:751:2: kw= 'TO BE CONTINUED'
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleDefinition1578); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDefinitionAccess().getTOBECONTINUEDKeyword()); 
                

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleInitialisation"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:764:1: entryRuleInitialisation returns [EObject current=null] : iv_ruleInitialisation= ruleInitialisation EOF ;
    public final EObject entryRuleInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialisation = null;


        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:765:2: (iv_ruleInitialisation= ruleInitialisation EOF )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:766:2: iv_ruleInitialisation= ruleInitialisation EOF
            {
             newCompositeNode(grammarAccess.getInitialisationRule()); 
            pushFollow(FOLLOW_ruleInitialisation_in_entryRuleInitialisation1617);
            iv_ruleInitialisation=ruleInitialisation();

            state._fsp--;

             current =iv_ruleInitialisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitialisation1627); 

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
    // $ANTLR end "entryRuleInitialisation"


    // $ANTLR start "ruleInitialisation"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:773:1: ruleInitialisation returns [EObject current=null] : ( ( (lv_variable_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleInitialisation() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:776:28: ( ( ( (lv_variable_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:777:1: ( ( (lv_variable_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:777:1: ( ( (lv_variable_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:777:2: ( (lv_variable_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:777:2: ( (lv_variable_0_0= RULE_STRING ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:778:1: (lv_variable_0_0= RULE_STRING )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:778:1: (lv_variable_0_0= RULE_STRING )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:779:3: lv_variable_0_0= RULE_STRING
            {
            lv_variable_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInitialisation1669); 

            			newLeafNode(lv_variable_0_0, grammarAccess.getInitialisationAccess().getVariableSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInitialisationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variable",
                    		lv_variable_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleInitialisation1686); 

                	newLeafNode(otherlv_1, grammarAccess.getInitialisationAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:799:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:800:1: (lv_value_2_0= RULE_STRING )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:800:1: (lv_value_2_0= RULE_STRING )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:801:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInitialisation1703); 

            			newLeafNode(lv_value_2_0, grammarAccess.getInitialisationAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInitialisationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleInitialisation1720); 

                	newLeafNode(otherlv_3, grammarAccess.getInitialisationAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleInitialisation"


    // $ANTLR start "entryRuleTransition"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:829:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:830:2: (iv_ruleTransition= ruleTransition EOF )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:831:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition1756);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition1766); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:838:1: ruleTransition returns [EObject current=null] : ( ( (lv_transitionNumer_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_guards_2_0= ruleGuard ) )* otherlv_3= '-->' ( (lv_assignments_4_0= ruleAssignment ) )* ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_transitionNumer_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_guards_2_0 = null;

        EObject lv_assignments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:841:28: ( ( ( (lv_transitionNumer_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_guards_2_0= ruleGuard ) )* otherlv_3= '-->' ( (lv_assignments_4_0= ruleAssignment ) )* ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:842:1: ( ( (lv_transitionNumer_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_guards_2_0= ruleGuard ) )* otherlv_3= '-->' ( (lv_assignments_4_0= ruleAssignment ) )* )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:842:1: ( ( (lv_transitionNumer_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_guards_2_0= ruleGuard ) )* otherlv_3= '-->' ( (lv_assignments_4_0= ruleAssignment ) )* )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:842:2: ( (lv_transitionNumer_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_guards_2_0= ruleGuard ) )* otherlv_3= '-->' ( (lv_assignments_4_0= ruleAssignment ) )*
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:842:2: ( (lv_transitionNumer_0_0= RULE_STRING ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:843:1: (lv_transitionNumer_0_0= RULE_STRING )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:843:1: (lv_transitionNumer_0_0= RULE_STRING )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:844:3: lv_transitionNumer_0_0= RULE_STRING
            {
            lv_transitionNumer_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTransition1808); 

            			newLeafNode(lv_transitionNumer_0_0, grammarAccess.getTransitionAccess().getTransitionNumerSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"transitionNumer",
                    		lv_transitionNumer_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleTransition1825); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getColonKeyword_1());
                
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:864:1: ( (lv_guards_2_0= ruleGuard ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:865:1: (lv_guards_2_0= ruleGuard )
            	    {
            	    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:865:1: (lv_guards_2_0= ruleGuard )
            	    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:866:3: lv_guards_2_0= ruleGuard
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardsGuardParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGuard_in_ruleTransition1846);
            	    lv_guards_2_0=ruleGuard();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"guards",
            	            		lv_guards_2_0, 
            	            		"Guard");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleTransition1859); 

                	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3());
                
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:886:1: ( (lv_assignments_4_0= ruleAssignment ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:887:1: (lv_assignments_4_0= ruleAssignment )
            	    {
            	    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:887:1: (lv_assignments_4_0= ruleAssignment )
            	    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:888:3: lv_assignments_4_0= ruleAssignment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTransitionAccess().getAssignmentsAssignmentParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleTransition1880);
            	    lv_assignments_4_0=ruleAssignment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"assignments",
            	            		lv_assignments_4_0, 
            	            		"Assignment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleGuard"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:912:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:913:2: (iv_ruleGuard= ruleGuard EOF )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:914:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard1917);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard1927); 

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
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:921:1: ruleGuard returns [EObject current=null] : ( ( (lv_variable_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:924:28: ( ( ( (lv_variable_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:925:1: ( ( (lv_variable_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:925:1: ( ( (lv_variable_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:925:2: ( (lv_variable_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:925:2: ( (lv_variable_0_0= RULE_STRING ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:926:1: (lv_variable_0_0= RULE_STRING )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:926:1: (lv_variable_0_0= RULE_STRING )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:927:3: lv_variable_0_0= RULE_STRING
            {
            lv_variable_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGuard1969); 

            			newLeafNode(lv_variable_0_0, grammarAccess.getGuardAccess().getVariableSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGuardRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variable",
                    		lv_variable_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleGuard1986); 

                	newLeafNode(otherlv_1, grammarAccess.getGuardAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:947:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:948:1: (lv_value_2_0= RULE_STRING )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:948:1: (lv_value_2_0= RULE_STRING )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:949:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGuard2003); 

            			newLeafNode(lv_value_2_0, grammarAccess.getGuardAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGuardRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

            }


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
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleAssignment"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:973:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:974:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:975:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment2044);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment2054); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:982:1: ruleAssignment returns [EObject current=null] : ( ( (lv_variable_0_0= RULE_STRING ) ) otherlv_1= '\\'=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:985:28: ( ( ( (lv_variable_0_0= RULE_STRING ) ) otherlv_1= '\\'=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:986:1: ( ( (lv_variable_0_0= RULE_STRING ) ) otherlv_1= '\\'=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:986:1: ( ( (lv_variable_0_0= RULE_STRING ) ) otherlv_1= '\\'=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:986:2: ( (lv_variable_0_0= RULE_STRING ) ) otherlv_1= '\\'=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:986:2: ( (lv_variable_0_0= RULE_STRING ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:987:1: (lv_variable_0_0= RULE_STRING )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:987:1: (lv_variable_0_0= RULE_STRING )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:988:3: lv_variable_0_0= RULE_STRING
            {
            lv_variable_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssignment2096); 

            			newLeafNode(lv_variable_0_0, grammarAccess.getAssignmentAccess().getVariableSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variable",
                    		lv_variable_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleAssignment2113); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getApostropheEqualsSignKeyword_1());
                
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:1008:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:1009:1: (lv_value_2_0= RULE_STRING )
            {
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:1009:1: (lv_value_2_0= RULE_STRING )
            // ../org.xtext.tesis.sal/src-gen/org/xtext/tesis/parser/antlr/internal/InternalSAL.g:1010:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssignment2130); 

            			newLeafNode(lv_value_2_0, grammarAccess.getAssignmentAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

            }


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
    // $ANTLR end "ruleAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleContext_in_entryRuleContext75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContext85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContext127 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleContext144 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleBody_in_ruleContext165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleBody248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeDeclaration_in_ruleBody269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleModuleDeclaration_in_ruleBody290 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBody302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDeclaration_in_entryRuleTypeDeclaration338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDeclaration348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeDeclaration390 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTypeDeclaration407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeDeclaration424 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTypeDeclaration441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleDeclaration_in_entryRuleModuleDeclaration477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleDeclaration487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModuleDeclaration529 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleModuleDeclaration546 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleModule_in_ruleModuleDeclaration567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModule650 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_ruleDeclarations_in_ruleModule671 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModule683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarations_in_entryRuleDeclarations719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarations729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDeclarations767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVarDecl_in_ruleDeclarations788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDeclarations808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVarDecl_in_ruleDeclarations829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDeclarations849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVarDecl_in_ruleDeclarations870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDeclarations890 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleDeclarations911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDeclarations931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInitialisation_in_ruleDeclarations952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDeclarations972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleDeclarations993 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDeclarations1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl1042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVarDecl1094 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleVarDecl1111 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_ruleValueSet_in_ruleVarDecl1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSet_in_entryRuleValueSet1168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueSet1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalar_in_ruleValueSet1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubrange_in_ruleValueSet1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalar_in_entryRuleScalar1287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalar1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScalar1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubrange_in_entryRuleSubrange1378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubrange1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSubrange1425 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSubrange1442 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSubrange1459 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSubrange1476 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSubrange1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition1530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDefinition1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialisation_in_entryRuleInitialisation1617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitialisation1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInitialisation1669 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleInitialisation1686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInitialisation1703 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleInitialisation1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition1756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTransition1808 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTransition1825 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleGuard_in_ruleTransition1846 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_30_in_ruleTransition1859 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleTransition1880 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard1917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGuard1969 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleGuard1986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGuard2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment2044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssignment2096 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleAssignment2113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssignment2130 = new BitSet(new long[]{0x0000000000000002L});

}