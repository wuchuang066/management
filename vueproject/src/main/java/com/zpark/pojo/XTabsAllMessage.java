package com.zpark.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author wuc
 * @date 2019/7/2 16:32
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class XTabsAllMessage {

    private String message;

    private boolean showHeader;

    private List<XTabsMessage> unread;

    private List<XTabsMessage> read;

    private List<XTabsMessage> recycle;

}
