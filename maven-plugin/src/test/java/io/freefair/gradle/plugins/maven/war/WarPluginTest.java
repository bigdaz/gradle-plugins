package io.freefair.gradle.plugins.maven.war;

import io.freefair.gradle.plugins.maven.war.WarArchiveClassesPlugin;
import io.freefair.gradle.plugins.maven.war.WarAttachClassesPlugin;
import io.freefair.gradle.plugins.maven.war.WarOverlayPlugin;
import io.freefair.gradle.plugins.maven.war.WarPlugin;
import org.gradle.api.Project;
import org.gradle.testfixtures.ProjectBuilder;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WarPluginTest {

    private Project project;

    @Before
    public void setUp() {
        project = ProjectBuilder.builder().build();
    }

    @Test
    public void apply() {

        project.getPlugins().apply(WarPlugin.class);

        assertThat(project.getPlugins().hasPlugin(org.gradle.api.plugins.WarPlugin.class)).isTrue();
        assertThat(project.getPlugins().hasPlugin(WarOverlayPlugin.class)).isTrue();
        assertThat(project.getPlugins().hasPlugin(WarArchiveClassesPlugin.class)).isTrue();
        assertThat(project.getPlugins().hasPlugin(WarAttachClassesPlugin.class)).isTrue();
    }
}