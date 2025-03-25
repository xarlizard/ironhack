import React from "react";
import HeroSection from "../components/HeroSection";
import LogosSection from "../components/LogosSection";
import ProjectsRow from "../components/ProjectsRow";
import Testimonials from "../components/Testimonials";
import ServicesRow from "../components/ServicesRow";

const Home = () => {
  return (
    <div>
      <HeroSection />
      <LogosSection />
      <ProjectsRow />
      <Testimonials />
      <ServicesRow />
      {/* Other sections */}
    </div>
  );
};

export default Home;
