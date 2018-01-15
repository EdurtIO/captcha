/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wikift.captcha.enums;

/**
 * 计算公式枚举 <br/>
 * 描述 : 计算公式枚举 <br/>
 * 作者 : qianmoQ <br/>
 * 版本 : 1.0 <br/>
 * 创建时间 : 2018-01-15 14:14:38 <br/>
 * 联系作者 : <a href="mailTo:shichengoooo@163.com">qianmoQ</a>
 */
public enum CalculateEnum {

    ADD("+", "加"),
    SUBTRACT("-", "减"),
    MULTIPLY("*", "乘"),
    DIVIDE("÷", "除"),
    EQUAL("=", "等");

    private final String value_en;
    private final String value_zh;

    CalculateEnum(String value_en, String value_zh) {
        this.value_en = value_en;
        this.value_zh = value_zh;
    }

    public String getValueEn() {
        return value_en;
    }

    public String getValueZh() {
        return value_zh;
    }

}