package edu.pjatk.inn.coffeemaker;

import sorcer.service.Context;
import sorcer.service.ContextException;

import java.rmi.RemoteException;

public interface FeedbackService {
    Context giveFeedback(Context context) throws ContextException, RemoteException;

    Context getAllFeedbacksForRecipe(Context context) throws ContextException, RemoteException;
}
