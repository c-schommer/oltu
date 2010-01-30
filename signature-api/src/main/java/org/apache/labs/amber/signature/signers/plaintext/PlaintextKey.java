/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.labs.amber.signature.signers.plaintext;

import org.apache.labs.amber.signature.signers.AbstractKey;
import org.apache.labs.amber.signature.signers.SignatureMethod;
import org.apache.labs.amber.signature.signers.SigningKey;
import org.apache.labs.amber.signature.signers.VerifyingKey;

/**
 * PLAINTEXT key implementation.
 *
 * @version $Id$
 */
@SignatureMethod("PLAINTEXT")
public final class PlaintextKey extends AbstractKey implements SigningKey, VerifyingKey {

    /**
     * Instantiate an PLAINTEXT key with the consumer secret string
     * representation.
     *
     * @param keyValue the consumer secret string representation.
     */
    public PlaintextKey(String keyValue) {
        super(keyValue);
    }

}
