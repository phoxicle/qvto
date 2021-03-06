/*
 * «codeGenHelper.getCopyright(' * ')»
 *************************************************************************
 * This code is 100% auto-generated
 * using: org.eclipse.ocl.examples.codegen.java.JavaStream
 *
 * Do not edit it.
 */

package org.eclipse.qvto.examples.xtext.imperativeocl.cs2as;

import org.eclipse.ocl.examples.domain.types.IdResolver;
import org.eclipse.ocl.examples.xtext.base.cs2as.CS2Pivot;
import org.eclipse.ocl.examples.xtext.base.cs2as.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.cs2as.Continuation;
import org.eclipse.ocl.examples.xtext.essentialocl.cs2as.EssentialOCLCSContainmentVisitor;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.AssertExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.AssignStatementCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.BlockExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.ComputeExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.DictLiteralExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.DictLiteralPartCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.DictTypeCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.DoExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.ExceptCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.ExpressionBlockCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.ExpressionStatementCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.ForExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.ImperativeIterateExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.ImperativeLoopExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.InstantiationExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.ListLiteralExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.ListTypeCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.LogExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.QuitExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.RaiseExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.ReturnExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.StatementCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.SwitchAltCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.SwitchExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.TryExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.VariableInitializationCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.WhileExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.util.ImperativeOCLCSVisitor;

public class AutoImperativeOCLCSContainmentVisitor
	extends EssentialOCLCSContainmentVisitor
	implements ImperativeOCLCSVisitor<Continuation<?>>
{
    
    protected final /*@NonNull*/ CS2Pivot converter;
    protected final /*@NonNull*/ IdResolver idResolver;
    
    /**
     * Initializes me with an initial value for my result.
     * 
     * @param context my initial result value
     */
    public AutoImperativeOCLCSContainmentVisitor(/*@NonNull*/ CS2PivotConversion context) {
        super(context);
        this.converter = context.getConverter();
        this.idResolver = converter.getMetaModelManager().getIdResolver();
    }
    
    public /*@Nullable*/ Continuation<?> visitAssertExpCS(/*@NonNull*/ AssertExpCS self) {
        throw new UnsupportedOperationException("visitAssertExpCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitAssignStatementCS(/*@NonNull*/ AssignStatementCS self) {
        throw new UnsupportedOperationException("visitAssignStatementCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitBlockExpCS(/*@NonNull*/ BlockExpCS self) {
        throw new UnsupportedOperationException("visitBlockExpCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitDictLiteralExpCS(/*@NonNull*/ DictLiteralExpCS self) {
        throw new UnsupportedOperationException("visitDictLiteralExpCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitDictLiteralPartCS(/*@NonNull*/ DictLiteralPartCS self) {
        throw new UnsupportedOperationException("visitDictLiteralPartCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitDictTypeCS(/*@NonNull*/ DictTypeCS self) {
        throw new UnsupportedOperationException("visitDictTypeCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitComputeExpCS(/*@NonNull*/ ComputeExpCS self) {
        throw new UnsupportedOperationException("visitComputeExpCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitImperativeIterateExpCS(/*@NonNull*/ ImperativeIterateExpCS self) {
        throw new UnsupportedOperationException("visitImperativeIterateExpCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitImperativeLoopExpCS(/*@NonNull*/ ImperativeLoopExpCS self) {
        throw new UnsupportedOperationException("visitImperativeLoopExpCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitInstantiationExpCS(/*@NonNull*/ InstantiationExpCS self) {
        throw new UnsupportedOperationException("visitInstantiationExpCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitDoExpCS(/*@NonNull*/ DoExpCS self) {
        throw new UnsupportedOperationException("visitDoExpCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitExceptCS(/*@NonNull*/ ExceptCS self) {
        throw new UnsupportedOperationException("visitExceptCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitExpressionBlockCS(/*@NonNull*/ ExpressionBlockCS self) {
        throw new UnsupportedOperationException("visitExpressionBlockCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitExpressionStatementCS(/*@NonNull*/ ExpressionStatementCS self) {
        throw new UnsupportedOperationException("visitExpressionStatementCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitForExpCS(/*@NonNull*/ ForExpCS self) {
        throw new UnsupportedOperationException("visitForExpCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitListTypeCS(/*@NonNull*/ ListTypeCS self) {
        throw new UnsupportedOperationException("visitListTypeCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitListLiteralExpCS(/*@NonNull*/ ListLiteralExpCS self) {
        throw new UnsupportedOperationException("visitListLiteralExpCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitLogExpCS(/*@NonNull*/ LogExpCS self) {
        throw new UnsupportedOperationException("visitLogExpCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitQuitExpCS(/*@NonNull*/ QuitExpCS self) {
        throw new UnsupportedOperationException("visitQuitExpCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitRaiseExpCS(/*@NonNull*/ RaiseExpCS self) {
        throw new UnsupportedOperationException("visitRaiseExpCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitReturnExpCS(/*@NonNull*/ ReturnExpCS self) {
        throw new UnsupportedOperationException("visitReturnExpCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitStatementCS(/*@NonNull*/ StatementCS self) {
        throw new UnsupportedOperationException("visitStatementCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitSwitchAltCS(/*@NonNull*/ SwitchAltCS self) {
        throw new UnsupportedOperationException("visitSwitchAltCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitSwitchExpCS(/*@NonNull*/ SwitchExpCS self) {
        throw new UnsupportedOperationException("visitSwitchExpCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitTryExpCS(/*@NonNull*/ TryExpCS self) {
        throw new UnsupportedOperationException("visitTryExpCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitVariableInitializationCS(/*@NonNull*/ VariableInitializationCS self) {
        throw new UnsupportedOperationException("visitVariableInitializationCS is not supported by " + getClass().getName());
    }
    
    public /*@Nullable*/ Continuation<?> visitWhileExpCS(/*@NonNull*/ WhileExpCS self) {
        throw new UnsupportedOperationException("visitWhileExpCS is not supported by " + getClass().getName());
    }
}
