{
  pkgs ? import <nixpkgs> { },
}:
pkgs.mkShell {
  packages = with pkgs; [
    jdk21
  ];
  shellHook = ''
    export JDK21=${pkgs.jdk21}
    export JDK25=${pkgs.jdk25}
  '';
}
