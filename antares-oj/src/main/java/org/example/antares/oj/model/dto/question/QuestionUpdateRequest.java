package org.example.antares.oj.model.dto.question;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * 更新请求
 */
@Data
public class QuestionUpdateRequest implements Serializable {


    /**
     * id
     */
    @Min(1)
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 标签列表
     */
    @NotNull
    private List<String> tags;

    /**
     * 题目答案
     */
    private String answer;

    /**
     * 判题用例
     */
    @NotNull
    private List<JudgeCase> judgeCase;

    /**
     * 判题配置
     */
    @NotNull
    private JudgeConfig judgeConfig;

    private static final long serialVersionUID = 1L;
}