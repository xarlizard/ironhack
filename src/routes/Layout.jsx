import React from "react";
import { Outlet } from "react-router";
import Header from "../components/Header";
import { Container } from "react-bootstrap";

const Layout = () => {
  return (
    <div>
      <Header />
      <Container>
        <Outlet />
      </Container>
    </div>
  );
};

export default Layout;
