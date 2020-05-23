package cj.netos.oc.wybank;

import org.apache.curator.framework.CuratorFramework;

public interface ICuratorPathChecker {
    void check(CuratorFramework framework, String path) throws Exception;
}
