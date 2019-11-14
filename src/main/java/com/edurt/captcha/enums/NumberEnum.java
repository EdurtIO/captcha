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
package com.edurt.captcha.enums;

/**
 * 计算数据枚举 <br/>
 * 描述 : 计算数据枚举  <br/>
 * 作者 : qianmoQ <br/>
 * 版本 : 1.0 <br/>
 * 创建时间 : 2018-01-15 14:15:15 <br/>
 * 联系作者 : <a href="mailTo:shichengoooo@163.com">qianmoQ</a>
 */
public enum NumberEnum {

    ONE("1", "壹"),
    TWO("2", "贰"),
    THREE("3", "叁"),
    FOUR("4", "肆"),
    FIVE("5", "伍"),
    SIX("6", "陆"),
    SEVEN("7", "柒"),
    EIGHT("8", "捌"),
    NINE("9", "玖"),
    ZERO("0", "零");

    private final String value_en;
    private final String value_zh;

    NumberEnum(String value_en, String value_zh) {
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
