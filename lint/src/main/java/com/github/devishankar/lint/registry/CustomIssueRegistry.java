package com.github.devishankar.lint.registry;

import com.android.tools.lint.client.api.IssueRegistry;
import com.android.tools.lint.detector.api.ApiKt;
import com.android.tools.lint.detector.api.Issue;
import com.github.devishankar.lint.detectors.ExampleAttrDetector;
import com.github.devishankar.lint.detectors.MinSdkDetector;

import java.util.Arrays;
import java.util.List;

/**
 * The list of issues that will be checked when running <code>lint</code>.
 */
@SuppressWarnings("unused")
public class CustomIssueRegistry extends IssueRegistry {

    private List<Issue> mIssues = Arrays.asList(MinSdkDetector.ISSUE, ExampleAttrDetector.ISSUE
    );

    public CustomIssueRegistry() {
    }

    @Override
    public List<Issue> getIssues() {
        return mIssues;
    }

    @Override
    public int getApi() {
        return ApiKt.CURRENT_API;
    }
}
