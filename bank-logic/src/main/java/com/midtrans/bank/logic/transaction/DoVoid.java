package com.midtrans.bank.logic.transaction;

import com.midtrans.bank.core.model.Transaction;
import com.midtrans.bank.core.model.VoidTxn;
import com.midtrans.bank.core.transaction.BankTxnSupport;
import org.jpos.transaction.Context;

/**
 * Created with IntelliJ IDEA.
 * User: shaddiqa
 * Date: 9/9/13
 * Time: 12:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class DoVoid extends BankTxnSupport {
    @Override
    protected int doPrepare(long id, Context ctx) throws Exception {
        Transaction txn = (Transaction) ctx.get(TXN);
        VoidTxn voidTxn = (VoidTxn) ctx.get(VOID_TXN);

        txn.modifyVoidAmount(voidTxn);

        ctx.put(VALAFTER, txn.calcSettleAmount());

        ctx.put(TXN, txn);

        return PREPARED | NO_JOIN;
    }
}
