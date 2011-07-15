/*
 * Copyright (C) 2010-2011, FuseSource Corp.  All rights reserved.
 *
 * 	http://fusesource.com
 *
 * The software in this package is published under the terms of the
 * CDDL license, a copy of which has been included with this distribution
 * in the license.txt file.
 */

package org.fusesource.fabric.apollo.amqp.api;

import org.fusesource.fabric.apollo.amqp.codec.interfaces.Outcome;
import org.fusesource.fabric.apollo.amqp.codec.types.ReceiverSettleMode;

/**
 *
 */
public interface Receiver {

    public void setMessageHandler(MessageHandler handler);

    public void setFlowControlHandler(FlowControlHandler handler);

    public void setSettleMode(ReceiverSettleMode mode);

    public void settle(long deliveryId, Outcome outcome);
}
